package intermediate;
import java.util.Scanner;
import javax.swing.*;


public class CurrencyConverter {
	public static double inVal(double amt, double rate) {
		double result;
		result = amt*rate;
		System.out.println("GHS "+result);
				return result;
	}
	public static void main (String [] args ) {try {
		Scanner in = new Scanner(System.in);
		System.out.println("enter Values: ");
		double money , curr_rate;
		int choice=0;
		
		System.out.println("Amount: ");
		money = in.nextDouble();
		System.out.println("rate: ");
		curr_rate = in.nextDouble();
		
		inVal(money,curr_rate);
		
		System.out.println("\n\nCONVERT AGAIN? ");
		System.out.println("1. YES ");
		System.out.println("2. NO ");
		choice = in.nextInt();		
		System.out.println("\n\n");
		switch(choice) {
		case 1:
			main(new String[0]);
			break;
		
		case 2:
			System.exit(0);
			break;
		default:
			System.out.println("Please Enter a Valid Number!");
			
		}
	}catch(Exception e) {
		System.out.println("ERROR: "+e);
		}
	}
}
