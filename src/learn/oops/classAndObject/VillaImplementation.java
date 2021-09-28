package learn.oops.classAndObject;

public class VillaImplementation {
	public static void main(String[] args) {
		//Object creation
//		<class_name> <identifier> = new <class_name>();
		
		VillaPlan v1 = new VillaPlan();
		v1.numOfBedRooms = 4;
		v1.isDuplex = true;
		v1.isParkingAvailable = true;
		v1.price = 5000000;
		
		int numOfBedRooms = v1.numOfBedRooms;
		boolean isDuplex = v1.isDuplex;
		boolean isParkingAvailable = v1.isParkingAvailable;
		double price = v1.price;
		
		System.out.println("**************** VILLA 1 PROPERTIES ***************");
		
		System.out.println("Villa1 no of bed rooms - "+ numOfBedRooms);
		System.out.println("Villa1 Duplex? "+ isDuplex);
		System.out.println("Villa1 Parking? "+ isParkingAvailable);
		System.out.println("Villa1 Price - "+ price);
		
		System.out.println("---------------------");
		
		VillaPlan v2 = new VillaPlan();
		v2.numOfBedRooms = 3;
		v2.isDuplex = true;
		v2.isParkingAvailable = false;
		v2.price = 3000000;
		
		System.out.println("**************** VILLA 2 PROPERTIES ***************");
		
		System.out.println("Villa2 no of bed rooms - "+ v2.numOfBedRooms);
		System.out.println("Villa2 Duplex? "+ v2.isDuplex);
		System.out.println("Villa2 Parking? "+ v2.isParkingAvailable);
		System.out.println("Villa2 Price - "+ v2.price);
		
		System.out.println("---------------------");
		
		VillaPlan v3 = new VillaPlan();
		v3.numOfBedRooms = 2;
		v3.isDuplex = false;
		v3.isParkingAvailable = false;
		v3.price = 1500000;
		
		System.out.println("**************** VILLA 3 PROPERTIES ***************");
		
		System.out.println("Villa3 no of bed rooms - "+ v3.numOfBedRooms);
		System.out.println("Villa3 Duplex? "+ v3.isDuplex);
		System.out.println("Villa3 Parking? "+ v3.isParkingAvailable);
		System.out.println("Villa3 Price - "+ v3.price);
	}
}
