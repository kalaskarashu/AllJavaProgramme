package update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Name update");
		String name=sc.nextLine();
		System.out.println("Id where");
		int id=sc.nextInt();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookinfo","root","root");
		String sql="update book set name=? where id=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setInt(2, id);
		int i=ps.executeUpdate();
		if(i==1)
		{
			System.out.println("succed");
		}
	}
}
