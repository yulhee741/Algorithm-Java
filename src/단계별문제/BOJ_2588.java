package 단계별문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2588 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Integer.parseInt(br.readLine());
        char[] num2 = br.readLine().toCharArray();

        System.out.println(num1 * (num2[2]-'0'));
        System.out.println(num1 * (num2[1]-'0'));
        System.out.println(num1 * (Character.getNumericValue(num2[0])));
        int num = Integer.parseInt(new String(num2));
        System.out.println(num1 * num);
    }
}
