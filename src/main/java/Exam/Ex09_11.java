package Exam;

import java.util.Scanner;

public class Ex09_11 {
    public static int coffee_machine(int button) { // 커피머신이라는 함수명 만듬
        System.out.printf("\n#1.(자동으로)뜨거운 물을 준비한다\n");
        System.out.printf("#2.(자동으로) 종이컵을 준비한다\n");

        switch (button) {
            case 1:
                System.out.println("#3.(자동으로)보통커피를 탄다\n");
                break;

            case 2:
                System.out.println("#3.(자동으로)설탕커피를 탄다\n");
                break;

            case 3:
                System.out.println("#3.(자동으로)블랙커피를 탄다\n");
                break;
            default:
                System.out.printf("#3.(자동으로)아무거나 탄다\n");
        }
        System.out.printf("#4.(자동으로)물을 붓는다\n");
        System.out.printf("#5.(자동으로)스푼으로 저어서 녹인다\n\n");

        return 0;
    }

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int coffee;
        int ret;

        System.out.printf("어떤 커피 드시까요? (1.보통 2.설탕 3. 블랙)");
        coffee = s.nextInt();

        ret = coffee_machine(coffee);

        if(ret ==0){
            System.out.println("함수실행성공입니다다");
       }

        System.out.print("손님 커피 여기 있습니다\n");

    }

}
