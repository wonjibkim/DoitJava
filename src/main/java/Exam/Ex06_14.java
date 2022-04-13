package Exam;

public class Ex06_14 {
    public static void main(String[] args) {
        int i,k;

        for(i=1; i<10; i++){
            for(k=1 ; k<10 ; k++){
                System.out.printf("%d * %d = %d\n", i,k,(i*k));
            }
            System.out.printf("\n");
        }
    }
}

