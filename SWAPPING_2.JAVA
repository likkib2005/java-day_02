import java.util.*;
public class SWAPPING_2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        int g=sc.nextInt();
        b=b+g;
        g=b-g;
        b=b-g;
        String res=String.format("After swapping /n boy=%d /n girl=%d",b,g);
        System.out.println(res);
    }
}