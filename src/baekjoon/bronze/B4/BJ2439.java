package baekjoon.bronze.B4;
//별찍기2
import java.util.Scanner;

public class BJ2439 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n>=1 && n<=100) {
            for(int i=0;i<n;i++) {
                for(int j=n-1;j>i;j--) {
                    System.out.print(" ");
                }
                for(int k=0;k<=i;k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
