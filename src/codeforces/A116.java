package codeforces;

import java.util.Scanner;

/**
 * Created by svkreml on 10.09.2016.
 */
public class A116 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int curr = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            curr = curr - a + b;
            if(curr>max) max = curr;
        }
        System.out.println(max);
    }
}
