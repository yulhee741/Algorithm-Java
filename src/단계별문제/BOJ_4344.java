package 단계별문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_4344 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr;
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for(int i = 0 ; i < T ; i++) {

            st = new StringTokenizer(br.readLine()," ");
            int N = Integer.parseInt(st.nextToken());
            arr = new int[N];
            double sum = 0;

            for(int j = 0 ; j < N ; j++) {
                int score = Integer.parseInt(st.nextToken());
                arr[j] = score;
                sum += score;
            }
            double mean = (sum / N) ;
            double cnt = 0;

            for(int j = 0 ; j < N ; j++) {
                if(arr[j] > mean) {
                    cnt++;
                }
            }

            System.out.printf("%.3f%%\n",(cnt/N)*100);

        }
    }
}
