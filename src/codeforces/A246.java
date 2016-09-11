package codeforces;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by svkreml on 11.09.2016.
 */
public class A246 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        Set<Character> letters = new HashSet<>();
        for (int i = 0 ; i<input.length();i++){
            letters.add(input.charAt(i));
        }
        System.out.println((letters.size()%2!=0)?"IGNORE HIM!":"CHAT WITH HER!");
    }
}
