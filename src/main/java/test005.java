public class test005 {
    public static void main(String[] args) {

        int dan=2;
        int k=1;
        //초기값을 지정 해 줍니다 i값이 단부분, j값이 1~9까지 계산 되어지는 부분입니다.
        while (dan<=9) {
            //i를 2단~9단부터 반복 작업을 시켜줍니다.
            while (k<=9)
            {
                //j값을 주어서 각 단의 연산을 하도록 해 줍니다.
                System.out.print( dan +" X "+ k +" = " + (dan*k));
                k++;
                //초기화나 증가값을 주지 않으면 무한 반복하기 때문에 꼭 넣어 주어야 합니다.
                //j를 1씩 증가시켜주는 연산자입니다.
            }
            k = 1; //j를 1로 초기화 시켜주지 않으면 2단연산 이후의 while문이 돌아가지 않습니다.
            dan++;
            //i도 1씩 증가시켜 줍니다.
        }
    }
}

