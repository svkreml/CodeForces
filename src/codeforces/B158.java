package codeforces;

import java.util.Scanner;

/**
 * Created by svkreml on 08.09.2016.
 */
public class B158 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a= new int[5];
        for (int i=0; i<n;i++){
            a[scan.nextInt()]++;
        }
        int count = a[4]+a[2]/2;
            count+=a[3];
        a[1]-=a[3];
        if(a[1]<0) a[1]=0;
        if(a[2]%2==1) a[1]+=2;
        if(a[1]>0){
            count+=a[1]/4;
            if(a[1]%4!=0) count++;
        }
        System.out.println(count);
    }
}
