package step3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {


    public static void main(String[] args) {



        List<Product> products = new ArrayList<>();
        products.add(new Product("Galaxy S25", 1200000, "최신형 안드로이드 스마트폰", 5));
        products.add(new Product("iPhone 16", 1350000, "Apple의 최신 스마트폰", 10));
        products.add(new Product("MacBook Pro", 2400000, "M3 칩셋이 탑재된 노트북", 15));
        products.add(new Product("AirPods Pro", 350000, "노이즈 캔슬링 무선 이어폰", 20));

        List<Product> clothes= new ArrayList<>();
        List<Product> foods = new ArrayList<>();

        List<Category> categories = new ArrayList<>();
        categories.add(new Category("전자제품",products));
        categories.add(new Category("의류",clothes));
        categories.add(new Category("식품",foods));




        Scanner sc = new Scanner(System.in);
        CommerceSystem c = new CommerceSystem(categories , sc);

        c.start();







    }
}

//while 문