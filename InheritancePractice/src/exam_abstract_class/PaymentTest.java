package exam_abstract_class;

abstract class Payment {
    protected int amount;

    public Payment(int amount) {
        this.amount = amount;
    }

    public void printAmount() {
        System.out.println("결제 금액: " + amount + "원");
    }

    public abstract void pay();
}


class CardPayment extends Payment {
    public CardPayment(int amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("카드로 결제합니다.");
    }
}

class KakaoPay extends Payment {
    public KakaoPay(int amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("카카오페이로 결제합니다.");
    }
}

public class PaymentTest {
    public static void main(String[] args) {
        CardPayment cardPayment = new CardPayment(10000);
        cardPayment.printAmount();
        cardPayment.pay();
        System.out.println();

        KakaoPay kakaoPay = new KakaoPay(5000);
        kakaoPay.printAmount();
        kakaoPay.pay();
    }
}

