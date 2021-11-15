package learn.oops.part3.exceptionHandling;

public class VoteNotEligibleException extends Exception {

	public VoteNotEligibleException() {
		super();
	}
	
	public VoteNotEligibleException(String msg) {
		super(msg);
	}
	
	public VoteNotEligibleException(Throwable t) {
		super(t);
	}
	
	public VoteNotEligibleException(String msg, Throwable t) {
		super(msg, t);
	}
}
