package baekjoon.bronze.B4;
//숫자의 합
import java.util.Scanner;

public class BJ11720 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); //숫자의 개수
        String s = scan.next();
        int sum = 0;
        String[] strArray = s.split("");
        for (String s1 : strArray) {
            sum += Integer.parseInt(s1);
        }
        System.out.println(sum);
    }
}
