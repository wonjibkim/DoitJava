package Review;

import java.util.Scanner;

public class review006 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int hap = 0;
        int i;

        for ( i = 1 ; i<=k ; i++) {
            hap += i;
        }

        System.out.printf("%d",hap);




    }
}
