package read;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

class Test
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookinfo","root","root");
		String sql="select * from book"; //Statement
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			System.out.print(rs.getInt(1)+"\t"+rs.getString(2)+"\t\t"+rs.getFloat(3));
			System.out.println();
		}
		rs.close();
	}
}