package baekjoon.bronze.B3;

import java.util.Scanner;

//오븐 시계
public class BJ2525 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt(); //현재 시
        int B = scan.nextInt(); //현재 분
        int C = scan.nextInt(); //요리 시간
        int D = 0; //끝나는 시 //A는 23까지 리밋이 걸려있기 때문에 새로 선언해줌
        int E = 0; //끝나는 분
        //조건
        if (A >= 0 && A <= 23) {
            if(B >= 0 && B <= 59) {
                if(C >= 0 && C <= 1000) {
//                    System.out.println((B+C)/60); //시간에더해줘야할 숫자
                    if(B+C<60) { //분의 합이 60보다 작을 때(시간을 올려줄 필요가 없음)
                        D = A;
                        E = B+C;
                    } else { //분의 합이 60보다 클 때(더한 분의 몫은 시간에 더해주고 나머지는 분으로 대입)
                        E = (B+C)%60; //더한 분의 나머지를 분에 대입
                        D = (B+C)/60 + A;
                    }
                    //시간 처리 (24시 이후는 다음날로 넘김)
                    if(D>23) {
                        D = D - 24;
                    }
                    System.out.println(D + " " + E);
                }
            }

        } else {
            System.out.println("시간은 0시부터 23시 사이, 분은 0분 부터 59분 사이로 구성되어 있습니다.");
        }

    }
}
