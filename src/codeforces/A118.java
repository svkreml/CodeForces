package codeforces;

import java.util.Scanner;

/**
 * Created by svkreml on 08.09.2016.
 */
public class A118 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next().toLowerCase();
        StringBuilder buffer=new StringBuilder();
        char c;
        for (int i = 0; i < input.length(); i++) {
            c = input.charAt(i);
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='y'){
            }else {
                buffer.append('.');
                buffer.append(c);
            }
        }
        System.out.println(buffer);
    }
}
