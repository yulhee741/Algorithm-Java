package BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_11725 {
    static int n;
    static int[] parent;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        ArrayList<Integer>[] graph = new ArrayList[n+1];
        for(int i=1; i<=n; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<n-1; i++){
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph[u].add(v);
            graph[v].add(u);
        }

        parent = new int[n+1];
        visited = new boolean[n+1];
        Queue<Integer> q = new LinkedList<>();

        q.offer(1);
        visited[1] = true;
        while(!q.isEmpty()){
            int u = q.poll();
            for(int v: graph[u]){
                if(!visited[v]){
                    q.offer(v);
                    visited[v] = true;
                    parent[v] = u;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i=2; i<=n; i++){
            sb.append(parent[i]).append("\n");
        }
        System.out.println(sb);
        br.close();
    }
}
