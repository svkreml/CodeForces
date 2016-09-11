package codeforces;

import java.util.Scanner;

/**
 * Created by svkreml on 08.09.2016.
 */
public class A158 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int score = 0;
        boolean flag = false;
        for (int i = 1; i <= n; i++) {
            int a = scan.nextInt();
            if (k == i) {
                score = a;
                flag = true;
            }
            if (a==0) {
                System.out.println(i-1);
                System.exit(0);
            }
            if (flag && a < score) {
                System.out.println(i-1);
                System.exit(0);
            }
            if (i == n&&a>0) {
                System.out.println(n);
                System.exit(0);
            }
        }
        System.out.println(0);
    }
}
