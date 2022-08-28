import java.io.File;
import java.io.IOException;

class helloworld
{
    public static void main(String[] args) throws IOException 
    {
        System.out.println("Hello");
        File f1=new File("Hello.txt");
        f1.createNewFile();
    }

}