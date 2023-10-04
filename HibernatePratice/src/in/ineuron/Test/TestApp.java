package in.ineuron.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.ineuron.Model.Employee;

public class TestApp {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure();
		
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		
		Transaction transaction=session.beginTransaction();
		
		Employee employee = new Employee();
		employee.setEid(1);
		employee.setEname("sachin");
		employee.setEage(28);
		employee.setEaddr("Mumbai");
		
		session.save(employee);
		transaction.commit();
		
		session.close();
		sessionFactory.close();
		
		

	}

}
