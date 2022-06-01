package 구현;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ11866 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<N; i++) {
            q.offer(i+1);
        }

        int cnt = 0;
        String result = "<";
        while(!q.isEmpty()) {
            cnt++;
            if(cnt==K) {
                result += q.poll()+", ";
                cnt = 0;
            }else{
                q.offer(q.poll());
            }
        }
        result = result.substring(0,result.length()-2) + ">";
        System.out.println(result);
    }
}
