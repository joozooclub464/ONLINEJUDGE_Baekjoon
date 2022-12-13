package baekjoon.bronze.B1;
//평균은 넘겠지
import java.util.Scanner;

public class BJ4344 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int C = scan.nextInt(); //테스트 케이스의 개수
        int N = 0; //각 테스트별 학생수
        double aws[] = new double[C]; //정답이 입력될 배열

        for(int i=0;i<C;i++) {
            //이 아래부터 각줄 테스트케이스 실행
            N = scan.nextInt();//학생 수 받아온것 입력 v
            double cnt = 0; //평균보다 큰 학생들의 수
            double avg = 0; //학생들의 평균
            double sum = 0;

            int sc[] = new int[N]; //각
            for(int j=0;j<sc.length;j++) {
                sc[j] = scan.nextInt(); //입력받은 점수 저장 v
            }
            //각 케이스별 평균 구하기
            for(int j=0;j<sc.length;j++) {
                sum += sc[j];
            }
            avg = sum / N ; //평균 구하기 v
            //평균보다 점수가 높은 학생들 구하기
            for(int j=0;j<sc.length;j++) {
                if(sc[j]>avg) {
                    //평균보다 큰 경우 v
                    cnt++;
                }
            }
            aws[i] = (cnt/N)*100;
        }
        for(int i=0;i<aws.length;i++) {
            System.out.printf("%.3f%%\n", aws[i]);
        }
    }
}
