package Codeup;

import java.util.Scanner;

public class Codeup066 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int a, b, c = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[10];

        if (a % 2 ==0)
            System.out.println("even");
        else
            System.out.println("odd");

        if (b % 2 ==0)
            System.out.println("even");
        else
            System.out.println("odd");

        if (c % 2 ==0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
}
