package com.avro.kafka;
import com.avro.bean.UserBehavior;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import java.util.Arrays;
import java.util.Properties;

/**
 * @author 大数据老哥
 * @version V1.0
 * @Package com.avro.kafka
 * @File ：UserBehaviorConsumer.java
 * @date 2021/1/8 20:58
 */
public class UserBehaviorConsumer {

    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.put("bootstrap.servers", "192.168.100.201:9092,192.168.100.202:9092,192.168.100.203:9092");
        prop.put("group.id", "UserBehavior");
        prop.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        // 设置反序列化类为自定义的avro反序列化类
        prop.put("value.deserializer", "com.avro.AvroUtil.SimpleAvroSchemaJava");
        KafkaConsumer<String, UserBehavior> consumer = new KafkaConsumer<String, UserBehavior>(prop);
        consumer.subscribe(Arrays.asList("UserBehaviorKafka"));
        while (true) {
            ConsumerRecords<String, UserBehavior> poll = consumer.poll(1000);
            for (ConsumerRecord<String, UserBehavior> stringStockConsumerRecord : poll) {
                System.out.println(stringStockConsumerRecord.value());
            }
        }
    }
}
