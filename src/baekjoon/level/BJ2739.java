package baekjoon.level;
//구구단
import java.util.Scanner;

public class BJ2739 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //입력받은 단
        int N = scan.nextInt();
        //조건
        if(N>=1 && N<=9) {
            for(int i = 1; i<=9; i++) {
                System.out.println(N+" * "+i+" = "+(N*i));
            }
        } else {
            System.out.println("N은 1보다 크거나 같고, 9보다 작거나 같아야 합니다.");
        }
    }
}
