package com.niit.musichub.testClasses;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.niit.musichub.model.*;

public class UserTest {

	public static void main(String[] args) {
		User user1 = new User();
		user1.setUserID("001");
		user1.setUser_FirstName("Sachin");
		user1.setUser_MiddleName("Ramesh");
		user1.setUser_LastName("Tendulkar");
		user1.setUserName("SRT");
		user1.setAddress("bombay");
		user1.setEmail_id("srt@gmail.com");
		user1.setPhone_number("123456789");
		
		@SuppressWarnings("deprecation")
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user1);
		session.getTransaction().commit();
		
	}

}
