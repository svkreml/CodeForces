package codeforces;

import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long m = s.nextInt();
        long n = s.nextInt();
        long a = s.nextInt();
        if (m % a != 0) m = m + a - m % a;
        if (n % a != 0) n = n + a - n % a;
        System.out.println(m * n / a / a);
    }
}
