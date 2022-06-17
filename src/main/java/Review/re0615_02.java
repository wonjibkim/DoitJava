package Review;

public class re0615_02 {
    public static void main(String[] args) {
        int[]aa =new int[3];
        try{
            aa[2] = 100/0;
        }catch (Exception e){
            System.out.println("에러" +e);
        }
        finally {
            System.out.println("자바좋다..");
        }

    }
}
