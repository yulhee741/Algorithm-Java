package 단계별문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_1110 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int a = 0; // 십의자리
        int b = 0;  // 일의자리
        int sum = n;
        int cnt = 0;

        while (true) {
            a = sum / 10;
            b = sum % 10;
            sum = a + b;

            sum = b * 10 + sum % 10;
            cnt++;
            if (n == sum) {
                break;
            }
        }

        System.out.println(cnt);
    }
}
