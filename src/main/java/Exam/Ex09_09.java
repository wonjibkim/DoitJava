package Exam;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Ex09_09 {
    public static void main(String[] args) {

        String str1 ="Java programming";
        String str2 ="Java programming";
        String str3 = new String("Java programming");

        System.out.println("원문자열1 ==>" +str1);
        System.out.println("원문자열2 ==>" +str2);
        System.out.println("원문자열3==>" +str3);


        System.out.println("문자열 == 문자열 결과 :" +str1 == str2);
        System.out.println("문자열 1 equals(문자열2) 결과" +str1.equals(str2));
        System.out.println("문자열1 == 문자열3 결과: " + str1 == str3);
        System.out.println("문자열1.equals(문자열3)결과 :" +str1.equals(str3));

        System.out.println("문자열 1과 문자열 2가 다른지 비교 compartTo 안쓰고, 이렇게 함"+str1.equals((str2)));

// string 에서 값을 비교할 때 equals 를 사용 ( ==눈 사용못함)
        // compare to는 개념만 잡고 있자
}
}

