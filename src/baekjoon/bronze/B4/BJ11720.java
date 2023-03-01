package baekjoon.bronze.B4;
//숫자의 합
import java.util.Scanner;

public class BJ11720 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); //숫자의 개수
        String s = scan.next();
        int sum = 0;
        String[] strArray = s.split(""); //split 함수에 공백문자를 파라미터로 지정해 하나씩 자름
        for (String s1 : strArray) { //향상된 for문을 사용하여 sum에 잘라낸 숫자를 더해줌
            sum += Integer.parseInt(s1); //문자열로 받아왔기 때문에 Integer.parseInt로 int형 형변환을 해줌
        }
        System.out.println(sum);
    }
}
//숫자의 개수를 받아온건 사용하지 않고 문제를 풀었는데 저걸 써서 푸는 방법이 있지 않을까? 생각해볼것..
