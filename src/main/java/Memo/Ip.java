package Memo;

public class Ip {
    public static void main(String[] args) {
        /** Access_log 서버 로그 샘플 // 시작
         *
         * 다음주 쪽지시험에도 냄. 공부하기
         *
         ** 0525 쪽지시험 1번문제 **/
        String log = "111.222.33.44 - - [11/Jun/2012:22:12:32 +0900] \"GET /w/custom/jmnote20120124.ico HTTP/1.1\" 304 - \"-\" \"Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; Trident/5.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; .NET4.0C; MS-RTC LM 8)\"";

        int pos = log.indexOf(" "); // (indexOf는 특정문자열 위치확인) 첫번쨰 띄어쓰기 위치확인
        System.out.println("pos : "+ pos); //위치출력

        String ip = log.substring(0, pos);// 0 ~ 13번째 문자출력
        System.out.println("ip : "+ ip);

        String[] item = log.split(" "); //
        System.out.println("ip :"+item[0]);

        /** 0525 쪽지시험 2번문제 **/

        System.out.println("time : "+ item[3]);
        //결과값이 time : [11/Jun/2012:22:12:32 나오기 때문에 "[" 제거
        String time = item[3].substring(1);

        System.out.println("time : "+ time);
        /** 쪽지시험 ^ **/
    }
}
