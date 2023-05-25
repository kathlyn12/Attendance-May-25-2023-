package attendance;

public class ToyotaVIOS extends Vehicle{
	
	// subclass of car
		String tireType = "Summer time";
		
		void drive() {
			System.out.println("Fast");
		}

// override method 
		@Override
		void stop() {
			super.stop();
		}
}

