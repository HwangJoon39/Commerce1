package step3;

import java.util.List;

public class Category {


    //속성
    private String name;
    private List<Product> products;
    //생성자

    public Category(String name, List<Product> products) {
        this.name = name;
        this.products = products;

    }


    //기능


    public List<Product> getProducts() {return products;}

    public String getName() {
        return name;
    }
}
