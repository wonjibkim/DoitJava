package Exam;

public class Ex07_02 {
    public static void main(String[] args) {
        int hap = 0;
        int i =1;


        while (i < 11){
            hap += i;
            i++; // 조건 값에 변화를 주기 위해
        }

        System.out.printf("1에서 10까자의 합 %d\n", hap);

    }
}
