package baekjoon;

import java.util.Scanner;

public class BJ14681 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();

        if (-1000 <= x && x <= 1000 && x != 0){
            if (-1000 <= y && y <= 1000 && y != 0) {
                if (x > 0 && y > 0) {
                    System.out.println(1);
                } else if (x < 0 && y > 0) {
                    System.out.println(2);
                } else if (x < 0 && y < 0) {
                    System.out.println(3);
                } else if (x > 0 && y < 0) {
                    System.out.println(4);
                }
            }
        } else {
            System.out.println("-1000과 1000 사이의 0이 아닌 정수를 입력하세요");
        }
    }
}
