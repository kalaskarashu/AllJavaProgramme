import java.io.File;
import java.io.IOException;
class Test
{
	public static void main(String[] args) throws IOException,InterruptedException
	{
		try{
			System.out.println(11/1);
			String s="ashutosh";
			System.out.println(s.length());
		}catch (Exception e)
		{
			System.out.println(e);
		}finally
		{
			System.out.println("Always Exceutes");
		}
    }
}