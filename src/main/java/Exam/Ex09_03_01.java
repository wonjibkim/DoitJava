package Exam;

public class Ex09_03_01 {
    public static void main(String[] args) {

        String log = "111.222.33.44 - - [11/Jun/2012:22:12:32 +0900] \"GET /w/custom/jmnote20120124.ico HTTP/1.1\" 304 - \"-\" \"Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 6.1; Trident/5.0; SLCC2; .NET CLR 2.0.50727; .NET CLR 3.5.30729; .NET CLR 3.0.30729; .NET4.0C; MS-RTC LM 8)\"";


        if(log.startsWith("111.222")){
            int ipLastPos = log.indexOf(" ");
            System.out.println("ipLastPos : " +ipLastPos);
            System.out.println("IP :" +log.substring(0,ipLastPos));
        }
        //System.out.println("111.222로 시작되는 Ip가 호출된 로그입니다.");


    }
}
