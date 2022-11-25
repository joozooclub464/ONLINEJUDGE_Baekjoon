package baekjoon.level;

public class BJ10869 {
    public static void main(String[] args) {

        //1부터 10까지의 숫자 중 랜덤
        //0으로 나눌 수 없기 때문에 +1을 해줌
        int a = (int)(Math.random()*10)+1;
        int b = (int)(Math.random()*10)+1;

        System.out.println(a);
        System.out.println(b);

        System.out.println("a+b="+(a+b));
        System.out.println("a-b="+(a-b));
        System.out.println("a*b="+(a*b));
        System.out.println("a/b="+(int)(a/b));
        System.out.println("a%b="+(int)(a%b));
    }

}
