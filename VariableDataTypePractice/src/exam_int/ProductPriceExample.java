package exam_int;
import java.util.Scanner;


// 상품 가격과 수량을 입력받아 총 금액 계산하기
public class ProductPriceExample {
    public static void main(String[] args) {
        int price, quantity;

        Scanner input = new Scanner(System.in);
        System.out.println("총 금액 계산기 입니다.");
        System.out.println("상품의 가격을 입력해주세요. (단위 : 원)");
        System.out.print("가격 : ");
        price = input.nextInt();

        System.out.println("상품의 수량을 입력해주세요.");
        System.out.print("수량 : ");
        quantity = input.nextInt();

        System.out.println("상품 가격 : " + price);
        System.out.println("구매 수량 : " + quantity);
        System.out.println("상품의 총 금액 : " + (price * quantity) + "원");
        System.out.println("배송비 : " + 3000 + "원");
        System.out.println("최종 결제 금액 : " + ((price * quantity)+3000) + "원");

        input.close();
    }
}
