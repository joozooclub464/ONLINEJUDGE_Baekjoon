package baekjoon.bronze.B1;
//더하기 사이클
import java.util.Scanner;

public class BJ1110 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        //조건
        if(N>=0 && N<=99) {
            int a,c = 0;
            int b = N%10;
            int i = 1;
            if(N<10) {
                a = 0;
            }else {
                a = N/10;
            }
            //실행코드
            c = a+b;
            a = b;
            b = c%10;
            while(N != 10*a+b) {
                c = a+b;
                a = b;
                b = c%10;
                i++;
            }
            System.out.println(i);
        }
    }
}
