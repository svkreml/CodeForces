package codeforces;

import java.util.Scanner;

public class A71 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            String S = s.next();
            if (S.length() > 10) {
                S = S.charAt(0) + String.valueOf(S.length() - 2) + S.charAt(S.length() - 1);
            }
            System.out.println(S);
        }
    }
}
