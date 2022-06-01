package DFS;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_10026 {

    static int n;
    static char[][] graph;
    static boolean[][] visited;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        graph = new char[n][n];
        visited = new boolean[n][n];
        for(int i=0; i<n; i++)
            graph[i] = br.readLine().toCharArray();

        // 비 적록색약
        int cnt = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(!visited[i][j]){
                    dfs(i,j);
                    cnt++;
                }
            }
        }
        int normalCnt = cnt;
        cnt = 0;
        visited = new boolean[n][n];

        //적록색약
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(graph[i][j]=='G'){
                    graph[i][j]='R';
                }
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(!visited[i][j]){
                    dfs(i,j);
                    cnt++;
                }
            }
        }

        int RGCnt = cnt;
        System.out.println(normalCnt + " " + RGCnt);


    }

    public static void dfs(int x, int y){
        visited[x][y] = true;
        char nChar = graph[x][y];
        for(int i=0; i<4; i++){
            int nX = x+dx[i];
            int nY = y+dy[i];

            if(nX<0 || nY<0 || nX>=n || nY>=n){
                continue;
            }

            if(!visited[nX][nY] && graph[nX][nY] == nChar){
                dfs(nX,nY);
            }
        }
    }
}
