package example.showcase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import example.showcase.service.ConsumerShowcaseService;


@RestController
@RequestMapping(value = "/myshowcase", produces = MediaType.APPLICATION_JSON_VALUE)
public class ConsumerShowcaseController {

    private final ConsumerShowcaseService service;

    
    @Autowired
    public ConsumerShowcaseController(ConsumerShowcaseService service) {
        
    	this.service = service;
    }
    
    @GetMapping("/all")
    //@RequestMapping(method = RequestMethod.GET)
    public String getAllProducts() {
    	System.out.println("**************************************************************************");
        
    	
    	return service.getAllProductsOfShowcase();
    }
}