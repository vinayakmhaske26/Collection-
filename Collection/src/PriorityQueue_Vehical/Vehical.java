package PriorityQueue_Vehical;

public class Vehical {


		String name;
		int price;
		boolean automated, AC;
		String fuel_type,Vehical_type;
		
		public Vehical(String name,boolean automated,String fuel_type,boolean Ac,String Vehical_type,int price)
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
	}


