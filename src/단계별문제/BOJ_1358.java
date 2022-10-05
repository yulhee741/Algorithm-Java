package 단계별문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1358 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int startX = Integer.parseInt(st.nextToken());
        int startY = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int endX = startX + W;
        int endY = startY + H;
        int R = H / 2;
        int halfY = startY + R;
        int x, y, cnt = 0;

        for (int i = 0; i < P; i++) {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y = Integer.parseInt(st.nextToken());
            if ((startX <= x && x <= endX && startY <= y && y <= endY) ||
                    getDistance(x, y, startX, halfY) <= R ||
                    getDistance(x, y, endX, halfY) <= R)
                cnt++;
        }
        br.close();
        System.out.println(cnt);
    }

    public static double getDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}
