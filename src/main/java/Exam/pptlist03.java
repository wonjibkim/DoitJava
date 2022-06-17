package Exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class pptlist03 {
    public static void main(String[] args) {

        List<Map<String, String>> list = new ArrayList<>();

        Map<String, String> map = new HashMap<>();

        map.put("name", "이협건");
        map.put("email", "kbg5174@naver.com");
        map.put("dept", "데이터 분석과");
        map.put("addr", "서울");

        list.add(map);

        map = null;

        map = new HashMap<>();

        map.put("name", "김원집");
        map.put("email", "ga5174@naver.com");
        map.put("dept", "시각과");
        map.put("addr", "인천");

        list.add(map);

        map = null;

        int listsize = list.size();

        for (int i = 0; i < listsize; i++) {

            Map rMAP = list.get(i);
            System.out.println("name :" + rMAP.get("name"));
            System.out.println("email :" + rMAP.get("email"));
            System.out.println("dept :" + rMAP.get("dept"));
            System.out.println("addr :" + rMAP.get("addr"));
        }

    }
}



