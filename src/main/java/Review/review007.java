package Review;

import java.util.Scanner;

public class review007 {
    public static void main(String[] args) {


        int i;
        int hap = 0;
        int num1, num2, num3;

        Scanner sc = new Scanner(System.in);

        System.out.println("시작값 입력");
        num1  = sc.nextInt();

        System.out.println("증가값 입력");
        num2  = sc.nextInt();

        System.out.println("최종값 입력");
        num3  = sc.nextInt();


        for ( i= num1 ; i <= num3 ; i+=num2 ) {

            hap += i;

        }
        System.out.printf("%d",hap);
    }
}
