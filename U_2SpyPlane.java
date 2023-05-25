package attendance;

public class U_2SpyPlane extends Vehicle{

	// Plane sub class
	int wingSpan = 45;
	
	// method fly
	void fly() {
		System.out.println("Take off!");
	}

	@Override
	void stop() {
		System.out.println("Landing off!");
//		super.stop();

	}
	
	
}
