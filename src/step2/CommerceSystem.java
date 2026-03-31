package step2;

import java.util.List;
import java.util.Scanner;

public class CommerceSystem {


    //속성
    private List<Product> products;
    private Scanner sc;


    //생성자
    public CommerceSystem(List<Product> products,Scanner sc) {
        this.products = products;
        this.sc = sc;
    }


    //기능

    public void start() {

        System.out.println("[ 실시간 커머스 플랫폼 - 전자제품 ]");

        while (true) {
            int productNum = 1;
            for (Product product : products) {
                System.out.println(productNum + ". " +
                        product.getName() + " | " +
                        product.getPrice() + " | " +
                        product.getDescription() + " | " +
                        product.getStock());
                productNum++;
            }
            System.out.println("0. 종료           |프로그램 종료");
            System.out.print("번호를 입력해주세요: ");
            int selectedNumber = sc.nextInt();
            if (selectedNumber == 0) {
                System.out.println(" 커머스 플랫폼을 종료하겠습니다. ");
                break;
            }


        }

    }
}
