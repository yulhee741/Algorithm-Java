package 단계별문제;

import java.util.Scanner;

public class BOJ_10951 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()) {
            int A, B;
            A = sc.nextInt();
            B = sc.nextInt();

            System.out.println(A + B);
        }
        sc.close();
    }
}
