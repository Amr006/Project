import java.util.Map;
import java.util.TreeMap;

abstract class Shape {
	private int lenght , height , width , water ;

	public int getLenght() {
		return lenght;
	}

	public void setLenght(int lenght) {
		this.lenght = lenght;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getWater() {
		return water;
	}

	public void setWater(int water) {
		this.water = water;
	}

	
	public abstract double calcvol() ;
	public abstract double calcrem() ;
	
	
	
}
