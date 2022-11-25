package baekjoon.level;
//주사위 세개
import java.util.Scanner;

public class BJ2480 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = 0;
        //주사위의 눈 조건
        if(a>=1 && a<=6){
            if(b>=1 && b<=6) {
                if(c>=1 && c<=6) {
                    //세 주사위 비교 조건
                    if (a == b && b == c) {
                        //같은눈 세개
                        d = 10000 + a*1000;
                    } else if(a != b && b != c && a != c) {
                        //모두 다른 눈
                        //가장 큰 눈 찾기
                        if(a>b && a>c) {
                            //a가 가장 클 때
                            d = a*100;
                        } else if(b>a && b>c) {
                            //b가 가장 클 때
                            d = b*100;
                        } else {
                            //c가 가장 클 때
                            d = c*100;
                        }
                    } else {
                        //같은눈 두개
                        //a와 b가 같을수도 a와 c가 같을수도 b와 c가 같을수도 있음
                        if(a == b && a != c) {
                            //a와 b가 같을때
                            d = 1000 + a*100;
                        } else if(a == c && a != b) {
                            //a와 c가 같을때
                            d = 1000 + a*100;
                        } else {
                            //b와 c가 같을때
                            d = 1000 + b*100;
                        }
                    }
                    System.out.println(d);
                }
                else {
                    System.out.println("주사위의 눈은 1부터 6 사이의 정수입니다.");
                }
            }else {
                System.out.println("주사위의 눈은 1부터 6 사이의 정수입니다.");
            }
        }else {
            System.out.println("주사위의 눈은 1부터 6 사이의 정수입니다.");
        }

    }
}
