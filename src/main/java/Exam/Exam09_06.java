package Exam;

public class Exam09_06 {
    public static void main(String[] args) {
        String str = " 한글   ABCD   etgh";

        System.out.println("원 문자열 ==> [" +str+"]");
        System.out.println("대문자로 ==> [" +str.toUpperCase()+"]"); //
        System.out.println("소문자로 ==> [" +str.toLowerCase()+"]");
        System.out.println("공백제거 ==> [" +str.trim()+"]"); // 앞 뒤 공백이 제거가 되는거 == trim
        System.out.println("공백제거 ==> [" +str.replaceAll(" ", "")+"]"); // all = 전체  공백을 ""으로 변환 = 공백제거


    }
}

//

