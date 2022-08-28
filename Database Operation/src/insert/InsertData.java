package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

public class InsertData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id");
		int id=sc.nextInt();
		System.out.println("Enter the Name");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.println("Enter the price");
		float price=sc.nextFloat();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Bookinfo","root","root");
		String sql="insert into book values(?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setFloat(3, price);
		int i=ps.executeUpdate();
		if(i==1)
		{
			System.out.println("Data update");
		}

	}

}
