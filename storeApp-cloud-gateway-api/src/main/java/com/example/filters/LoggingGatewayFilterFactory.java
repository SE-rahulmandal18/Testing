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
public class LoggingGatewayFilterFactory extends AbstractGatewayFilterFactory<LoggingGatewayFilterFactory.Config> {

	private final Logger logger = LoggerFactory.getLogger(LoggingGatewayFilterFactory.class);
	
	public LoggingGatewayFilterFactory() {
		super(Config.class);
	}
	
	@Override
	public GatewayFilter apply(Config config) {
		
		return (exchange, chain) -> {
			
			//pre-processing
			if(config.preLogger) {
				logger.info("Pre GatewayFiler Logging: " + config.baseMessage);
			}
			
			return chain.filter(exchange).then(Mono.fromRunnable(() -> {
				//Post-processing
				if(config.postLogger) {
					logger.info("Post GatewayFiler Logging: " + config.baseMessage);
				}
			}));
		};
	   
	}
	
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public static class Config {
		
		//Specify your configuration
		private String baseMessage;
		private boolean preLogger;
		private boolean postLogger;
	}


}
	
	

