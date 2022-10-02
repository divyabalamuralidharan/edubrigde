package busreservation;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {
	String passengerName;
	int busNo;
	String Emailid;
	Date date;
	Booking(){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter name of passenger:" );
	passengerName=scanner.next();
	System.out.println("Enter BusNO:" );
	busNo=scanner.nextInt();
	System.out.println("Enter Email-id:" );
	Emailid=scanner.next();
	System.out.println("Enter date dd-mm-yyy" );
	String dateInput=scanner.next();
	SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy");
	try {
		date=dateformat.parse(dateInput);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}
public boolean	isAvailable(ArrayList<Booking> bookings,ArrayList<bus> buses) {
	int capacity=0;
	for(bus bus:buses) {
		if(bus.getbusno() == busNo)
			capacity=bus.getcapacity();
		
}
	int booked=0;  
	
	for(Booking b:bookings) {
		if(b. busNo==busNo && b.date.equals(date)) {
			
		
			booked++;
		}
	}
	return booked<capacity?true:false;
}


}