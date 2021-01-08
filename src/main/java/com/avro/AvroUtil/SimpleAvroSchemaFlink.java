package com.avro.AvroUtil;

import com.avro.bean.UserBehavior;
import com.typesafe.sslconfig.ssl.FakeChainedKeyStore;
import org.apache.avro.io.BinaryDecoder;
import org.apache.avro.io.BinaryEncoder;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;
import org.apache.flink.api.common.serialization.DeserializationSchema;
import org.apache.flink.api.common.serialization.SerializationSchema;
import org.apache.flink.api.common.typeinfo.TypeInformation;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serializer;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/**
 * @author 大数据老哥
 * @version V1.0
 * @Package com.avro.AvroUtil
 * @File ：SimpleAvroSchemaFlink.java
 * @date 2021/1/8 20:02
 */

/**
 *  自定义序列化和反序列化
 */
public class SimpleAvroSchemaFlink implements DeserializationSchema<UserBehavior>, SerializationSchema<UserBehavior> {


    @Override
    public byte[] serialize(UserBehavior userBehavior) {
        // 创建序列化执行器
        SpecificDatumWriter<UserBehavior> writer = new SpecificDatumWriter<UserBehavior>(userBehavior.getSchema());
        // 创建一个流 用存储序列化后的二进制文件
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        // 创建二进制编码器
        BinaryEncoder encoder = EncoderFactory.get().directBinaryEncoder(out, null);
        try {
            // 数据入都流中
            writer.write(userBehavior, encoder);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return out.toByteArray();
    }

    @Override
    public TypeInformation<UserBehavior> getProducedType() {
      return TypeInformation.of(UserBehavior.class);
    }

    @Override
    public UserBehavior deserialize(byte[] bytes) throws IOException {
        // 用来保存结果数据
        UserBehavior userBehavior = new UserBehavior();
        // 创建输入流用来读取二进制文件
        ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(bytes);
        // 创建输入序列化执行器
        SpecificDatumReader<UserBehavior> stockSpecificDatumReader = new SpecificDatumReader<UserBehavior>(userBehavior.getSchema());
        //创建二进制解码器
        BinaryDecoder binaryDecoder = DecoderFactory.get().directBinaryDecoder(arrayInputStream, null);
        try {
            // 数据读取
            userBehavior=stockSpecificDatumReader.read(null, binaryDecoder);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 结果返回
        return userBehavior;
    }

    @Override
    public boolean isEndOfStream(UserBehavior userBehavior) {
        return false;
    }
}
