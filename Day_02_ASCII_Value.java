

import java.io.*;
class ascii
{
    public static void main(String args[])throws IOException
    {
        DataInputStream d=new DataInputStream(System.in);
        System.out.print("Enter the character=");
        char c =d.readLine().charAt(0);  
        int s=c;
        System.out.println("The ascii value is="+s);
    }
}
