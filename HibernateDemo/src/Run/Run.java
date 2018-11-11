package Run;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import HibernateCreate.Student;

public class Run {
	
	public static void main(String args[]) {

	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
	
	Session session= factory.getCurrentSession();
	Student employee2=new Student("P","F","PinkF@aaa.com");
		try {
				
	session.beginTransaction();
	
	session.save(employee2);
	
	
	session.getTransaction().commit();
	
	
			}
	
	finally {
		factory.close();
	}
	
}	
	
	
	
	
	
	
	
}
