package codeforces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by svkreml on 11.09.2016.
 */
public class C4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Map<String, Integer> names = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = scan.next();
            if (names.containsKey(name)) {
                names.replace(name, names.get(name) + 1);
                String newName = name + (names.get(name));
                names.put(newName, 0);
                System.out.println(newName);
            } else {
                names.put(name, 0);
                System.out.println("OK");
            }
        }
    }
}
