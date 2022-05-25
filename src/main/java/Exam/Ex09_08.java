package Exam;

public class Ex09_08 {
    public static void main(String[] args) {
        String str1 = "Java programming";
        String str2 = "Java It CookBook";

        System.out.println( str1);
        System.out.println(str2);


        System.out.println(str1.compareTo(str2)); // s
        System.out.println(str1.contains("Java"));
        System.out.println(str1.indexOf("Java"));
        System.out.println(str1.indexOf("Java") > -1); // index값이 o보다 크므로 값이 true가 나옴


    }
}
