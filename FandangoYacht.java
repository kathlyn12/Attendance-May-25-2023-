package attendance;

public class FandangoYacht extends Vehicle{
	
	// Boat sub class
	String mainSailColor = "Gray";
	
	// method float
	void Float() {
		System.out.println("Can move to waters");
	}

	@Override
	void stop() {
		System.out.println("Drop your anchor!");
//		super.stop();

	}

	
}
