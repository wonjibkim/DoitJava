package Exam;

import java.util.Scanner;

public class Ex09_03 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str;

        System.out.printf("문자열 이름 ==>");
        str = s.nextLine();

        System.out.printf("츨력 문자열 ==>");


      if(!str.startsWith("(")); {
        System.out.print("(");

        }

        for (int i = 0; i < str.length() ; i++) {
            System.out.printf("%c",str.charAt(i));
        }

        if (!str.endsWith(")"))
        System.out.print(")");


        // Access server 프로그램






    }
}
