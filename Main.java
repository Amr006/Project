import java.lang.Math;
import java.lang.Character;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in) ;
	
		
		System.out.println("Enter number of containers: ");
		int numberofcont = cin.nextInt() ;
		int i = 0 ;
		Map <Double,Double > mp = new HashMap<>();
		int type =  0;
		while(numberofcont-- > 0)
		{
			System.out.println("Enter 1 to create a cylinder and 2 to create a cube");
			type = cin.nextInt() ;
			if(type == 1)
			{
				Cylinder obj = new Cylinder();
				obj.getinput();
				mp.put(obj.calcvol(),obj.calcrem());
				
			}
			else
			{
				Cube obj = new Cube();
				obj.getinput();
				mp.put(obj.calcvol(),obj.calcrem());
				
			}
			
			i++ ;
			
		}
		
		Map<Double, Double> treeMap = new TreeMap<Double, Double>(mp);
		
		
		for (double name: treeMap.keySet()) {
		    double key = name ;
		    double value = treeMap.get(name) ;
		    
		    System.out.format(" Volume : %.3f \t Remaining : %.3f" , key , value );
		    System.out.println("");
		
		}
		
		
		
	}
}
