package codeforces;

import java.util.Scanner;

/**
 * Created by svkreml on 11.09.2016.
 */
public class A583 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        boolean roads[][] = new boolean[n + 1][n + 1];
        for (int i = 1; i < n*n+1; i++) {
            int h = scan.nextInt();
            int v = scan.nextInt();
            if (roads[h][v] == false) {
                System.out.print(i + " ");
                for (int hh = 1; hh < n + 1; hh++)
                    roads[hh][v] = true;
                for (int vv = 1; vv < n + 1; vv++)
                    roads[h][vv] = true;
            }
        }
    }
}
