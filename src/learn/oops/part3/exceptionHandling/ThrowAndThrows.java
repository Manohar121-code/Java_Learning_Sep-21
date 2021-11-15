package learn.oops.part3.exceptionHandling;

public class ThrowAndThrows {
	public static void main(String[] args) {
		VoteEligibility obj = new VoteEligibility();
		try {
			obj.VoteEligibiityCheck(15);
		} catch (VoteNotEligibleException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("----------------");
		
		obj.VoteEligibiityCheck2(10);
		
	}
	
}
