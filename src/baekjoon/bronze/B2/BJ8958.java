package baekjoon.bronze.B2;
//OX퀴즈
//일단 무기한 보류....
import java.util.Scanner;

public class BJ8958 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); //테스트 케이스 개수
        int aws[] = new int[N]; //출력할 답을 저장할 배열

        for(int i=0; i<N; i++) {
            String str = scan.nextLine(); //입력받은 OX 저장하는 문자열 변수
            int sum = 0;
            int cnt = 1;

            for(int j=0; j<str.length(); j++) {
//                str.charAt(j); //입력받은 OX
                if(str.charAt(j) == 'O') { //.equals('O')
                    sum += cnt; //sum에 cnt를 더함. 연속한 o가 나올때 cnt는 하나씩 증가함
                    cnt++;
                }
                else if(str.charAt(j) == 'X') {
                    cnt = 1; //x가 입력되었을때 cnt를 처음 값으로 돌려주고 sum에는 아무것도 더하지 않음
                }
            }
            aws[i] = sum;


        }//N번 돌면 반복문 끝남; i<N; i++)
        for(int i=0; i<aws.length; i++){
            System.out.println(aws[i]);
        }



    }
}
