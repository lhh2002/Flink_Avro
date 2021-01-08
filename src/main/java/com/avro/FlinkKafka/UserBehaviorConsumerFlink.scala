package com.avro.FlinkKafka

import com.avro.AvroUtil.{SimpleAvroSchemaFlink}
import com.avro.bean.UserBehavior
import org.apache.flink.streaming.api.scala._
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer011

import java.util.Properties

/**
 * @Package com.avro.FlinkKafka
 * @File ：UserBehaviorConsumerFlink.java
 * @author 大数据老哥
 * @date 2021/1/8 21:18
 * @version V1.0
 */
object UserBehaviorConsumerFlink {
  def main(args: Array[String]): Unit = {
    //1.构建流处理运行环境
    val env = StreamExecutionEnvironment.getExecutionEnvironment
    env.setParallelism(1) // 设置并行度1 方便后面测试
    // 2.设置kafka 配置信息
    val prop = new Properties
    prop.put("bootstrap.servers", "192.168.100.201:9092,192.168.100.202:9092,192.168.100.203:9092")
    prop.put("group.id", "UserBehavior")
    prop.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer")
    // 设置反序列化类为自定义的avro反序列化类
    prop.put("value.deserializer", "com.avro.AvroUtil.SimpleAvroSchemaFlink")

    //    val kafka: FlinkKafkaConsumer011[String] =  new FlinkKafkaConsumer011[String]("UserBehavior", new SimpleStringSchema(), prop)
    // 3.构建Kafka 连接器
    val kafka: FlinkKafkaConsumer011[UserBehavior] = new FlinkKafkaConsumer011[UserBehavior]("UserBehaviorKafka", new SimpleAvroSchemaFlink(), prop)

    //4.设置Flink层最新的数据开始消费
    kafka.setStartFromLatest()
    //5.基于kafka构建数据源
    val data: DataStream[UserBehavior] = env.addSource(kafka)
    //6.结果打印
    data.print()
    env.execute("UserBehaviorConsumerFlink")
  }
}



