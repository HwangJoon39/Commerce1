package step1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        List<Product> products = new ArrayList<>();
        products.add(new Product("Galaxy S25", 1200000, "최신형 안드로이드 스마트폰", 5));
        products.add(new Product("iPhone 16", 1350000, "Apple의 최신 스마트폰", 10));
        products.add(new Product("MacBook Pro", 2400000, "M3칩셋이 탑재된 노트북", 15));
        products.add(new Product("AirPods Pro", 350000, "노이즈 캔슬링 무선 이어폰", 20));

        System.out.println("[ 실시간 커머스 플랫폼 - 전자제품 ]");
        int productNum = 1;
        for (Product product : products) {
            System.out.println(productNum + ". " +
                    product.getName()+ " | " +
                    product.getPrice()+" | " +
                    product.getDescription()+" | "+
                    product.getStock());
            productNum++;
        }
        System.out.println("0. 종료           |프로그램 종료");
        System.out.print("번호를 입력해주세요: ");
        sc.nextInt();
        int num = 0;
        if (num == 0){
            System.out.println(" 커머스 플랫폼을 종료하겠습니다. ");}

    }
}

