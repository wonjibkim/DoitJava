package Exam;

import java.util.Scanner;

public class Exam09_05 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String str,strRep, strSub,strAry[];

        System.out.print("문자열을  : ");
        str = s.nextLine();

        strRep = str.replace("", "$");
        strSub = str.substring(3, 8);
        strAry = str.split(" "); //  spilt 분리하다  (. )을 기준으로 값을 분리(여러개의 값으로 나누어진다는 것)
                                      // spilt 문자열은 리턴하는 값이 배열이 들어감


        System.out.println("입력 문자열 ==>" +str);
        System.out.println("바꾼 문자열 ==>" +strRep);
        System.out.println("일부 문자열 ==>" +strSub);
        for (int i = 0; i <strAry.length ; i++) {
            System.out.println("분리할 문자열" +i +"==>" +strAry[i]);
        }

    }
}
