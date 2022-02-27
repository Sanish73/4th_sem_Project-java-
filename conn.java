
package library1;

import java.sql.*;
public class conn{
		Connection c;
		Statement s;
		
		public conn() {
			
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/library";
				String user = "root";
				String password = "";
				
				c =DriverManager.getConnection(url,user,password);
				s = c.createStatement();
				
			} catch (Exception e) {
				// TODO: handle exception
				throw new RuntimeException("Hey some is worng!!!!");
			}
		}
}
