package codeforces;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

/**
 * Created by svkreml on 09.09.2016.
 */
public class A339 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Vector<Character> output = new Vector();
        int i = 0;
        String c = scan.next();
        for (int a = 0; a < c.length(); a++) {
            if (c.charAt(a) != '+')
                output.add(c.charAt(a));
        }
        Collections.sort(output);
        for (int f = 0; f < output.size() - 1; f++) {
            System.out.print(output.get(f) + "+");
        }
        System.out.println(output.get(output.size() - 1));
    }
}
