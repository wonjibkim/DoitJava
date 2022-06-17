package Review;

import java.util.Scanner;

public class review008 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int i;

        for (i =1 ;  i < 10; i++) {
            System.out.printf(" %d * %d = %d\n", b ,i ,(i*b));
        }

    }
}
