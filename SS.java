package dealer;

public class SS extends Data {
	

	public void RPO07() {
		
		setEngine("6.2 Litre V8");
		
		setModel("SS");
		
		setTransmission("6 speed, manual");
		
		setHorsepower(400);
		
		setTorque(400);
		
	}
	
		

		public void showRPO07() {
			
		System.out.println("Congratulations, you selected the " + getModel() + ".");
		
		System.out.println("This model has a " + getEngine() + "," + " making " + getHorsepower() + " horsepower"+ " and " + getTorque() + " foot pounds of torque.");
		
		System.out.println("This car comes with a " + getTransmission() + " transmission.");
		
		}

		}