package exam_super;

import javax.swing.text.AsyncBoxView;

// 부모 계좌와 자식 계좌
class ParentAccount {
    protected int money;
    
    public ParentAccount() {
        money = 10000;
    }
    
    public void printMoney() {
        System.out.println("부모 클래스와 printMoney() 메서드");
    }
}

class ChildAccount extends ParentAccount {
    protected int money;

    public ChildAccount() {
        money = 5000;
    }

    @Override
    public void printMoney() {
        int money = 1000;

        super.printMoney();

        System.out.println("자식 클래스와 printMoney() 메서드");
        System.out.println("지역 변수 money : " + money);
        System.out.println("자식 클래스의 money() : " + this.money);
        System.out.println("부모 클래스의 money() : " + super.money);
    }
}

public class ChildClassTest {
   public static void main(String[] args) {
       ChildAccount account = new ChildAccount();
       account.printMoney();
   }
}
