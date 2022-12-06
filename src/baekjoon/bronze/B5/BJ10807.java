package baekjoon.bronze.B5;
//개수 세기
import java.util.Scanner;

public class BJ10807 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int arr[] = new int[N];
        int c = 0;

        //배열에 담기
        for(int i=0;i<N;i++) {
            arr[i] = scan.nextInt();
        }
        int v = scan.nextInt();
        for(int j=0; j<arr.length; j++) {
            if(arr[j] == v) {
                c++;
            }
        }
        System.out.println(c);

    }
}
