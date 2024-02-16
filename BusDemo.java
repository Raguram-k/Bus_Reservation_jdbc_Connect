package Busres;


import java.util.Scanner;
import java.sql.SQLException;
import java.util.ArrayList;

public class BusDemo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
//		ArrayList<Bus> buses=new ArrayList<Bus>();
//		buses.add(new Bus(1,true,2));    // creating object using arraylist for bus class object
//		buses.add(new Bus(2,false,50));
//		buses.add(new Bus(3,true,48));
//		
//		ArrayList<Booking> bookings=new ArrayList<Booking>();
//		
		
		BusDAO busdao=new BusDAO();
		busdao.displayBusInfo();
		
		char userOpt = 'y';
		
		Scanner in=new Scanner(System.in);
		
//		for(Bus b:buses) {
//			b.displayBusInfo();
//		}
//	
		
		
      while(userOpt!='n') {
		System.out.println("Enter Y  to Book and N to exit ");
	userOpt = in.next().charAt(0);
		
	if(userOpt == 'y') {
			
		Booking booking=new Booking();
			if(booking.isAvailable()) {
				BookingDAO bookingdao=new BookingDAO();
				bookingdao.addBooking(booking);
				System.out.println("Your booking is confirmed");
			}
			else {
				System.out.println("sry,Bus is full. Try another bus or date.");
			}
			
		}	
	
	
      }
      
	}

}

