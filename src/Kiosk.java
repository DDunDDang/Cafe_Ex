import Product.Product;
import Product.ProductRepository;
import discount.DiscountCondition;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Kiosk {
    private ProductRepository productRepository = new ProductRepository();
    private DiscountCondition discountCondition;
    public Kiosk(DiscountCondition discountCondition){
        this.discountCondition = discountCondition;
    }
    private Scanner scanner = new Scanner(System.in);
    public void operate(){
        System.out.println("# 메뉴");
        System.out.println("-".repeat(50));
        for (Product product : productRepository.getProducts()){
            System.out.printf("(%d) %-15s %d\n", product.getId(), product.getName(), product.getPrice());
        }
        System.out.println("-".repeat(50));


        System.out.println("메뉴를 골라주세요.");
        int selectedId = Integer.parseInt(scanner.nextLine());
        Product selectedMenu = productRepository.findById(selectedId);

        selectedMenu.applyOption();

//        discountCondition.checkDiscountCondition();
        //discountCondition 을 인터페이스로 만들어 메서드를 불러오려 했으나
        // 해당 메서드만 불러와질 뿐 가격 입력은 되지 않았다.

        int price = discountCondition.discount(selectedMenu.getPrice());

        System.out.println("주문이 완료되었습니다.");
        System.out.printf("주문 상품 : %s %s\n", selectedMenu.getName(), selectedMenu.stringApplyOption());
        System.out.printf("가격 : %d\n", price);

        }
    }

