package example.showcase.model;

//import org.hibernate.validator.constraints.NotEmpty;
//import javax.persistence.*;
//import javax.validation.constraints.NotNull;
import java.io.Serializable;

//@Entity
//@Table(name = "name")
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    private String code;

    //@NotEmpty(message = "Product name required")
    private String name;

    //@NotNull(message = "Price required")
    private Double price;



    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProduct() {
        return name;
    }

    public void setProduct(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
