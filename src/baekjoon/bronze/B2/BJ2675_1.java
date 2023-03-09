package baekjoon.bronze.B2;
//문자열 반복(2번 방법)
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BJ2675_1 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt(); //테스트 케이스 개수
        List<String> resultList = new ArrayList<>(); //resultList 하나의 테스트 케이스 끝->ArrayList에 add
        StringBuffer sb = new StringBuffer(); //한개의 테스트 케이스의 글자를 r번 append하기 위해 用
        for(int i=0; i<t; i++) {
            int r = scan.nextInt();

            String tempstr = scan.nextLine().trim(); //문자열 s를 입력할 tempstr변수
            for(int j=0; j<tempstr.length(); j++) {
                for(int k=0; k<r; k++) {
                    sb.append(tempstr.charAt(j)); //tempstr의 j번째 있는 char를 sb에 r번 append
                }
            }
            resultList.add(sb.toString());
            sb.delete(0,sb.length()); //sb를 resultList에 add하고 기존에 있던 sb 문자열을 delete함수로 삭제
        }
        for(String tempstr : resultList) {
            System.out.println(tempstr);
        }

    }
}
