package 단계별문제;

public class BOJ_4673 {

    public static void main(String[] args) {
        boolean[] arr = new boolean[10001];
        for (int i = 1; i < 10001; i++) {
            int num = checkSelfNum(i);
            if (num < 10001) {
                arr[num] = true;
            }
        }
        for (int i = 1; i < 10001; i++) {
            if (!arr[i]) {
                System.out.println(i);
            }
        }
    }

    private static int checkSelfNum(int num) {
        int sum = num;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
