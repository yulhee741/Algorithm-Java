package 단계별문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_8958 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i=0; i < T; i++) {
            String str = br.readLine();
            int result = 0;
            int cnt = 0;
            for(int j=0; j < str.length(); j++){
                if (str.charAt(j) == 'O'){
                    cnt ++;
                } else {
                    cnt = 0;
                }
                result += cnt;
            }
            System.out.println(result);
        }
    }
}
