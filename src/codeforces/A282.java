package codeforces;

import java.util.Scanner;

/**
 * Created by svkreml on 08.09.2016.
 */
public class A282 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        int x=0;
        for (int i=0;i<n;i++){
            String s = scan.next();
            if(s.charAt(1)=='+') x++;
            else x--;
        }
        System.out.println(x);
    }
}
