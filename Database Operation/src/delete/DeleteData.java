package delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Bookinfo","root","root");
		String sql="delete from book where id=?";
		PreparedStatement ps=con.prepareStatement(sql);
		System.out.println("Enter the id you wnat delete");
		int id=sc.nextInt();
		ps.setInt(1,id);
		int i=ps.executeUpdate();
		if(i==1)
		{
			System.out.println("Succed");
		}
	}

}
