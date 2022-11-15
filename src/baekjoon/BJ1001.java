package baekjoon;

import java.util.Scanner;

public class BJ1001 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("정수 A를 입력하세요");
        int A = scan.nextInt();
        System.out.println("정수 B를 입력하세요");
        int B = scan.nextInt();

        int C = A + B;
        System.out.println("A+B="+C);


//        scan.close();
    }
}
