package 분할정복;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1780 {

    static int[][] board;
    static int gray;
    static int white;
    static int black;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        board = new int[n][n];
        StringTokenizer st;

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        division(0,0,n);

        System.out.println(gray);
        System.out.println(white);
        System.out.println(black);
    }

    public static void division(int r, int c, int size) {

        if(check(r,c,size)) {
            if(board[r][c] == -1) {
                gray++;
            }else if(board[r][c] == 0){
                white++;
            }else {
                black++;
            }
            return;
        }

        int newSize = size / 3;

        division(r, c, newSize);
        division(r,c+newSize, newSize);
        division(r, c+(newSize * 2), newSize);

        division(r+newSize, c, newSize);
        division(r+newSize, c+newSize, newSize);
        division(r+newSize, c+(newSize*2), newSize);

        division(r+(newSize*2), c, newSize);
        division(r+(newSize*2), c+newSize, newSize);
        division(r+(newSize*2), c+(newSize*2), newSize);


    }

    public static boolean check(int r, int c, int size) {
        int color = board[r][c];

        for(int i=r; i<r+size; i++){
            for(int j=c; j<c+size; j++){
                if (color != board[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
