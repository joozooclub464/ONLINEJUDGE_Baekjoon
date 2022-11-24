package baekjoon;
//윤년
import java.util.Scanner;

public class BJ2753 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();

        if(year>=1 && year<=4000) {
            if(year%4==0 && year%100!=0) {
                System.out.println(1);
            }
            else if(year%400==0) {
                System.out.println(1);
            }
            else {
                System.out.println(0);
            }
        }
        else {
            System.out.println("1부터 4000 사이의 정수를 입력하세요");
        }

    }
}
