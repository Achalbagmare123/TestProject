package com.anudip.labtest.daoimpl;


import java.util.Iterator;
import java.util.List;
import javax.persistence.TypedQuery;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.anudip.labtest.config.HibernateUtil;
import com.anudip.labtest.dao.CustomerDao;
import com.anudip.labtest.entity.Customer;
import com.anudip.labtest.entity.Book;

public class CustomerDaoImpl implements CustomerDao{

	public void addCustomer() {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction tx = session.beginTransaction();
			Customer cust = new Customer();
			cust.setCid(8023);
			cust.setCname("David");
			cust.setPhone(784526546);
			
			Book b = new Book();
			b.setBookid(4567);
			b.setBookname("wonder land");
			b.setAuthor("David");
			b.setType("Adventure");
			
			
			cust.setBook(b);
			session.save(cust);
			tx.commit();
			System.out.println("done");
	
		}catch(HibernateException e) {
			System.out.println(e);
		}	
	}

	public void fetchCustomer() {
			try {
				Session session = HibernateUtil.getSessionFactory().openSession();
				TypedQuery query = session.createQuery("from Customer");
				List<Customer> a1 = query.getResultList();
				Iterator<Customer> itr = a1.iterator();
				while(itr.hasNext()) {
					Customer cust = itr.next();
					System.out.println(cust.getCname() + " " + cust.getPhone());
					Book b1 = cust.getBook();
					System.out.println(b1.getBookid() + " " + b1.getType());
					System.out.println("done");
				}
			}catch(HibernateException e) {
				System.out.println(e);	
		}	
		}	
	}


	


