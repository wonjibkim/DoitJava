package Memo;

public class Pro {


    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            if (i == 2) {
                answer++;
                continue;
            }

            // 소수 아님
            if (i % 2 == 0) continue;

            // 소수 아님
            boolean flag = true;
            for (int j = 3; j <= (int) (Math.sqrt(i)); j += 2) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                answer++;
            }

        }

        return answer;
    }
}
