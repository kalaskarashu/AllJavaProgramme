package read;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Fitchdata {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// step 1 load driver class
		Class.forName("com.mysql.cj.jdbc.Driver");
		//step 2 Connect
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookinfo","root","root");
		String sql="select * from book";
		//step 3 create query
		PreparedStatement ps=con.prepareStatement(sql);
		//step 4 
		ResultSet rs=ps.executeQuery();
		System.out.println("ID\tName\t\tPrice\t");
		
		while(rs.next())
		{
			System.out.print(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3)+"\t");
			System.out.println("");
		}
		rs.close();

	}

}
