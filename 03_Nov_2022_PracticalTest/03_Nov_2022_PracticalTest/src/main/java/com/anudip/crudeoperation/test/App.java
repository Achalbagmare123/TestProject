package com.anudip.crudeoperation.test;

import java.util.Scanner;

import com.anudip.crudeoperation.daoimpl.BusReservationDaoImpl;



public class App 
{
    public static void main( String[] args )
    {
    	BusReservationDaoImpl brdao = new  BusReservationDaoImpl();
         char a;
          do {
          	Scanner sc = new Scanner(System.in);
          	System.out.println(" * Bus Reservation Details *");
          	System.out.println("1. Read details \n 2.Add details \n 3. update details \n 4.delete details \n 5.Exit");
          	int ch = sc .nextInt();
          	switch(ch) {
          	case 1: brdao.getBusReservationDetails();
          	break;
          	case 2: brdao.addBusReservationDetails();
          	break;
          	case 3: brdao.updateBusReservationDetails();
          	break;
          	case 4: brdao.deleteBusReservationDetails();
          	break;
          	case 5: System.exit(0);
          	break;
          	
          	default:
          	System.out.println("invalid entry");
          	}
          	System.out.println("Do you want to continue ? Y/N");
          	a = sc.next().charAt(0);
          }while(a == 'Y' || a == 'y');
      	System.out.println(" * Thank You * ");       
          }
        
    }

