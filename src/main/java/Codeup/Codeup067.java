package Codeup;

import java.util.Scanner;

public class Codeup067 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a>0)
            System.out.println("plus");
        else
            System.out.println("minus");

        if(a%2==0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
}
