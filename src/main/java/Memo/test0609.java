package Memo;

import java.util.Scanner;

public class test0609 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2="";


        if(str.startsWith("zero"))
        str2 = str.replace("zero" , "0");

        if(str.startsWith("one"))
        str2 = str.replace("one","1");

        if(str.startsWith("two"))
            str2 = str.replace("two", "2");

        if(str.startsWith("three"))
            str2 = str.replace("three","3");

         if(str.startsWith("four"))
            str2 = str.replace("foru","4");

        if(str.startsWith("five"))
            str2 = str.replace("five","5");

         if(str.startsWith("six"))
            str2 =  str.replace("six","6");

         if(str.startsWith("seven"))
            str2 = str.replace("seven","7");

        if(str.startsWith("eight"))
            str2 = str.replace("eight","8");

         if(str.startsWith("nine"))
            str2 = str.replace("nine","9");

        System.out.println(str2);
    }
}
