package learn.oops.part3.exceptionHandling;

public class VoteEligibility {

	public void VoteEligibiityCheck(int age) throws VoteNotEligibleException {
		if (age < 18) {
			throw new VoteNotEligibleException("Age should be greater than or equals to 18");
		}
		
		System.out.println("Person age eligible for vote");
	}
	
	public void VoteEligibiityCheck2(int age) throws RuntimeException {
		if (age < 18) {
			throw new RuntimeException("Age should be greater than or equals to 18");
		}
		
		System.out.println("Person age eligible for vote");
	}
}
