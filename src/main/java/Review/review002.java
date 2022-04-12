package Review;

public class review002 {
    public static void main(String[] args) {

        int hap = 0;
        int i;

        for (i = 501; i < 1001; i += 2) // i =i+2{
        {
            hap += i;
        }

        System.out.printf("500에서 1000까지의 합 : %d", hap);
    }

}
// 500 ~ 1000까지 합