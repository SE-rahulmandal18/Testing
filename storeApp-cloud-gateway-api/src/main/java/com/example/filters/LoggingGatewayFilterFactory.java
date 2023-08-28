package com.example.filters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import reactor.core.publisher.Mono;

@Component
public class LoggingGatewayFilterFactory extends AbstractGatewayFilterFactory<LoggingGatewayFilterFactory.Config>{

	private final Logger logger = LoggerFactory.getLogger(LoggingGatewayFilterFactory.class);
	
	public LoggingGatewayFilterFactory() {
		super(Config.class);
	}
	
	@Override
	public GatewayFilter apply(Config config) {
		return (exchange, chain) -> {
			
			//Pre-processing
			if(config.isPreLogger()) { 
				logger.info("Pre GatewayFiler Logging: " + config.getBaseMessage());
		}
		
		return chain.filter(exchange).then(Mono.fromRunnable(() -> {
			//Post-processing
			if(config.isPostLogger()) {
				logger.info("Post GatewayFiler Logging: " + config.getBaseMessage());
				}
		}));
	};
   
 
}
	
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	private static class Config {
		
		//Specify your configuration
		private String baseMessage;
		private boolean preLogger;
		private boolean postLogger;
		
	}
	
}
