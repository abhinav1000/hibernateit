package Run;
import java.util.List;

import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.cfg.Configuration;

	import HibernateCreate.Student;

public class Update {


	public static void main(String args[]) {
			SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
			
			Session session= factory.getCurrentSession();
			
			int i=9;
			
					try {
						
					
						
			session.beginTransaction();
			
			session.createQuery("Delete Student where id=i ").executeUpdate();
			
		    
			
			session.getTransaction().commit();
			
					}
			
			finally {
				factory.close();
			}
			
		}	
			
			
			
			
			
			
			
		}



