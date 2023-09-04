package com.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.annotation.Transformer;

@SpringBootApplication
@EnableBinding(Source.class)
public class SpringCloudDataFlowApplication {

	@Transformer(inputChannel = Processor.INPUT, outputChannel = Processor.OUTPUT)
	public Object transform(Long date) {
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		return dateFormat.format(date);
		
	}
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDataFlowApplication.class, args);
    }
}
