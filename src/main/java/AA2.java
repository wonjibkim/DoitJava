public class AA2 {
    public static void main(String[] args) { // 자바를 시작하기 위해서 main메소드를 사용하여 코딩의 시작점을 알림

        int sum = 0;// 3또는 7또는 11의 ㅐ수를 제외한 합계를 구하기 위해 sum이라는 변수를 선언

        for (int i =50; i <101; i++){// i라는 변수값에 50대입 변수 i는 i이 미만이며 i에 후치증감연산자를 넣음으로 반복문을 돌림
            if (i%3==0){ // i라는 변수값이 3으로 나누었을 때 나머지 값이 0 이라면?

            } else if (i % 7==0){

            }
            else if (i % 11 ==0){

            }
            else
                sum +=i;
        }
        System.out.println("sum :" +sum );






    }
}
