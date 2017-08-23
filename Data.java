package dealer;

public abstract class Data {
	
	//Variables employed for the methods of the different models.
	
	private String model;
	
	private String engine;
	
	private String transmission;
	
	private int horsepower;
	
	private int torque;
	
	
	//Encapsulation of variables.
	
	public void setModel (String text) {
		
		model = text;
	}
	
	public String getModel() {
		
		return model;
		
	}
	
	public void setEngine(String text) {
		
		engine = text;
		
	}
	
    public String getEngine() {
    	
    	return engine;
    	
    }
    
    public void setTransmission(String text) {
    	
    	transmission = text;
    	
    }
    
    public String getTransmission() {
    	
    	return transmission;
    	
    }
    
    public void setHorsepower(int number) {
    	
    	horsepower = number;
    	
    }
    
    public int getHorsepower() {
    	
    	return horsepower;
    	
    }
    
    public void setTorque(int number) {
    	
    	torque = number;
    	
    }
    
    public int getTorque() {
    	
    	return torque;
    	
    }
}