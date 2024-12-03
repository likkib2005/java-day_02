import java.util.*;
class even_odd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=(a&b);
        if((a&b)==0)
        {
        System.out.println("even nmber");
        }
        else
        {
        System.out.println("odd number");
        }
    }
}