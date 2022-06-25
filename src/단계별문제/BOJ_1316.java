package 단계별문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            String chk = "" + word.charAt(0);
            boolean result = true;
            for (int j = 1; j < word.length(); j++) {
                if (word.charAt(j) != word.charAt(j - 1)) {
                    if (chk.contains(String.valueOf(word.charAt(j)))) {
                        result = false;
                    }else {
                        chk += word.charAt(j);
                    }
                }
            }
            if (result==true) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
