package Codeup;

import java.util.Scanner;

public class Codeup1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String []  pars = line.split("\\.");
        if( pars.length > 1 ) {
            System.out.println(pars[0]);
            System.out.println(pars[1]);
        }
    }

}
