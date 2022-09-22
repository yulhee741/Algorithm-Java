package 단계별문제;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_1004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int result = 0;

            StringTokenizer st = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());

            int n = Integer.parseInt(br.readLine());

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                int radius = Integer.parseInt(st.nextToken());

                boolean startCheck = false;
                boolean endCheck = false;

                if (Math.pow(startX - x, 2) + Math.pow(startY - y, 2) > Math.pow(radius, 2)) startCheck = true;
                if (Math.pow(endX - x, 2) + Math.pow(endY - y, 2) > Math.pow(radius, 2)) endCheck = true;

                if (startCheck == true && endCheck == false) result++;
                else if (startCheck == false && endCheck == true) result++;
            }
            bw.write(result + "\n");
        }
        bw.close();
        br.close();
    }
}
