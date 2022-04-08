import java.util.Scanner;

public class Test0015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 5;

        for (int i = 5 ; i > 0 ; i--) // 5 4 3 2 1
        {
            for (int k = 0; k < i; k++) { // ****** ***** **** *** ** *
                System.out.print("*");
            }

            System.out.println();
        }


        // |||||
        //     *
        //    **
        //   ***
        //  ****






    }
}
