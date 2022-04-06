import java.util.Scanner;

public class Ex06_10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hap = 0;
        int i;
        int num;

        System.out.println("값입력");
        num = s.nextInt();

        for(i=1; i <= num ; i++){
            hap = hap + i; // hap +=i
        }

        System.out.println("1에서" +num + "까지의 값은" +hap);
    }
}
