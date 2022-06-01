package 수학;

import java.util.Scanner;

public class BOJ_1735 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();

        // 분자 구하기
        int x = (a1 * b2) + (a2 * b1);
        // 분모 구하기
        int y = a2 * b2;
        // 최대공약수 구하기
        int gcd = eucd(x, y);

        x = x/gcd;
        y = y/gcd;
        System.out.println(x + " " +y);
    }

    public static int eucd(int a, int b){
        while(b!=0){
            int x = a%b;
            a = b;
            b = x;
        }
        return a;
    }
}
