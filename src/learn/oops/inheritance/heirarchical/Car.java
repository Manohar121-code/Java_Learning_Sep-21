package learn.oops.inheritance.heirarchical;

public class Car extends Vehicle {
	private String colour;
	private boolean isRoofTop;

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public boolean isRoofTop() {
		return isRoofTop;
	}

	public void setRoofTop(boolean isRoofTop) {
		this.isRoofTop = isRoofTop;
	}

}
