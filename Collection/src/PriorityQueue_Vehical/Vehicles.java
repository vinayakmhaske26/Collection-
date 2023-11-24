package PriorityQueue_Vehical;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Vehicles {

	public static void main(String[] args) {


		Vehical v=new Vehical("HARRIER", true, "DIESEL", true, "CAR", 2300000);
		Vehical v1=new Vehical("TRUCK", true, "DIESEL", true, "TRANSPORT", 3000000);
		Vehical v2=new Vehical("SAFARI", true, "DIESEL", true, "CAR", 2200000);
		Vehical v3=new Vehical("TRAVELLER", true, "DIESEL", true, "TRANSPORT", 2300000);
		
		PriorityQueue<Vehical> set=new PriorityQueue<Vehical>(new pricelist());
		
		set.add(v3);
		set.add(v2);
		set.add(v1);
		set.add(v);
		

		Iterator<Vehical> itr=set.iterator();
		System.out.println("List of cars on price\n Name \t Price");
		while(itr.hasNext()) {
			Vehical vv=itr.next();
			if(vv.getVehical_type().equals("CAR"))
			{
				System.out.println(vv.getName()+" "+vv.getPrice());
			}
			
	}
	}
}
