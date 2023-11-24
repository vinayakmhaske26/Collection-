package PriorityQueue_Vehical;

import java.util.Comparator;

public class pricelist implements Comparator<Vehical> {

		@Override
		public int compare(Vehical o1, Vehical o2) {
			if(o1.getPrice()<o2.getPrice())
			return -1;
			else if(o1.getPrice()>o2.getPrice())
				return 1;
			else
				return 0;
		
		
	}

		
	}


