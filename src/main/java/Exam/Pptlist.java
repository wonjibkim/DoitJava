package Exam;

import java.util.ArrayList;
import java.util.List;

public class Pptlist {
    public static void main(String[] args) {

        List<String>list = new ArrayList<>();

        list.add("이협건");
        list.add("김원집");
        list.add("허지혜");
        list.add("허김아");

        int listSize = list.size();

        for(int i=0 ; i < listSize ; i++){
            System.out.println("이름 :" + list.get(i));
        }
    }
}
