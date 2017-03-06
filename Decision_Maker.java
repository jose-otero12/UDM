import java.util.Random;
import java.util.Scanner;


public class Decision_Maker {
	
	
	private int n;
	private Random rand;
	private static int max;
	private static String[] array;
	
	 public int RNG(int limit){
	
	
		 rand = new Random();
		 n = rand.nextInt(limit) + 1;
	
	
		 return n;
	}
	 
	 
	public int  OC(){
		
		System.out.print("Enter number of options: ");
		Scanner SC = new Scanner(System.in);
		max = SC.nextInt();
		System.out.println("");
		
		
		return max;
	}
	
	
	public static String[] array(){
		
		array = new String[max];
		
		Scanner sc = new Scanner(System.in);
		String jk;
		int j = 1;
				
		
		for (int i = 0; i < max; i++){
			
			
			System.out.print("Enter Object " + j + ": ");
			jk = sc.next();
			array[i] = jk ;
			j++;
			
		}
		System.out.println("");
		
		
		return array;
	}
	

}
