

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {
	
	
public static void main(String args[]) {
	try {
		String User = "hbstudent";
		String Password = "hbstudent";
		String url ="jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		System.out.println("connection initiating");
	Connection con = DriverManager.getConnection(url,User,Password);
	System.out.println("connection succesfull");
	}

      catch(Exception e) {
	e.printStackTrace();
      }
}

}