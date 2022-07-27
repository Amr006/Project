import java.util.Scanner;

public class Cylinder extends Shape {
	Scanner cin = new Scanner(System.in) ;
	public void getinput()
	{
		
		System.out.println("Enter radius");
		int radius = cin.nextInt();
		setLenght(radius) ;
		
		
		System.out.print("Enter height: ");
		int H = cin.nextInt() ;
		setHeight(H);
		
		System.out.print("Enter Filled amount in cubic meter: ");
		int W = cin.nextInt();
		setWater(W);
	
	}
	
	public double calcvol() 
	{
		double vol = 0 ;
		
		vol = Math.PI *  getLenght() * getHeight() * getLenght() ;
		
		
		
		return vol ;
	}
	
	
	public double calcrem() 
	{
		double rem = 0 ;
		
		double vol = Math.PI *  getLenght() * getHeight() * getLenght() ;
		rem = vol - getWater() ;
		
		
		return rem ;
	}
	
	
}
