package Busres;


import java.util.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.*;
import java.sql.Date;

public class Booking {
	
	String passengerName;
	int busNo;
	java.util.Date date;
	
	Booking(){
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the name of the Passenger : ");
		passengerName=in.next();
		System.out.println("Enter Bus no : ");
		busNo=in.nextInt();
		System.out.println("Enter the date(dd-mm-yyyy):");
		String dateInput=in.next();
		
		SimpleDateFormat  dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			date = dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
 public boolean isAvailable()throws SQLException {
	 
	 BusDAO busdao = new BusDAO();
	 BookingDAO bookingdao=new BookingDAO();
	 
	 int capacity = busdao.getCapacity(busNo);


	 
	 int  booked= bookingdao.getBookedCount(busNo,date);
	 
		 
	 
	 return booked<capacity;
 }
}

