package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_13335 {
    static int N,W,L;
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        W = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        Queue<Integer> trucks = new LinkedList<>();
        for(int n=0; n<N; n++) {
            trucks.offer(Integer.parseInt(st.nextToken()));
        }

        Queue<Integer> bridge = new LinkedList<>();
        for(int w=0; w<W; w++) {
            bridge.offer(0);
        }
        int cnt = 0;
        int sum = 0;

        while(!bridge.isEmpty()) {
            sum -= bridge.poll();
            if(!trucks.isEmpty()) {
                if(sum + trucks.peek() <= L) {
                    int newTruck = trucks.poll();
                    sum += newTruck;
                    bridge.offer(newTruck);
                }else {
                    bridge.offer(0);
                }
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}
