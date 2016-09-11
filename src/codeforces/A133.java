package codeforces;

import java.util.Scanner;

/**
 * Created by svkreml on 10.09.2016.
 */
public class A133 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        if(s.matches("([!-~]*)(H|Q|9|\\+)([!-~]*)"))
        System.out.println("YES"); else
        System.out.println("NO");
    }
}
