package codeforces;

import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int w = s.nextInt();
        for (int i = 2; i <= w / 2; i++)
            if (i % 2 == 0 && (w - i) % 2 == 0) {
                System.out.println("YES");
                System.exit(0);
            }
        System.out.println("NO");
    }
}
