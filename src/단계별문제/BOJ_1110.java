package 단계별문제;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_1110 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] tmp = new int[2];
        String result = "-1";
        int cnt = 0;

        tmp[0] = n/10;
        tmp[1] = n%10;

        while(Integer.parseInt(result)!= n) {
            result = "";
            int x = tmp[0] + tmp[1];
            tmp[0] = tmp[1];
            tmp[1] = x % 10;
            result += tmp[0]+""+tmp[1];
            cnt ++;
        }

        System.out.println(cnt);

        sc.close();
    }
}
