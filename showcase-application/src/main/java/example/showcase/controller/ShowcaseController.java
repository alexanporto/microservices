package example.showcase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import example.showcase.model.Product;
import example.showcase.service.ShowcaseService;

@RestController
@RequestMapping(value = "/api/showcase", produces = MediaType.APPLICATION_JSON_VALUE)
public class ShowcaseController {

    @Autowired
    private ShowcaseService showcaseService;

    
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Product> save(@RequestBody  Product order){
        return ResponseEntity.ok(showcaseService.save(order));
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Product> findById(@PathVariable("id") Integer id){
        return ResponseEntity.ok(showcaseService.findById(id));
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Iterable<Product>> findAll(){
        return ResponseEntity.ok().body(showcaseService.findAll());
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> delete(@PathVariable("id") Integer id){
        showcaseService.delete(id);
        return ResponseEntity.ok().build();
    }
}
