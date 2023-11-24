package Queue_Interface;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

class pricelist implements Comparator<vehicle_queue>
{

	@Override
	public int compare(vehicle_queue o1, vehicle_queue o2) {
		if(o1.getPrice()<o2.getPrice())
		return -1;
		else if (o1.getPrice()>o2.getPrice())
			return 1;
		else 
			return 0;
	}
	
}

public class vehicle_queue {
	
	String name;
	int price;
	boolean automated, AC;
	String fuel_type,Vehical_type;
	
	public vehicle_queue(String name,boolean automated,String fuel_type,boolean Ac,String Vehical_type,int price)
	{
		this.name=name;
		this.automated=automated;
		this.fuel_type=fuel_type;
		this.AC=Ac;
		this.Vehical_type=Vehical_type;
		this.price=price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public boolean isAutomated() {
		return automated;
	}

	public void setAutomated(boolean automated) {
		this.automated = automated;
	}

	public boolean isAC() {
		return AC;
	}

	public void setAC(boolean aC) {
		AC = aC;
	}

	public String getFuel_type() {
		return fuel_type;
	}

	public void setFuel_type(String fuel_type) {
		this.fuel_type = fuel_type;
	}

	public String getVehical_type() {
		return Vehical_type;
	}

	public void setVehical_type(String vehical_type) {
		Vehical_type = vehical_type;
	}

	public String toString() {
		return (this.name+" "+this.automated+" "+this.fuel_type+" "+this.AC+" "+this.Vehical_type+" "+this.price);
		
	}
	public static void main(String[] args) {

		
		vehicle_queue q=new vehicle_queue("HARRIER", true, "DIESEL", true, "CAR", 2200000);
		vehicle_queue q1=new vehicle_queue("SAFARI", true, "DIESEL", true, "CAR", 1800000);
		vehicle_queue q2=new vehicle_queue("NEXON", true, "DIESEL", true, "CAR", 1200000);
		vehicle_queue q3=new vehicle_queue("ALTRAZ", true, "DIESEL", true, "CAR", 800000);
		
		PriorityQueue<vehicle_queue> set=new PriorityQueue<vehicle_queue>(new pricelist());
		
		set.add(q);
		set.add(q1);
		set.add(q2);
		set.add(q3);

		Iterator<vehicle_queue> itr = set.iterator();
		System.out.println("The list of price of Cars is  \n Name \t Price");
		while(itr.hasNext())
		{
			vehicle_queue vv=itr.next();
						if(vv.getVehical_type().equals("CAR"))
						{
							System.out.println(vv.getName()+"   "+vv.getPrice());
						}
					
		}
		
	}

}
