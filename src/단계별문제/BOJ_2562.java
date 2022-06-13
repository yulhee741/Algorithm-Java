package 단계별문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BOJ_2562 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int cnt = 0;
        for ( int i=0; i<9; i++) {
            int var = Integer.parseInt(br.readLine());
            if (var > max) {
                max = var;
                cnt = i;
            }
        }
        System.out.println(max);
        System.out.println(cnt+1);
    }
}
