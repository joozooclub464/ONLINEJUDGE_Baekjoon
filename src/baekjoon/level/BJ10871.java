package baekjoon.level;
// X보다 작은 수

import java.util.Scanner;

public class BJ10871 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt(); //정수 N개의 수열
        int X = scan.nextInt(); //X 보다 작은 수
        int A[] = new int[N];
        int re[] = new int[A.length];
        for(int i=0; i<N; i++) {
            A[i] = scan.nextInt();
        }
        for(int j=0; j<N; j++) {
            if(A[j]<X) {
                System.out.print(A[j]+" ");
            }
        }
    }
}
