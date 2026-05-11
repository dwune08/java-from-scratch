package exam_array;

public class CardExample {
    public static void main(String[] args) {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int i = (int)(Math.random()* suits.length); // 0~3 값 랜덤
        int j = (int)(Math.random()* ranks.length); // 0~12 값 랜덤

        System.out.println(suits[i] + "의 " + ranks[j]);
    }
}
