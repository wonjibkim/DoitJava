package Exam;

public class Ex09_01 {
    public static void main(String[] args) {
        String str = "IT cookBook. Java";
        int len;

        len = str.length(); //문자의 갯수 (공백도 포함)

        System.out.printf("문자열 :%s \n",str);
        System.out.printf("문자열의 길이 : %d",len);


       /* // length는 값의 존재 여부를 확인할 떄 아래와 같이 사용
        if(str.length() > 0){S
            System.out.println("str변수에 값이 존재한다");
        } else {
            System.out.println("str변수에 값이 존재하지 않는다");
        }*/

    }
}
