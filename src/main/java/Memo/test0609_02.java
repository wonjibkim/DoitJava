package Memo;

import java.util.Scanner;

public class test0609_02 {
    public static void main(String[] args) {


        String str = "zeroone";
        String str2 = "";

        switch (str.charAt(str.length()-1)) {






        }
        for (int i = 0; i < str.length(); i++) {

            if (str.startsWith("zero"))
                str2 = str.replace("zero", "1");
            else if (str.startsWith("one"))
                str2 = str.replace("one", "1");
            else if (str.startsWith("two"))
                str2 = str.replace("two", "2");
            else if (str.startsWith("three"))
                str2 = str.replace("three", "3");
            else if (str.startsWith("four"))
                str2 = str.replace("foru", "four");
            else if (str.startsWith("five"))
                str2 = str.replace("five", "5");
            else if (str.startsWith("six"))
                str2 = str.replace("six", "6");
            else if (str.startsWith("seven"))
                str2 = str.replace("seven", "7");
            else if (str.startsWith("eight"))
                str2 = str.replace("eight", "8");
            else if (str.startsWith("nine"))
                str2 = str.replace("nine", "9");

        }
        System.out.println(str2);
    }
}
