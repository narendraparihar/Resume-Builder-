package Resume;

import java.sql.*;
public class MysqlConnection {

	public static void main(String[] args){
		
		try{

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost/resume","root","Narendra$7746$");
			Statement s =c.createStatement();
			//s.executeUpdate("INSERT INTO serchdata(fname,lname,mark) VALUES('"+s1+"','"+s2+"','"+m+"')");
			ResultSet rs=s.executeQuery("select * from  login");
			while(rs.next())
			{   
				String f=rs.getString("userid");
				String l=rs.getString("password");	
				
				System.out.println(f+" "+l);
			}
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}
}