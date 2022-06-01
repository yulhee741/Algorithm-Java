package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10973 {
    static int N;
    static int[] permutaion;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        permutaion = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++)
            permutaion[i] = Integer.parseInt(st.nextToken());

        if(check()) {
            for (int i=0; i<N; i++) {
                System.out.print(permutaion[i] + " ");
            }
        } else {
            System.out.println(-1);
        }

    }

    //이전 순열이 있는지 확인
    static boolean check() {
        int i = N-1;
        while(i>0 && permutaion[i-1] <= permutaion[i]) i-=1;
        if(i<=0) return false; //가장 작은 순열

        int j = N-1;
        while (permutaion[j] >= permutaion[i-1]) j-=1;

        int tmp = permutaion[i-1];
        permutaion[i-1] = permutaion[j];
        permutaion[j] = tmp;

        j = N-1;
        while (i<j) {
            tmp = permutaion[i];
            permutaion[i] = permutaion[j];
            permutaion[j] = tmp;
            i += 1;
            j -= 1;
        }
        return true;
    }
}
