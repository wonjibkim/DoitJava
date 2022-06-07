package BaekJoon;

import java.util.Scanner;

public class Bak1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int count = 0;
        int sum = a;

        while (true) {

            int ten = sum / 10; // 십의자리
            int one = sum % 10; //일의자리
            int right = (ten + one) % 10;// 십의 자리 + 일의자리 더해서 뒤에 자리 추출
            sum = one * 10 + right;

            count++;

            if (a == sum) {
                break;
            }


        }

        System.out.println(count);
    }

}