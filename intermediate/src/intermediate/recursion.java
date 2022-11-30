 package intermediate;
 import java.util.Scanner;
 

public class recursion {
	// main
	public static void main(String[] args){try {
	Scanner in = new Scanner(System.in);
		System.out.println("FACTORIAL WORKER");
	long val;
		
	System.out.print("VALUE: ");
	val = in.nextInt();
	
		System.out.println();
		System.out.println(val+"! = "+fact(val));
	
	}catch(Exception e) {
		System.out.println("ERROR: "+e);
		}
	

	}
	// factorial function
	public static long fact(long n ) {
		if(n<=1)
			return 1;
	else
		return n*fact(n-1);
		}
	
	}


