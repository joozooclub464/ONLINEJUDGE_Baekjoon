package baekjoon.bronze.B2;
//단어의 개수
import java.util.Arrays;
import java.util.Scanner;

public class BJ1152 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine(); //입력받은 문장
        String[] starr = str.split(" "); //빈칸으로 나눈 단어를 배열에 넣기
//        for(String s : starr){ //배열에 잘 들어갔는지 확인하는 코드
//            System.out.println(s);
//        }

        //공백 제거하며 split하기
//        String[] starr = Arrays.stream(str.split(" "))
//                .map(String::trim)
//                .toArray(String[]::new);
//        System.out.println(Arrays.toString(starr));

        if(starr.length==0) { //아무것도 입력하지 않은 경우 -> 배열[0]:error 
            System.out.println(0); // -> 0을 프린트 후 프로그램 종료
            System.exit(0); //프로그램 강제로 종료
        }
        if(starr[0].equals("")) { //첫번째 배열에 ""이 들어갔으면 배열의 길이 -1을 출력
            System.out.println(starr.length-1);
        } else { //정상적으로 들어갔으면 배열의 길이를 출력
            System.out.println(starr.length);
        }
    }
}
//계속해서 배열범위 초과 에러가 뜸...(런타임에러 ArrayIndexOutOfBounds)
//몰라서 구글링해봤는데 스페이스바만 누르고 엔터를 누르면 split메서드가 작동을 안 함.
//입력받은 문자열의 길이가 0일때 종료시키는 코드를 넣어서 해결.