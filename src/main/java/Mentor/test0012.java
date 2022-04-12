package Mentor;

import java.util.Scanner;

public class test0012 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.printf("피라미드 층 수 입력 : ");
        int num = scan.nextInt();

        for (int i = 0; i < num; i++) {
            for (int j = 1; j < num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
