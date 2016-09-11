package codeforces;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//TODO working, but too slow
public class F710 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        OutputStream out = new BufferedOutputStream(System.out);
        int m = scanner.nextInt();
        Set<String> D = new HashSet<>();
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            String p = scanner.next();
            if (a == 1) {
                D.add(p);
            } else if (a == 2) {
                D.remove(p);
            } else if (a == 3) {
                int c = 0;
                for (String P : D) {
                    int j = 0;
                    while (j < p.length()) {
                        int b = p.indexOf(P, j);
                        if (b < 0) break;
                        //j++;
                        j += P.length();
                        if (b < j) c++;
                    }
                }
                out.write((c + "\n").getBytes());
                out.flush();
            } else throw new Error();
        }
    }
}
