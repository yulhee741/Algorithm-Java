package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_5002 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        //대기열 큐
        Queue<Character> waitQ = new LinkedList<Character>();
        int man = 0;
        int woman = 0;

        for(int i=0; i<input.length(); i++) {
            char person = input.charAt(i);
            if(!waitQ.isEmpty()) {
                char gender = waitQ.peek();
                if(gender == 'M') {
                    if(Math.abs((man + 1) - woman) <= n) {
                        man++;
                        waitQ.poll();
                    }
                }
                else if(gender == 'W') {
                    if(Math.abs(man - (woman + 1)) <= n) {
                        woman++;
                        waitQ.poll();
                    }
                }
            }
            if(person == 'M') {
                if(Math.abs((man + 1) - woman) <= n) {
                    man++;
                } else if(waitQ.isEmpty()) {
                    waitQ.add(person);
                }else {
                    break;
                }
            }else if(person == 'W') {
                if(Math.abs(man - (woman + 1)) <= n) {
                    woman++;
                } else if(waitQ.isEmpty()) {
                    waitQ.add(person);
                } else {
                    break;
                }
            }
        }
        System.out.println(man + woman);

    }

}
