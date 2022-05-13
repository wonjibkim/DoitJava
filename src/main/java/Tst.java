public class Tst {
    public static void main(String[] args) {
        for(int i=0; i<5; i++) { //1~5번째 줄을 담당하는 for문
            for(int j=0; j<5-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0; i<4; i++) { //6~9번째 줄을 담당하는 for문
            for(int j=0; j<i+2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
