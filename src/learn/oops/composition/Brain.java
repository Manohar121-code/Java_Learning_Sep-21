package learn.oops.composition;

public class Brain {
	private int numOfNuerons;
	private double iq;
	
	public Brain(int numOfNuerons, double iq) {
		this.numOfNuerons = numOfNuerons;
		this.iq = iq;
	}

	public int getNumOfNuerons() {
		return numOfNuerons;
	}

	public void setNumOfNuerons(int numOfNuerons) {
		this.numOfNuerons = numOfNuerons;
	}

	public double getIq() {
		return iq;
	}

	public void setIq(double iq) {
		this.iq = iq;
	}

}
