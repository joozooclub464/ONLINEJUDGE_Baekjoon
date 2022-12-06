package baekjoon.bronze.B2;
//나머지
import java.util.Scanner;

public class BJ3052 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rm[] = new int[42];
        int count = 0;

        for(int i=0;i<10;i++) {
            int a = scan.nextInt();
            rm[a%42]  = 1;
        }
        for(int i=0;i<rm.length;i++) {
            if(rm[i] == 1) {
                count++;
            }
        }System.out.println(count);
    }
}
//나머지는 1~42 사이의 수.
//나머지가 될 수 있는 수들을 인덱스로 하는 배열을 만든 뒤
//입력받은 수의 나머지를 계산하여 나머지에 해당하는 인덱스에 1을 넣음.
//배열을 돌리며 인덱스의 요소가 1인 인덱스의 갯수를 세면 나머지의 종류의 갯수를 알 수 있음.
