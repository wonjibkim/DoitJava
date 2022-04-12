package Review;

public class review001 {

    public static void main(String[] args) {

        int hap = 0;
        int i;

        for (i = 1 ; i < 11 ; i++) {
            hap += i;
        } // += =+는 다르다 주의하기
        // 1번은  0 + 1 + 2 + 3 + 4 + 5 + 6 + 7
        System.out.printf("1부터 10까지의 합 : %d", hap);
    }

}