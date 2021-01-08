package com.avro.kafka;
import com.avro.bean.UserBehavior;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * @author 大数据老哥
 * @version V1.0
 * @Package com.avro.kafka
 * @File ：UserBehaviorProducerKafka.java
 * @date 2021/1/8 20:14
 */

public class UserBehaviorProducerKafka {
    public static void main(String[] args) throws InterruptedException {
        // 获取数据
        List<UserBehavior> data = getData();
        System.out.println(data);
        // 创建配置文件
        Properties props = new Properties();
        props.setProperty("bootstrap.servers", "192.168.100.201:9092,192.168.100.202:9092,192.168.100.203:9092");
        props.setProperty("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.setProperty("value.serializer", "com.avro.AvroUtil.SimpleAvroSchemaJava");
        // 创建kafka的生产者
        KafkaProducer<String, UserBehavior> userBehaviorProducer = new KafkaProducer<String, UserBehavior>(props);
        // 循环遍历数据
        for (UserBehavior userBehavior : data) {
            ProducerRecord<String, UserBehavior> producerRecord = new ProducerRecord<String, UserBehavior>("UserBehaviorKafka", userBehavior);
            userBehaviorProducer.send(producerRecord);
            System.out.println("数据写入成功"+data);
            Thread.sleep(1000);
        }
    }

    public static List<UserBehavior> getData() {
        ArrayList<UserBehavior> userBehaviors = new ArrayList<UserBehavior>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("data/UserBehavior.csv")));
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] split = line.split(",");
             userBehaviors.add( new UserBehavior(Long.parseLong(split[0]), Long.parseLong(split[1]), Integer.parseInt(split[2]), split[3], Long.parseLong(split[4])));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userBehaviors;
    }
}
