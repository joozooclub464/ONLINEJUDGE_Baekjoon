package baekjoon.bronze.B2;
//상수
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BJ2908 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); //StringTokenizer로 입력받아서 (readLine()에서 에러가 발생함-> IOException 예외처리)
        int i1 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int i2 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
            //문자열을 StringBuilder로 변환시키고
            //-> StringBuilder를 뒤집기 우해 reverse함수 적용해주고
            //-> 뒤집어진 정수가 StringBuilder변수로 있음
            //-> 비교를 위해 int값으로 변환(Integer.parseInt()는 매개변수를 String으로 받기 때문에 먼저 .toString()으로 StringBuilder를 String으로 변환)
        System.out.print(Math.max(i1,i2)); //두 값 비교해서 큰 수 출력

        //처음 하려던 방법
        // Scanner을 사용했을 때 단순히 reverse()만 해주면 값이 뒤집히지 않고 에러가 발생함.
//        Scanner scan = new Scanner(System.in);
//        int i1 = scan.nextInt();
//        int i2 = scan.nextInt();
//        StringBuffer sb1 = new StringBuffer(i1);
//        StringBuffer sb2 = new StringBuffer(i2);
//        i1 = Integer.parseInt(sb1.reverse().toString());
//        i2 = Integer.parseInt(sb2.reverse().toString());
//        if(i1>i2) {
//            System.out.println(i1);
//        } else if (i1<i2) {
//            System.out.println(i2);
//        }
    }
}
//값을 뒤집을 떄 : reverse()메서드 用
//String : 문자열 연산이 적고 멀티쓰레드 환경일 경우
//StringBuffer : 문자열 연산이 많고 멀티쓰레드 환경일 경우
//StringBuilder : 문자열 연산이 많고 단일쓰레드이거나 동기화를 고려하지 않아도 되는 경우
//-> Scanner에서는 StringBuilder를 用
//-> BufferedReader에서는 StringBuilder를 用
// Scanner를 사용했을때 단순히 reverse()만 해주면 값이 뒤집히지 않고 에러가 발생함 ==> 내가 처음에 하려고 했던 방법의 문제점..