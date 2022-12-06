package baekjoon.bronze.B5;
//과제 안 내신 분...?
import java.util.Scanner;

public class BJ5597 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num[] = new int[31];
        for(int i=1; i<29;i++) {
            int sub = scan.nextInt();
            num[sub] = 1;
        }
        for(int i=1; i<num.length; i++) {
            if(num[i] != 1) {
                System.out.println(i);
            }
        }

    }
}
