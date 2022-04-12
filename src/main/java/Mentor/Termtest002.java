package Mentor;

import java.util.Scanner;

public class Termtest002 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a;

        System.out.printf("숫자를 입력하세요 : ");
        a = s.nextInt();
//최소 공배수를 할용해서  if(a % 15)조건으로 3과 5의 배수 출력가능
        if ((a % 5 == 0) && (a % 3 == 0)) {
            System.out.println("3과 5의 배수입니다");
        } else if (a % 3 == 0) {
            System.out.println("3의 배수입니다.");
        } else if (a % 5 == 0) {
            System.out.println("5의 배수입니다.");
        }


    }
}