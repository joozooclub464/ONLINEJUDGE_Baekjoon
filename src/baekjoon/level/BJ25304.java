package baekjoon.level;
//영수증
import java.util.Scanner;

public class BJ25304 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt(); //영수증 총 금액
        int N = scan.nextInt(); //구매한 물건 종류의 수
        int a = 0; //개별 물건 가격
        int b = 0; //개별 물건 개수
        int add[] = new int[N];
        int sum = 0;

                        //입력받은 금액 계산해서 더하기
                        for(int i=0;i<N;i++) {
                            a = scan.nextInt();
                            b = scan.nextInt();
                            add[i] = a*b;
                        }
                        for(int j=0;j<add.length;j++) {
                            sum += add[j];
                        }
                        //영수증과 비교 후 출력
                        if(sum == X) {
                            System.out.println("Yes");
                        } else {
                            System.out.println("No");
                        }



    }
}
