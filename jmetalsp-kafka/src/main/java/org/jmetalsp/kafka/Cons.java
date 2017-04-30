package org.jmetalsp.kafka;

public class Cons {
   public static void main(String[] args) 
    {
	   Consumer consumerThread = new Consumer(KafkaProperties.TOPIC);
	   consumerThread.start();
    }
}
