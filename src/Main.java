import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        //Scanner s = new Scanner(System.in);
        //int N = s.nextInt();
        Integer a=2,b=10,c=6,d=30;
        Long salt = Long.valueOf((a*1000000000)+(b*1000000)+(c*1000)+d);
        System.out.println("salt = " + salt);
        a=2;b=10;c=7;d=30;
        salt = Long.valueOf((a*1000000000)+(b*1000000)+(c*1000)+d);
        System.out.println("salt = " + salt);
        
    }

}