package step2;

public class Product {

    //속성
    private String name;
    private int price;
    private String description;
    private int stock;




    //생성자
    public Product(String name,int price,String description,int stock ){
        this.name=name;
        this.price=price;
        this.description=description;
        this.stock=stock;

    }





    //기능


    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getStock() {
        return stock;
    }
}
