package 단계별문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1157 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        int[] chk = new int[26];

        for (int i = 0; i < word.length(); i++) {
            int c = Character.toUpperCase(word.charAt(i)) - 'A';
            chk[c]++;
        }
        int max = -1;
        int maxIndex = -1;
        int cnt = 0;

        for (int i = 0; i < chk.length; i++) {
            if (max == chk[i]) {
                cnt++;
                continue;
            }
            if (max < chk[i]) {
                max = chk[i];
                maxIndex = i;
                cnt=0;
            }

        }
        if (cnt == 0) {
            char C = (char)(maxIndex + 'A');
            System.out.println(C);
        } else {
            System.out.println("?");
        }
    }
}
