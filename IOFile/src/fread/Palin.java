package fread;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Palin 
{
    public static void main(String[] args) throws IOException
    {
        FileWriter f1=new FileWriter("Hello.txt",true);
        PrintWriter pw=new PrintWriter(f1);
        pw.println("New World");
        pw.flush();
        pw.close();
        
    }
}
