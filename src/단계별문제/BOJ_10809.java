package 단계별문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_10809 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] chk = new int[26];
        Arrays.fill(chk, -1);
        StringBuilder sb = new StringBuilder();

        for(int i=0; i <str.length(); i++) {
            int c = str.charAt(i) - 'a';
            if (chk[c] == -1)
                chk[c] = i;
        }
        for(int ch : chk){
            sb.append(ch);
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}
