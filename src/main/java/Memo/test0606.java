package Memo;

import java.util.Scanner;

public class test0606 {
    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);
        int numer = SC.nextInt();

        int a = numer;
        int count = 0;

        while( a!= 0){
            a /= 10;
            count++;
        }

        System.out.println(count);
    }
}
