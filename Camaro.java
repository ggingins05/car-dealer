package dealer;

public class Camaro extends Data{
	
	public void RPO01() {
		
		setEngine("3.5 Litre V6");
		
		setModel("Camaro V6");
		
		setTransmission("6 speed, manual");
		
		setHorsepower(300);
		
		setTorque(300);
		
	}
	
		public void RPO02() {
		
		setEngine("6.0 Litre V8");
		
		setModel("Camaro SS");
		
		setTransmission("7 speed, manual");
		
		setHorsepower(400);
		
		setTorque(400);
		
		}


		public void RPO03() {
			
			setEngine("6.2 Litre Supercharged V8");
			
			setModel("Camaro ZL1");
			
			setTransmission("8 speed, automatic");
			
			setHorsepower(620);
			
			setTorque(500);
			
		}
	

		public void showRPO01() {
			
		System.out.println("Congratulations, you selected the " + getModel() + ".");
		
		System.out.println("This model has a " + getEngine() + "," + " making " + getHorsepower() + " horsepower"+ " and " + getTorque() + " foot pounds of torque.");
		
		System.out.println("This car comes with a " + getTransmission() + " transmission.");
		
		}
		
		public void showRPO02() {
			
			System.out.println("Congratulations, you selected the " + getModel() + ".");
			
			System.out.println("This model has a " + getEngine() + "," + " making " + getHorsepower() + " horsepower"+ " and " + getTorque() + " foot pounds of torque.");
			
			System.out.println("This car comes with a " + getTransmission() + " transmission.");
			
			}
		
		public void showRPO03() {
			
			System.out.println("Congratulations, you selected the " + getModel() + ".");
			
			System.out.println("This model has a " + getEngine() + "," + " making " + getHorsepower() + " horsepower"+ " and " + getTorque() + " foot pounds of torque.");
			
			System.out.println("This car comes with a " + getTransmission() + " transmission.");
			
			}
}