package busreservation;
import java.util.Scanner;
import java.util.ArrayList;

public class busdemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ArrayList<bus> buses=new ArrayList<bus>();//---BUS
		buses.add(new bus(1,true,2));
		buses.add(new bus(2,false,50));
		buses.add(new bus(3,true,48));
		ArrayList<Booking> bookings=new ArrayList<Booking>();//--BOOKING


		
		
		int userOpt=1;
		Scanner scanner=new Scanner(System.in);
		for(bus b:buses) {
			b.displayBusinfo();
		}
		
		while(userOpt==1) {
			System.out.println("Enter 1 to Book and 2 to exit");
			userOpt=scanner.nextInt();
			if(userOpt==1){
				Booking booking=new Booking();
			if(booking.isAvailable( bookings, buses)) {

					bookings.add(booking);
					System.out.println("Your Booking is Confirmed happy journey");
					
				}else
					
					System.out.println("Sorry Bus is Full.Try another bus or date.");

			}
			
		}

	}

}
