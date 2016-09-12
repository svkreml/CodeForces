package codeforces;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by svkreml on 11.09.2016.
 * <p>
 * true == '.'
 */
public class C611 {
    static Scanner scan = new Scanner(System.in);
    // static String buf = null;
    // static Scanner scanString = new Scanner(buf);
    static Map<Long, Integer> cashe = new HashMap<>();
    static BufferedReader in = new BufferedReader((new InputStreamReader(System.in)));
    static OutputStream out = new BufferedOutputStream(System.out);
    static int h;
    static int w;
    static int q;
    static boolean field[][] = null;
    static int zones[][] = null;


    public static void main(String[] args) throws IOException {
        inputField();
        inputQuaries();
        //showField();
        //showQuaries();
        for (int n = 1; n < q + 1; n++) {
            // System.out.println();
            out.write((computeQuarie(n) + "\n").getBytes());
        }
        out.flush();
    }


    static void inputField() {
        h = scan.nextInt();
        w = scan.nextInt();
        field = new boolean[h + 2][w + 2];
        for (int i = 1; i < h + 1; i++) {
            String row = scan.next();
            for (int j = 1; j < w + 1; j++) {
                field[i][j] = row.charAt(j - 1) == '.';
            }
        }
    }

    static void inputQuaries() {
        q = scan.nextInt();
        zones = new int[q + 1][5];
        for (int i = 1; i < q + 1; i++) {
            for (int j = 1; j < 5; j++) {
                int number = scan.nextInt();
                zones[i][j] = number;
            }
        }
    }

    static int computeQuarie(int n) {
        int ways = 0;
        int minJ = zones[n][1];
        int maxJ = zones[n][3];
        int minI = zones[n][2];
        int maxI = zones[n][4];
        Long salt = Long.valueOf((minJ*1000000000)+(maxJ*1000000)+(minI*1000)+maxI);
        if (cashe.containsKey(salt))
            return cashe.get(salt);
        else
        {
            for (int j = minJ; j <= maxJ; j++)//ver
                for (int i = minI; i <= maxI; i++)//gor
                {
                    //System.out.println("throw = ["+j+"]"+"["+i+"]");
                    if (field[j][i] && field[j][i + 1] && (i < maxI)) {
                        ways++;
                        //  System.out.println("way = ["+j+"]"+"["+i+"]-["+j+"]"+"["+(i+1)+"]");
                    }
                    if (field[j][i] && field[j + 1][i] && (j < maxJ)) {
                        ways++;
                        //     System.out.println("way = ["+j+"]"+"["+i+"]-["+(j+1)+"]"+"["+(i)+"]");
                    }
                }
            cashe.put(salt, ways);
            return ways;
        }
    }

    /*static void showField() {
        for (int i = 0; i <= h + 1; i++) {
            for (int j = 0; j <= w + 1; j++) {
                System.out.print(field[i][j] ? '.' : '#');
            }
            System.out.println();
        }
    }

    static void showQuaries() {
        for (int i = 1; i <= q; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(zones[i][j] + " ");
            }
            System.out.println();
        }
    }*/
}
