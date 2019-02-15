package example.showcase.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ShowcaseAppClient {

    private final RestTemplate restTemplate;

    @Value("${app.showcaseApplication.serviceId}")
    private String showcaseApplicationId;

    @Value("${app.showcaseApplication.endpoint.showcase}")
    private String showcaseEndpointUri;
    
    
    @Autowired
    public ShowcaseAppClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getRandomShowcase() {
        String showcase = restTemplate.getForObject("http://showcase-application" + showcaseEndpointUri, String.class);
        return showcase;
    }
}