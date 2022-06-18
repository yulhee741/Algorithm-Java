package 단계별문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1065 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N < 100) {
            System.out.println(N);
        } else {
            int cnt = 99;
            for (int i = 100; i <= N; i++) {
                cnt += checkNum(i);
            }
            System.out.println(cnt);
        }
    }


    private static int checkNum(int num) {
        int a = num / 100;
        int b = (num % 100) / 10;
        int c = num % 10;

        if (a - b == b - c) {
            return 1;
        }
        return 0;
    }
}
