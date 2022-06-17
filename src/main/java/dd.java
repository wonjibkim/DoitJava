import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class dd {

    public static void main(String[] args) {

        List<String>list = new ArrayList<>();

        list.add("이협건");
        list.add("임꺽정");
        list.add("홍길동");
        list.add("고길동");

        int listSize = list.size(); // 변수를 선언 후에 list 개수 4로 초기화
                                    // list size에 4로 초기화

        for (int i = 0; i<listSize ; i++) { // list 개수 (4)미만일떄 까지 실행
            System.out.println("이름 : " +list.get(i));   // list 의 기능 ( add , size, get, remove)
        }


        Iterator<String> it = list.iterator(); //list 의 기능은 제한적, 새로운 함수 Iterator 함수를 사용
                                                // Iterator 함수의 기능 (hasNext, next)


        while(it.hasNext()){ //  hasNext 함수는 참 거짓 반환, 조건에 충적하지 않으면 while 문이 종료

            String name = it.next(); // 다음 값으로 넘김
            System.out.println("이름" +name);// 현재값을 출력


             // 기존 for 문을 개선한 방식으로, for문은 listsize 개수를 계산을 수행을 하지만
             // while 문과 Iterator 를 사용하면 list 개수를 계산을 수행하지않고 다음 값에 여부만 확인하기 떄문에 실행속도가 빠름

        }
    }

}
