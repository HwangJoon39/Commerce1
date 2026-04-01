package step3;

import java.util.List;
import java.util.Scanner;

public class CommerceSystem {


    //속성
    private List<Category> categories;
    private Scanner sc;
    private Category selectedCategory;

    //생성자
    public CommerceSystem(List<Category> categories, Scanner sc) {
        this.categories = categories;
        this.sc = sc;

    }


    //기능


    public void start() {

        //카테고리
        while (true) {
            System.out.println("[ 실시간 커머스 플랫폼 메인 ]");
            int categoryNumber = 1;
            for (Category category : categories) {
                System.out.println(categoryNumber + ". " +
                        category.getName());
                categoryNumber++;
            }
            System.out.println("0. 종료    | 프로그램 종료");
            System.out.print("번호를 입력해주세요: ");
            int selectCategory = sc.nextInt();
            if (selectCategory == 0) {
                System.out.println("커머스 플랫폼을 종료하겠습니다. ");
                break;
            } else {
                selectedCategory = categories.get(selectCategory - 1);
                System.out.println("[ " + selectedCategory.getName() + " 카테고리 ]");



                //product
                int productNumber = 1;
                for (Product product : selectedCategory.getProducts()) {
                    System.out.println(productNumber + ". " +
                            product.getName() + " | " +
                            product.getPrice() + " | " +
                            product.getDescription());
                    productNumber++;
                }
                System.out.println("0. 뒤로가기");
                System.out.print("번호를 입력해주세요: ");
                int selectedProduct = sc.nextInt();
                if (selectedProduct == 0) {
                    continue;
                } else {
                    Product product = selectedCategory.getProducts().get(selectedProduct - 1);
                    {
                        System.out.println("선택한 상품 : " +
                                product.getName() + " | " +
                                product.getPrice() + " | " +
                                product.getDescription() + " | 재고: " +
                                product.getStock() + "개 ");
                    }
                }
            }
        }
    }
}


