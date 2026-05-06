package exam_if;

import java.util.Scanner;

/* 사용자로 하여금 사원번호, 근무시간, 시간당 금액을 입력받아
   사원번호와 급여를 출력하도록 프로그램을 작성해 주세요.
   * 급여 = 근무시간 * 시간당 금액으로 처리하면 된다.
   * 40시간 초과시간만큼 시간당 금액의 50%를 더 받는다.
 */

public class TimePayExample {
    public static void main(String[] args) {
        int empNum, workTime, payForTime;
        double totalPay;

        Scanner input = new Scanner(System.in);

        System.out.println("***급여 계산 프로그램 입니다.***");
        System.out.println("사원번호, 근무시간, 시간당 금액을 차례대로 입력해주세요.");
        System.out.print("사원번호 : ");
        empNum = input.nextInt();
        System.out.print("근무시간 : ");
        workTime = input.nextInt();
        System.out.print("시간당 금액 : ");
        payForTime = input.nextInt();

        totalPay = workTime * payForTime;

        if(workTime > 40)
            totalPay += (workTime-40)*payForTime*0.5;


        System.out.println("사원번호 : " + empNum + "\n급여 : " + totalPay);

        /*
            totalPay = ((workTime > 40) ? ((workTime*3/2-20)*payForTime) : (workTime * payForTime);
            System.out.println("사원번호 : " + empNum + "\n급여 : " + totalPay);
         */

        input.close();

    }
}
