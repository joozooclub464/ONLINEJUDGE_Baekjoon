package baekjoon.bronze.B5;
//문자열
import java.util.Scanner;

public class BJ9086 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = scan.nextInt(); //반복횟수(첫줄)
        String[] ans = new String[cnt];//정답 넣을 배열

        for(int i=0; i<cnt; i++) {
            String str = scan.next();
            String[] arr = str.split("");
            ans[i] = arr[0]+arr[arr.length-1];
        }
        for(int i=0; i<ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}