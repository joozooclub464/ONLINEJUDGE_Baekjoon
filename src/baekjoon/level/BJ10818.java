package baekjoon.level;
//최소, 최대
import java.util.Scanner;

public class BJ10818 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); //정수의 개수
        int a[] = new int[N];
        int max = -1000000;
        int min = 1000000;

        for(int i=0;i<a.length;i++) {
            a[i] = scan.nextInt();
        }

        for(int j=0;j<a.length;j++) {
            if(max < a[j]) {
                max = a[j];
            }
            if(min > a[j]) {
                min = a[j];
            }
        }
        System.out.println(min);
        System.out.println(max);

    }
}
