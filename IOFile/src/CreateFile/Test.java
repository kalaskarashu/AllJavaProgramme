package CreateFile;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("H:/Webdelopment/JAVA programing/IOFile/Ashutosh/makes.txt",true);
		PrintWriter pw=new PrintWriter(fw);
		pw.println("Ashutosh can do anything");
		pw.println(1234);
		pw.flush();
		pw.close();
	}

}
