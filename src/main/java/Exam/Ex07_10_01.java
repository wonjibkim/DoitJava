package Exam;

public class Ex07_10_01 {
    public static void main(String[] args) {
         int hap =0;
         int i;

         for(i=1 ; i<=100; i++){
             if ( i % 3!=0)



             hap += i;
         }

        System.out.printf("1 ~ 100까지의 합(3의 배수 제외): %d\n", hap);
    }
}
// continue문을 사용하지않고 if문을 사용해서 ex07_10울 풀기