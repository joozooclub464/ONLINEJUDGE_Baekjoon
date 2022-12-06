package baekjoon.bronze.B1;
//평균
import java.util.Scanner;

public class BJ1546 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); //시험 본 과목의 개수
        float M = 0; //최댓값
        float sc[] = new float[N]; //입력받은 점수 넣는 배열
        float avg = 0;

        for(int i=0;i<sc.length;i++) {
            sc[i] = scan.nextInt();
            if(sc[i] > M) {
                M = sc[i];
            }
        }
        for(int i=0;i<sc.length;i++) {
            avg += (sc[i]/M*100)/N;
        }
        System.out.println(avg);

    }
}
