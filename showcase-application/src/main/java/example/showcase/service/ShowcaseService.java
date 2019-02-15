package example.showcase.service;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import example.showcase.model.Product;

@Service
public class ShowcaseService {

    //@Autowired
    //private ShowcaseRepository showcaseRepository;
	
    public Product findById(Integer id){        
    	//return showcaseRepository.findOne(id);
        Product product = new Product();
        product.setId(id);
    	product.setCode( UUID.randomUUID().toString() );
    	product.setPrice(1550.00);
    	product.setProduct("Produto XYZ");
        return product;
    }

    public Iterable<Product> findAll(){
    	//return showcaseRepository.findAll();    	
    	ArrayList<Product> products = new ArrayList<>(); 
    	Product product = new Product();
        product.setId(1);
    	product.setCode( UUID.randomUUID().toString() );
    	product.setPrice(1550.00);
    	product.setProduct("Produto XYZ");
        Product product2 = new Product();
        product2.setId(2);
    	product2.setCode( UUID.randomUUID().toString() );
    	product2.setPrice(7000.00);
    	product2.setProduct("Produto ABC");
    	products.add(product);
    	products.add(product2);
    	return products;
    }
    
    public Product save(@Validated Product product) {
    	product.setCode( UUID.randomUUID().toString() );
        //return showcaseRepository.save(product);
    	product.setId(1);
        return product;
    }

    public void delete(Integer id) {
        //showcaseRepository.delete(id);
    }
}
