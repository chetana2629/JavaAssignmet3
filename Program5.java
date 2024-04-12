package javaAssignment3;


/*5.Write a class Time with three data members to store hr, min and seconds.
Create two constructors and apply checks to set valid time. (hr<24, min<60,
sec<60). Also create display function which displays all data members.*/

class Time{
	private int hr;
	private int min;
	private int sec;
	
	public Time() {
	
	}

	public Time(int hr, int min, int sec) {
		super();
		this.hr = hr;
		this.min = min;
		this.sec = sec;
	}
	public void set() {
		 if(hr<24 && min<60 && sec<60)
	    	  System.out.println("Valid time");
	      else
	    	  System.out.println("Invalid time");
	}
	public void display() {
		System.out.println(hr+":"+min+":"+sec);
	}
}
public class Program5 {

	public static void main(String[] args) {
		Time time=new Time(12, 25, 35);
		time.set();
		time.display();

	}

}
