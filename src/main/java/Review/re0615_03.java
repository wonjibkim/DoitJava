package Review;

public class re0615_03 {
    public static void main(String[] args) {
        int a =100, b=0;
        int result;

        try{
            if (b==0){
                throw new Exception("0으로 나누려고요? 안됩니다.");
            }
            result = a/b;
        }catch (Exception e){
            System.out.print("발생오류 ==>");
            System.out.println(e);
        }
        finally {
            System.out.println("난 무조건!");
        }
    }
}
