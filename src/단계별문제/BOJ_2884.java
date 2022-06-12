package 단계별문제;

import java.util.Scanner;

public class BOJ_2884 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int M = sc.nextInt();

        M = M - 45;
        if (M < 0) {
            H = H - 1;
            M = M + 60;
        }
        if (H < 0)
            H = 23;

        System.out.println(H + " " + M);
        sc.close();
    }
}
