package jdbcPack;

import java.sql.*;
import java.util.Scanner;


public class Sample {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Value");
		int id = scan.nextInt();
		String name = scan.next();
		//Register the Driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//Connection Properties
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "system");
		//Statement Object for Query
		Statement st = conn.createStatement();
		PreparedStatement ps = conn.prepareStatement("insert into sample values(?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		
		ps.executeUpdate();
		//Query Execution
		//st.executeQuery("insert into sample values(102,'bcd')");
		//st.executeQuery("insert into sample values(103,'cde')");
		ResultSet out = st.executeQuery("select * from sample");
		
		while(out.next()) {
			System.out.println(out.getInt("ID")+","+out.getString("NAME"));
		}
		
		//Close the Connection
		conn.commit();
		conn.close();
		System.out.println("Exection Done");
	}
}
