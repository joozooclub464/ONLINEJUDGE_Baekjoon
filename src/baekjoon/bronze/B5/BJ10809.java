package baekjoon.bronze.B5;
//알파벳 찾기
import java.util.Scanner;

public class BJ10809 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] outWordArr = new int[26];
        for(int i=0; i<outWordArr.length; i++) { //입력받은 알파벳이 포함되어 있지 않은 경우를 위해 전체를 -1로 초기화 시켜줌
            outWordArr[i] = -1;
        }
        String inWord = scan.nextLine();

        for(int i=0; i<inWord.length(); i++) {
            char in = inWord.charAt(i); //charAt() 메서드 사용하여 문자 추출해서 in 변수에 저장함.
            if(outWordArr[in - 'a'] == -1) { //char타입의 리터럴을 숫자형 변수에 대입하면 자동으로 아스키코드로 형변환.
                //중복된 값의 경우 처음 나왔던 알파벳의 위치로 출력해야하기 때문에 outWordArr의 원소 값이 -1인 경우에만 초기화 시킴
                outWordArr[in - 'a'] = i;
            }
        }
        for(int answer: outWordArr) {
            System.out.print(answer + " ");
        }

    }
}
