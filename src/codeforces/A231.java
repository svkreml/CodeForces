package codeforces;

import java.util.Scanner;

/**
 * Created by svkreml on 08.09.2016.
 */
public class A231 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k=0;
        for(int i=0;i<n;i++){
            int b =0;
            if(scan.nextInt()==1) b++;
            if(scan.nextInt()==1) b++;
            if(scan.nextInt()==1) b++;
            if(b>=2) k++;
        }
        System.out.println(k);
    }
}
