package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
@EnableBinding(Sink.class)
public class SpringCloudDataFlowSinkApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringCloudDataFlowSinkApplication.class);
	
	@StreamListener(Sink.INPUT)
	public void loggerSink(String date) {
		
		logger.info("Sink Received: " + date);
	}
	
	
	
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDataFlowSinkApplication.class, args);
    }
}
