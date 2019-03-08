package test;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;

/**
 * @Author: cjh27
 * @Date: 2019/3/7
 */
public class Producer {


    /**
     * <p>
     * PullConsumer与PushConsumer：  主要区别在于Pull与Push的区别。对于PullConsumer，
     * 消费者会主动从broker中拉取消息进行消费。而对于PushConsumer，会封装包含消息获取、消息处理以及其他相关操作的接口给程序调用
     * （pull是主动订阅模式   push是被动接收消息 推送模式  ）
     * <p>
     *
     * <p>
     * Tag： Tag可以看做是一个子主题(sub-topic),可以进一步细化主题下的相关子业务。提高程序的灵活性和可扩展性
     * <p>
     *
     * <p>
     * Broker：  RocketMQ的核心组件之一。用来从生产者处接收消息，存储消息以及将消息推送给消费者。同时RocketMQ的broker也用来存储消息相关的数据，
     * 比如消费者组、消费处理的偏移量、主题以及消息队列等。Name Server： 可以看做是一个信息路由器。
     * 生产者和消费者从NameServer中查找对应的主题以及相应的broker
     * <p>
     */

    public static void main(String[] args) {

        String namesrvAddr = "";

        DefaultMQProducer producer = new DefaultMQProducer();
        producer.setNamesrvAddr(namesrvAddr);

        try {
            producer.start();


            //发一条
            Message msg = new Message("topic", "push", "xiaoxiao".getBytes());
            SendResult result = producer.send(msg);
            System.out.println("id:" + result.getMsgId() + " result:" + result.getSendStatus());


            //再发一条
            msg = new Message("PushTopic", "push", "2", "Just for push2.".getBytes());
            result = producer.send(msg);
            System.out.println("id:" + result.getMsgId() + " result:" + result.getSendStatus());


            //还发一条
            msg = new Message("PushTopic", "pull", "1", "Just for pull.".getBytes());
            result = producer.send(msg);
            System.out.println("id:" + result.getMsgId() + " result:" + result.getSendStatus());

        } catch (MQClientException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (RemotingException e) {
            e.printStackTrace();
        } catch (MQBrokerException e) {
            e.printStackTrace();
        } finally {
            producer.shutdown();

        }


    }
}
