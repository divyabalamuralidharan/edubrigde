package busreservation;
public class bus {
private	int busNo;
private	boolean ac;
private int capacity;//get and set
	bus(int no,boolean ac,int cap){
		this.busNo=no;
		this.ac=ac;
		this.capacity=cap;
	}
	public int getbusno() {//accessor
		return busNo;
	}
	public boolean isac() {
		return ac;
	}
 public int getcapacity(){//accessor method
	return capacity;
}
 public void setac(boolean val) {//mutator
	 ac=val;
 }
 public void setcapacity(int cap) {//mutator
	 capacity=cap;
 }
public void displayBusinfo(){
	System.out.println("bus no:" + busNo +"ac:"+ ac +"totalcapacity;"+capacity);
	 
 }
}


