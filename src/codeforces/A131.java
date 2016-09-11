package codeforces;
import java.util.Scanner;

/**
 * Created by svkreml on 10.09.2016.
 */
public class A131 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        StringBuilder sB = new StringBuilder();
        if(s.matches("[a-z][A-Z]*")) {
            sB.append((char)(s.charAt(0)-32));
            for (int i = 1; i < s.length(); i++)
                sB.append((char)(s.charAt(i)+32));
        }else if(s.matches("[A-Z]*")) {
            sB.append(s.toLowerCase());
        }else
            sB.append(s);
        System.out.println(sB);
    }
}