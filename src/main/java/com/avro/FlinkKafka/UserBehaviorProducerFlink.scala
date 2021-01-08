package com.avro.FlinkKafka

import com.avro.AvroUtil.SimpleAvroSchemaFlink
import com.avro.bean.UserBehavior
import org.apache.flink.streaming.api.scala._
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaProducer011

import java.util.Properties

/**
 * @Package com.avro.FlinkKafka
 * @File ：UserBehaviorProducerFlink.java
 * @author 大数据老哥
 * @date 2021/1/8 21:38
 * @version V1.0
 */
object UserBehaviorProducerFlink {
  def main(args: Array[String]): Unit = {
    val env = StreamExecutionEnvironment.getExecutionEnvironment
    val value = env.readTextFile("./data/UserBehavior.csv")
    val users: DataStream[UserBehavior] = value.map(row => {
      val arr = row.split(",")
      val behavior = new UserBehavior()
      behavior.setUserId(arr(0).toLong)
      behavior.setItemId(arr(1).toLong)
      behavior.setCategoryId(arr(2).toInt)
      behavior.setBehavior(arr(3))
      behavior.setTimestamp(arr(4).toLong)
      behavior
    })
    val prop = new Properties()
    prop.setProperty("bootstrap.servers", "node01:9092,node02:9092,node03:9092")
    //4.连接Kafka
    val producer: FlinkKafkaProducer011[UserBehavior] = new FlinkKafkaProducer011[UserBehavior]("UserBehaviorKafka", new SimpleAvroSchemaFlink(), prop)
    //5.将数据打入kafka
    users.addSink(producer)
    //6.执行任务
    env.execute("UserBehaviorProducerFlink")
  }
}
