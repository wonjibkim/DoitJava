/*import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test007 {
    public static void main(String[] args) {

        List<Map<String, String>> list = new ArrayList<>();

        Map<String,String> map = new HashMap<>();

        map.put("name", "이협건");
        map.put("email", "kbg5174@naver.com");
        map.put("dept", "데이터분석과");
        map.put("addr", "서울");

        list.add(map);

        map = null;

      map = new HashMap<>();

        map.put("name", "홍길동");
        map.put("email", "kbg6912@naver.com");
        map.put("dept", "시각디자인과");
        map.put("addr", "경기기");

        int listsize = list.size();

        for (int i = 0; i <listsize ; i++) {

            Map rMap = list.get(i);
            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("addr : " + rMap.get("addr"));
            System.out.println("dept : " + rMap.get("dept"));

            for(Map<String,String> rMap : list){
                System.out.println("name : " + rMap.get("name"));
                System.out.println("email : " + rMap.get("email"));
                System.out.println("addr : " + rMap.get("addr"));
                System.out.println("dept : " + rMap.get("dept"));
            }

            list.forEach(rMap-> (){
                System.out.println("name : " + rMap.get("name"));
                System.out.println("email : " + rMap.get("email"));
                System.out.println("addr : " + rMap.get("addr"));
                System.out.println("dept : " + rMap.get("dept"));
            });

        }
    }
}*/
