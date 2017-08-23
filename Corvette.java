package dealer;

public class Corvette extends Data {
	

	public void RPO04() {
		
		setEngine("6.0 Litre V8");
		
		setModel("Corvette Z51");
		
		setTransmission("6 speed, manual");
		
		setHorsepower(424);
		
		setTorque(413);
		
	}
	
		public void RPO05() {
		
		setEngine("7.0 Litre V8");
		
		setModel("Corvette Z06");
		
		setTransmission("6 speed, manual");
		
		setHorsepower(505);
		
		setTorque(470);
		
		}


		public void RPO06() {
			
			setEngine("6.2 Litre Supercharged V8");
			
			setModel("Corvette ZR1");
			
			setTransmission("6 speed, manual");
			
			setHorsepower(638);
			
			setTorque(604);
			
		}
	

		public void showRPO04() {
			
		System.out.println("Congratulations, you selected the " + getModel() + ".");
		
		System.out.println("This model has a " + getEngine() + "," + " making " + getHorsepower() + " horsepower"+ " and " + getTorque() + " foot pounds of torque.");
		
		System.out.println("This car comes with a " + getTransmission() + " transmission.");
		
		}
		
		public void showRPO05() {
			
			System.out.println("Congratulations, you selected the " + getModel() + ".");
			
			System.out.println("This model has a " + getEngine() + "," + " making " + getHorsepower() + " horsepower"+ " and " + getTorque() + " foot pounds of torque");
			
			System.out.println("This car comes with a " + getTransmission() + " transmission.");
			
			}
		
		public void showRPO06() {
			
			System.out.println("Congratulations, you selected the " + getModel() + ".");
			
			System.out.println("This model has a " + getEngine() + "," + " making " + getHorsepower() + " horsepower"+ " and " + getTorque() + " foot pounds of torque");
			
			System.out.println("This car comes with a " + getTransmission() + " transmission.");
			
			}
	
	
}