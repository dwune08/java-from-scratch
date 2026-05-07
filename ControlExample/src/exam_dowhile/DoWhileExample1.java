package exam_dowhile;

public class DoWhileExample1 {
    public static void main(String[] args) {
        char alp = 'A';

        do {
            System.out.print(alp);
            if(alp != 'Z') System.out.print(", ");
        } while(alp++ != 'Z');
    }
}