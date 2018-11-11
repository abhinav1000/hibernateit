package Run;

	

import java.util.List;

import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.cfg.Configuration;

	import HibernateCreate.Student;

	public class CreateQuery {
		public static void main(String args[]) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session= factory.getCurrentSession();
		
		List<Student> thestudent1 = session.createQuery("from Student s ").getResultList();
		
				try {
					
				
					
		session.beginTransaction();
		
	
		
		for(Student temp : thestudent1) {
			
		System.out.println(temp);
		
				}
		
		session.getTransaction().commit();
		
				}
		
		finally {
			factory.close();
		}
		
	}	
		
		
		
		
		
		
		
	}

