import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        //System.out.println(N);
        int max=0;
        int numbers[] = new int[N];
        for (int i=0;i<N;i++){
            numbers[i]= s.nextInt();
            //System.out.println(numbers[i]);
            if(numbers[i]>max) max=numbers[i];
        }
        System.out.println(max);
        int iter[]= new int[max+1];
        iter[0]=N;
        for(int i=0;i<max;i++){
            if(i>10) break;
            int count=0;
            for(int j=0;j<N;j++){
                System.out.println(i+" "+ j);
                if(j>i)
                    count++;
            }
            iter[i]=N;
        }
        for (int a=0;a< max+1;a++) {
            System.out.println(iter[a]);
        }
    }

}