import java.util.Scanner;

public class test009 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.printf("1 ~ 4중에 선택하세요 :");
        int a = sc.nextInt();

        if (a > 0 && a < 5) ;
        else
            System.out.println("이상한거를 선택했다");


        if (a == 1)
            System.out.println(" 1입니다");


        if (a == 2)
            System.out.println(" 2입니다");

        if (a == 3)
            System.out.println(" 3입니다");

        if (a == 4)
            System.out.println(" 4입니다");
    }
}
