package codeforces;

import java.util.Scanner;

/**
 * Created by svkreml on 08.09.2016.
 */
public class A96 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int x = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                x++;
                if (x == 6) {
                    System.out.println("YES");
                    System.exit(0);
                }
            } else x = 0;
        }
        System.out.println("NO");
    }
}
