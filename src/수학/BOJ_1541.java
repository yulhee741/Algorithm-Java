package 수학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_1541 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String operation = br.readLine();

        String[] minusSplit = operation.split("-");
        //마이너스 기준으로 전에 있는 값들 모두 더하기
        String[] plusSplit = minusSplit[0].split("\\+");
        int plusSum=0;
        for (String plus : plusSplit)
            plusSum += Integer.parseInt(plus);

        //마이너스 기준으로 후에 있는 값들 더하기
        int minusSum = 0;
        for(int i=1; i<minusSplit.length; i++){
            String[] nums = minusSplit[i].split("\\+");
            for (String num : nums)
                minusSum += Integer.parseInt(num);
        }

        System.out.println(plusSum-minusSum);
        br.close();
    }
}
