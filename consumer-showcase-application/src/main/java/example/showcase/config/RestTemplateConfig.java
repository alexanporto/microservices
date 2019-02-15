package example.showcase.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@RibbonClient(name = "showcase-application")
public class RestTemplateConfig {

		
	@LoadBalanced
    @Bean
    public RestTemplate restTemplate() {
        
    	return new RestTemplate();
    }
}