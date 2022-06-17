package Exam;

public class Exam09_04 {
    public static void main(String[] args) {
        String str = "Java를 공부하는중, Java는 어려워요.^^";

        System.out.println("문자열 ==>" +str);


        // 데이터에서 일부를 봅아낼때 사용한다
        // (로그파일을 볼떄 IP는 맨앞에 있음 숫자 4개로 이루어져있다)
        // 공백도 계산하니 주의
        // IP의 특징 시작은 0, 끝은 공백


        System.out.printf("제일 처음 나오는 Java 위치 ==> ");
        System.out.println(str.indexOf("Java"));

        System.out.print("마지막에 나오는 Java위치 ==>");
        System.out.println(str.lastIndexOf("Java"));
    }
}
