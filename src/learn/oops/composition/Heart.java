package learn.oops.composition;

public class Heart {
	private int numOfRooms;
	private boolean heartQuality;

	public Heart(int numOfRooms, boolean heartQuality) {
		this.numOfRooms = numOfRooms;
		this.heartQuality = heartQuality;
	}

	public int getNumOfRooms() {
		return numOfRooms;
	}

	public void setNumOfRooms(int numOfRooms) {
		this.numOfRooms = numOfRooms;
	}

	public boolean isHeartQuality() {
		return heartQuality;
	}

	public void setHeartQuality(boolean heartQuality) {
		this.heartQuality = heartQuality;
	}

}
