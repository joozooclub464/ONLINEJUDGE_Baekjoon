package baekjoon.bronze.B5;
//아스키코드
import java.util.Scanner;

public class BJ11654 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //입력받은 글자를 int형으로 변환해주면 자동으로 아스키코드가 뜸
        String input = scan.next();
        int result = input.charAt(0);

        System.out.println(result);

    }
}
//Scanner 없이 System.in만 사용해서 작성. Scanner보다 속도가 빠름
//public static void main(String[] args) throws Exception{
//        int a = System.in.read();
//        System.out.println(a);
//    }