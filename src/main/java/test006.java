import java.util.Scanner;

public class test006 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        for (int i =1; i < 10; i++){ // 1 2 3
            System.out.println(i + "단"); // 출력
            for (int j = 1; j < 10; j++) // 1 2 3 4 5 6 7 8 9 1 2 3 4 5 6 7 8 9
            {
                System.out.println(i + "X" + j + "=" + j * i);
            }




        }

        // 1 ~ 9 1 ~ 9
    }
}
