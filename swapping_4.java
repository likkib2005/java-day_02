import java.util.*;
class swapping_4
{
    public static void main(String args[])
    {
        int a=12,b=14;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a);
        System.out.println(b);
    }
}