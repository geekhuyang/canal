package com.alibaba.otter.canal.client.running.kafka;

import org.junit.Assert;

/**
 * Kafka 测试基类
 *
 * @author machengyuan @ 2018-6-12
 * @version 1.0.0
 */
public abstract class AbstractKafkaTest {

    public static String  topic     = "example";
    public static Integer partition = 1;
    public static String  groupId   = "g4";
    public static String  servers   = "10.135.248.214:9092,10.135.248.226:9092,10.30.141.93:9092";
    public static String  zkServers = "10.135.248.214:2181,10.135.248.226:2181,10.30.141.93:2181";

    public void sleep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            Assert.fail(e.getMessage());
        }
    }
}
