import java.util.Scanner;

public class Test008 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a;

        System.out.println("정수를 입력하시오");
        a = sc.nextInt();

        if( a % 2 ==0)
        {
            System.out.println("짝수입니다"); }

        else
            {
                System.out.println("홀수입니다");
            }

    }
}
