/*package Exam;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Ex10_09 {
    public static void main(String[] args) throws  Exception {

        FileInputStream fis = new FileInputStream("c:/test/jj.txt"); // 읽어서 메모리에 올려라 Stream은 덩어리 읽는다
        //c 드라이브 쓰지않기 윈도우를 c 드라이브에 설치하기때문에 기본적으로 c 드라이브
        // 기반으로 검색 또한 윈도우말고 다른 운영체제에서는 c 드라이브개념이 없음

        *//*InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);*//*

        int ch;// 한 글자글자 읽어오기 위한 변수 선언

       *//* while ((ch = fis.read()) != -1) {*//* // 파일을 다  읽으면 -1 을 반환 즉 다 읽기 직전가지 실행시켜라

while ((ch)=fis.read() != -1){
            System.out.print((char) ch);//ch형태로 출력하기
            fis.close(); // 파일 다 읽었으니까 닫아라

    }

}*/

//전에는 euc -kr을 사용  하지만 사전에 없는 단어가 사용되면서 utf-8(단어의 수가 euc-kr에 비해서 많음) 을 사용