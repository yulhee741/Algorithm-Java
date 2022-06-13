package 단계별문제;

import java.util.Scanner;

public class BOJ_10871 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();
        int tmp = 0;
        String result = "";

        for (int i = 0; i < N; i++) {
            tmp = sc.nextInt();
            if (tmp < X) {
                result += tmp + " ";
            }
        }
        System.out.println(result);
    }
}
