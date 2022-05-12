package Exam;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pptlist01 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("이협건");
        list.add("김둘리");
        list.add("레고");


        for (String name : list){
            System.out.println("이름 :" +name );
        }


        list.forEach(name -> System.out.println("name :" +name));


        Iterator<String> it = list.listIterator();

        while (it.hasNext()){
            String name = it.next();
            System.out.println("이름 :" +name);
        }
    }
}
