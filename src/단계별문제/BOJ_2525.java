package 단계별문제;

import java.util.Scanner;

public class BOJ_2525 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int time = A * 60 + B + C;
        A = time / 60;
        B = time % 60;

        if (A >= 24)
            A -= 24;

        System.out.println(A + " " + B);
        sc.close();
    }
}
