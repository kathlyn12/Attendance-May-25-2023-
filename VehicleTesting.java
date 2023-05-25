package attendance;

public class VehicleTesting {

	public static void main(String[] args) {
		
		// An Instantiation of car that we named as Toyota Vios(sub class) and create a object called obj
		ToyotaVIOS obj = new ToyotaVIOS();
		
		System.out.println("Speed: " + obj.speed + "kph");
		System.out.println("Color: " + obj.color);
		System.out.println("Price: " + obj.price);
		System.out.println("Tire Type: " + obj.tireType);
		
		obj.stop();
		obj.drive();
		
		System.out.println("----------------------------");
		
		// An Instantiation of sub class plane that we named as U_2SpyPlane and create a object called plane
		U_2SpyPlane plane = new U_2SpyPlane();
		
		plane.color = "Silver";
		plane.speed = 905;
		plane.price = 900000000;
		System.out.println("Speed: " + plane.speed + "kph");
		System.out.println("Color: " + plane.color);
		System.out.println("Price: $" + plane.price);
		
		plane.stop();
		plane.fly();
		
		System.out.println("----------------------------");
		
		// An Instantiation of sub class boat that we named as FandangoYacht and create a object called yacht
		FandangoYacht yacht = new FandangoYacht();
		yacht.color = "Black";
		yacht.speed = 30;
		yacht.price = 200000000;
		System.out.println("Speed: " + yacht.speed + "Mph");
		System.out.println("Color: " + yacht.color);
		System.out.println("Price: P" + plane.price);
		
		yacht.Float();
		yacht.stop();
		
		
		
	}

}
