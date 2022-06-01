package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BOJ_11478 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Set<String> set = new HashSet<>();

        for(int i=0; i<s.length(); i++) {
            for(int j=i+1; j<=s.length(); j++) {
                set.add(s.substring(i,j));
            }
        }
        System.out.println(set.size());
    }
}
