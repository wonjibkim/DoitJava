package Exam;

import java.util.HashMap;
import java.util.Map;

public class Pptlist02 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("name", "이협건");
        map.put("email", "kbg5174@naver.com");
        map.put("dept", "데이터분석");

        System.out.println("--------------------------------");

        System.out.println("name : " +map.get("name"));
        System.out.println("email : " +map.get("email"));
        System.out.println("dept : " +map.get("dept"));

        System.out.println("--------------------------------");
    }
}
