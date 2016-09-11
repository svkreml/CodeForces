package codeforces;

import java.util.Scanner;

/**
 * Created by svkreml on 09.09.2016.
 */
public class A112 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next().toLowerCase();
        String s2 = scan.next().toLowerCase();

        if(s1.compareTo(s2)>0)
            System.out.println(1);
        if(s1.compareTo(s2)<0)
            System.out.println(-1);
        if(s1.compareTo(s2)==0)
            System.out.println(0);
    }
}
