package example.showcase.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.showcase.client.ShowcaseAppClient;

@Service
public class ConsumerShowcaseService {

    private final ShowcaseAppClient showcaseAppClient;
    

    @Autowired
    public ConsumerShowcaseService(ShowcaseAppClient showcaseAppClient) {
        this.showcaseAppClient = showcaseAppClient;
    }

    public String getAllProductsOfShowcase() {
        String showcase = showcaseAppClient.getRandomShowcase();
        return ">>>>> " + showcase; 
    }
}