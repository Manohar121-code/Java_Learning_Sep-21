package learn.oops.inheritance.heirarchical;

public class HeirarchicalEx {
	public static void main(String[] args) {
		Car polo = new Car();
		polo.setCc(1500);
		polo.setColour("white");
		polo.setNumberOfTyres(4);
		polo.setNumOfGears(5);
		polo.setRoofTop(true);
		
		System.out.println("******* Car Properties **********");
		
		System.out.println("Car CC - "+ polo.getCc());
		System.out.println("Car Colour - "+ polo.getColour());
		System.out.println("Car Num of tyres - "+ polo.getNumberOfTyres());
		System.out.println("Car Num of gears - "+ polo.getNumOfGears());
		System.out.println("Car is Roof top? "+ polo.isRoofTop());
		
		Bus tata = new Bus();
		tata.setCc(1000);
		tata.setCapacity(50);
		tata.setDoubleDekkar(false);
		tata.setNumberOfTyres(6);
		tata.setNumOfGears(4);
		
		System.out.println("******* Bus Properties **********");
		
		System.out.println("Bus CC - "+ tata.getCc());
		System.out.println("Bus Capacity - "+ tata.getCapacity());
		System.out.println("Bus is Double dekkar - "+ tata.isDoubleDekkar());
		System.out.println("Bus num of tyres - "+ tata.getNumberOfTyres());
		System.out.println("Bus num of gears - "+ tata.getNumOfGears());
	}
}
