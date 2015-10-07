package com.sapient.client;






import java.util.Iterator;
import java.util.List;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.sapient.hibernate.Contact;

public class MainApp {

	public static void main(String[] args) {
		SessionFactory factory;
		
		factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = null;
		//Integer employeeID = null;
		/*Logger Log = Logger.getLogger(MainApp.class.getName());
		BasicConfigurator.configure();*/
		try{
			tx = session.beginTransaction();
			String SQL_QUERY = "select contact.id,contact.firstName from Contact contact";
			Query query = session.createQuery(SQL_QUERY);
			for(Iterator iterator = query.iterate();iterator.hasNext();){
				
				Object[] row = (Object[]) iterator.next();
				System.out.println("id:  "  + row[0]);
				System.out.println("First Name  " + row[1]);
			}
			/*Contact contact = new Contact();
			contact.setIds(5);
			contact.setFirstName("saurabh");
			contact.setLastName("pandey");
			contact.setEmail("sauran105@gmail.com");
			
			session.saveOrUpdate(contact);
			
			
			tx.commit();*/
			//Criteria Query  Example
			
			//Criteria criteria = session.createCriteria(Contact.class);
			/*criteria.add(Restrictions.like("firstName","%sau%"));
			criteria.setMaxResults(1);
			
			List contacts = criteria.list();
			
			for(Iterator iterator = contacts.iterator();iterator.hasNext();){
				Contact contact = (Contact) iterator.next();
				//System.out.println("Name:" + contact.getIds());
				//System.out.println("Name:" + contact.getFirstName());
				Log.info("name:" + contact.getEmail());
				
			}*/
			
			
			
			
			
			
		}catch(HibernateException e){
			if(tx!=null){
				tx.rollback();
			}
			e.printStackTrace();
		}finally{
			session.close();
		}

	}

}
