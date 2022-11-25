package baekjoon.level;
//알람시계
import java.util.Scanner;
public class BJ2884 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int H = scan.nextInt();
        int M = scan.nextInt();
        //조건
        if(H >= 0 && H <= 23) {
            if(M >= 0 && M <= 59) {
                if(M-45<0) {
                    M = M + 15;
                    if (H-1<0) {
                        H = 23;
                    } else if (H-1>0) {
                        H -= 1;
                    }
                } else {
                    M -=45;
                }
                //ming
//                if(M-45<0) {
//                    M = M + 15;
//                    H -= 1;
//                    if(H ==-1){
//                        H = 23;
//                    }
//                }else if(M>=45) {
//                    M = M-45;
//                }
                System.out.println(H + " " + M);
            }
        }else {
            System.out.println("시간은 0시부터 23시 사이, 분은 0분 부터 59분 사이로 구성되어 있습니다.");
        }

    }
}
