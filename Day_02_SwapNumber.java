
import java.io.*;
class swap
{
    public static void main(String args[])throws IOException
    {
        DataInputStream d=new DataInputStream(System.in);
        System.out.print("Enter a value=");
        int a=Integer.parseInt(d.readLine());
        System.out.print("Enter b value=");
        int b=Integer.parseInt(d.readLine());
        int c;
        c=b;
        b=a;
        a=c;
        System.out.println("After Swapping");
        System.out.println("The value of a="+a);
        System.out.println("The value of b="+b);
    }
}
