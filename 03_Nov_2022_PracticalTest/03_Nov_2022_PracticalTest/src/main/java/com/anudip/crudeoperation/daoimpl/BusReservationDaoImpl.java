package com.anudip.crudeoperation.daoimpl;

import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.anudip.crudeoperation.cfg.HibernateUtil;
import com.anudip.crudeoperation.dao.BusReservationDao;
import com.anudip.crudeoperation.entity.BusReservation;

public  class BusReservationDaoImpl implements BusReservationDao {
Scanner sc= new Scanner (System.in);

	public void getBusReservationDetails() {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			System.out.println("Enter bus id");
			int i=sc.nextInt();
			BusReservation br = session.get(BusReservation.class, i);
			System.out.println("------Bus Reservation details are----");
			System.out.println(br.getBusId() + " " + br.getBusType() + " " + br.getNumberOfSeats()
		      + " " + br.getBusSourceCity() + " " + br.getBusDestinationCity());
		}catch(HibernateException e) {
			System.out.println(e);
		}
	}

	public void addBusReservationDetails() {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction t = session.beginTransaction();
			String busType,busSourceCity,busDestinationCity;
			int numberOfSeats,busId;
			System.out.println("Enter Bus id");
			busId = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Bus Type");
			busType = sc.next();
			System.out.println("Enter Bus source city");
			busSourceCity = sc.next();
			System.out.println("Enter Bus Destination city");
			busDestinationCity = sc.next();
			System.out.println("Enter Number of seats");
			numberOfSeats = sc.nextInt();
			BusReservation br = new BusReservation ();
			br.setBusId(busId);
			br.setBusType(busType);
			br.setBusSourceCity(busSourceCity);
			br.setBusDestinationCity(busDestinationCity);
			br.setNumberOfSeats(numberOfSeats);
			session.save(br);
			t.commit();
		}catch(HibernateException e) {
			System.out.println(e);
		}
		
		
	}

	public void updateBusReservationDetails() {
		 try {
				Session session = HibernateUtil.getSessionFactory().openSession();
				Transaction t = session.beginTransaction();

				System.out.println("Enter your bus id");
				int i=sc.nextInt();
				BusReservation br1 = session.get(BusReservation.class, i);
				System.out.println("Enter update bus type");
				String busType = sc.nextLine();
				session.update(br1);
				t.commit();
				System.out.println("Update Successfully");


			}catch(HibernateException e) {
				System.out.println(e);
			}
			
	}

	public void deleteBusReservationDetails() {
		try {
			Session session = HibernateUtil.getSessionFactory().openSession();
			Transaction t = session.beginTransaction();
			System.out.println("Enter your Bus id");
			int i=sc.nextInt();
			BusReservation br2 = session.get(BusReservation.class, i);
			System.out.println("Enter update bus type");
			session.delete(br2);
			t.commit();
			System.out.println("delete successfully");
		}catch(HibernateException e) {
			System.out.println(e);
	}
	}
	
	
}