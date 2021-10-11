package learn.oops.inheritance.heirarchical;

public class Bus extends Vehicle {
	private int capacity;
	private boolean doubleDekkar;

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public boolean isDoubleDekkar() {
		return doubleDekkar;
	}

	public void setDoubleDekkar(boolean doubleDekkar) {
		this.doubleDekkar = doubleDekkar;
	}

}
