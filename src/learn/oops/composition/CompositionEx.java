package learn.oops.composition;

public class CompositionEx {
	public static void main(String[] args) {
		
		Brain nareshBrain = new Brain(87687, 7);
		
		Heart nareshHeart = new Heart(4, true);
		
		Human naresh = new Human("Naresh", 6, 70, nareshBrain, nareshHeart);
		
		String name = naresh.getName();
		int height = naresh.getHeight();
		int weight = naresh.getWeight();
		Brain brain = naresh.getBrain();
		Heart heart = naresh.getHeart();
		
		System.out.println("Name - "+ name);
		System.out.println("Height - "+ height);
		System.out.println("Weight - "+ weight);
		
		System.out.println("********** BRAIN Properties ***********");
		int numOfNuerons = brain.getNumOfNuerons();
		double iq = brain.getIq();
		
		System.out.println("Naresh Number of neurons - "+ numOfNuerons);
		System.out.println("Naresh IQ - "+ iq);
		
		
		System.out.println("********** HEART Properties ***********");
		int numOfRooms = heart.getNumOfRooms();
		boolean heartQuality = heart.isHeartQuality();
		
		System.out.println("Naresh heart num of rooms - "+ numOfRooms);
		System.out.println("Naresh heart quality - "+ heartQuality);
	}
}
