package metier;


import java.sql.Connection;
import java.sql.DriverManager;

public class Bd {
private static Connection connection;


static{
	try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection ("jdbc:mysql://localhost:3306/garage","root","");
			System.out.println("Successfully connected");
            
            
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("could't connect to database");
	}
	
}
	public static Connection getConnection() {
		return connection;
	}
	
}