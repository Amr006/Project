import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Cube extends Shape {
	Scanner cin = new Scanner(System.in) ;
	public void getinput()
	{
		
		System.out.println("Enter lenght");
		int radius = cin.nextInt();
		setLenght(radius) ;
		
		
		System.out.print("Enter height: ");
		int H = cin.nextInt() ;
		setHeight(H);
		
		
		System.out.print("Enter Width: ");
		int w = cin.nextInt() ;
		setWidth(w);
		
		System.out.print("Enter Filled amount in cubic meter: ");
		int W = cin.nextInt();
		setWater(W);
	
	}
	
	public double calcvol() 
	{
		double vol = 0 ;
		
		vol =getLenght() * getHeight() * getWidth() ;
		
		
		
		return vol ;
	}
	
	
	public double calcrem() 
	{
		double rem = 0 ;
		
		double vol =getLenght() * getHeight() * getWidth() ;
		rem = vol - getWater() ;
		
		
		return rem ;
	}
	
	
	
}
