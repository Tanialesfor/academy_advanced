package by.htp.jd2_les01.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/news?useSSL=false", "root", "123456");

		Statement st = con.createStatement();

		ResultSet rs = st.executeQuery("SELECT * FROM roles");

		while (rs.next()) {
			System.out.println(rs.getInt(1) + " - " + rs.getString(2));
		}

		System.out.println("!!!");
		// close
	}

}
