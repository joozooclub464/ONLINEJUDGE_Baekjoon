package baekjoon.level;
//A+B
import java.util.Arrays;
import java.util.Scanner;

public class BJ10950 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt(); //반복횟수
        int A = 0;
        int B = 0;
        int i = 1;
        int sum[] = new int[T];
        //전체 조건
            for(i=0; i<T; i++) {
                A = scan.nextInt();
                B = scan.nextInt();
                sum[i] = A+B;
            }
            //배열에 저장된 sum값 출력
            for(int j=0; j<sum.length; j++) {
                System.out.println(sum[j]);
            }
    }
}
