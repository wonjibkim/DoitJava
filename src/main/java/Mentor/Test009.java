package Mentor;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Test009 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("점수를 입력하시오");
        int a = s.nextInt();

        if (a >= 90) {
            System.out.println("A");}

        else
            if (a >= 80) {
                System.out.println("B");
            }
            else
                if ( a >= 70)
                {
                    System.out.println("C");}
                    else
                        if ( a >= 60)
                        { System.out.println("D");}



    }
}
// 복습
