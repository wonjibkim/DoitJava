import java.util.Scanner;

public class AJ {
    public static void main(String[] args) {
            int a; //입력값
            int sum=0; //합
            int i=0; //count할 값
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();

            while(sum<a) {
                i++;
                sum = sum + i;
            }
            System.out.print(i);
        }
    }

}
