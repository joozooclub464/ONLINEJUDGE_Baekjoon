package baekjoon.bronze.B3;
//최댓값
import java.util.Scanner;

public class BJ2562 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N[] = new int[9];
        int max = 1;
        int c = 0;

        for(int i=0;i<N.length;i++) {
            N[i]= scan.nextInt();
        }
        for(int j=0;j<N.length;j++) {
            if(max<N[j]) {
                max = N[j];
                c = j+1;
            }
        }
        System.out.println(max);
        System.out.println(c);
    }
}
