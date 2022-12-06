import java.text.DecimalFormat;
import java.util.Scanner;

public class pip_calc {
	
	// to to format decimal places for lot size
	public static String roundOffTo2DecPlaces(double val)
	{
		 System.out.println(String.format("%.2f", val));
	    return String.format("%.2f", val);
	}
	
	
	
	// Calculate value of one pip per lot size
	public static double pip_lot_value(double lotSize){
		double pipValue=0.00;
//	double lotSize = 0.00; 
	
//	DecimalFormat f = new DecimalFormat("#0.00");
	
	if(lotSize >= 1.0) {
		pipValue=(10.00*lotSize)*1;
//		 System.out.println( pipValue);
		 roundOffTo2DecPlaces(pipValue);
	}
	else if(lotSize >=0.10 && lotSize <= 0.99) {
		pipValue = (1.0*lotSize)*10;
//		System.out.println( pipValue);
		roundOffTo2DecPlaces(pipValue);
	}
	 		
	else if(lotSize >= 0.01 && lotSize <=0.09) {
			pipValue = (0.10 *lotSize)*100.00;
			
			roundOffTo2DecPlaces(pipValue);
//			 System.out.println((pipValue));	

}
	
	return pipValue;
}

	
	//calculate pip value per number of pips
	public static double no_pip_value(double pipVal, int no_pips) {
			double NoPipValue = pipVal*no_pips;
				
			return NoPipValue; 
	}	



		// calculate after buy rate for 4dp currencies
	public static double rate_calc_4dp_buy(int No_pip, double Curr_rate ) {
		double N_rate = 0.00000;
		double pip_val = No_pip*0.0001;
		N_rate = pip_val+Curr_rate;
//		System.out.println(N_rate);
		System.out.println(String.format("%.4f", N_rate));
		
		return N_rate;
	}
	// calculate after sell rate for 4dp currencies
	public static double rate_calc_4dp_sell(int No_pip, double Curr_rate ) {
		double N_rate = 0.00000;
		double pip_val = No_pip*0.0001;
		N_rate = pip_val-Curr_rate;
		
		System.out.println(String.format("%.4f",Math.abs(N_rate)));
	
		return N_rate;
	}
	
	
	// calculate after buy rate for 3dp currencies
	public static double rate_calc_2dp_buy(int No_pip, double Curr_rate) {
		double N_rate = 0.000;
		double pip_val = No_pip*0.01;
		N_rate = pip_val+Curr_rate;
		System.out.println(String.format("%.3f", N_rate));
		
		return N_rate;
	}
	
	// calculate after sell rate for 3dp currencies
	public static double rate_calc_2dp_sell(int No_pip, double Curr_rate) {
		double N_rate = 0.000;
		double pip_val = No_pip*0.01;
		N_rate = pip_val-Curr_rate;
		System.out.println(String.format("%.3f", Math.abs(N_rate)));
		Math.abs(N_rate);
		return N_rate;
	}
	
	
	//method to count number of decimal places for calculating after TP/SL
	public static int dec_count(double curr) {
		  double d= curr;
	        String text = Double.toString((d));
	        int integerPlaces = text.indexOf('.');
	        int decimalPlaces = text.length() - integerPlaces - 1;
		
	    System.out.println("No. of decimal places: "+decimalPlaces);
		return decimalPlaces;
	}
	
	
	//method to take purchase type - BUY(LONG)/SELL(SHORT)
	static void purchType(int opt) {
//	Scanner op = new Scanner(System.in);
//	
	
	if(opt == 1) {
		
	System.out.println("\n BUY ORDER: ");
	}
	
	else if (opt == 2) {
	System.out.println("\n SELL ORDER: ");
	}
	else {
		System.out.println("Enter a correct option!!!");
		main(null);
	}
	
	}
	
	
public static void main(String args[]) {try {
	Scanner in = new Scanner(System.in);
	
	double equity =0.0;
	int purcType; //Purchase type - Buy or Sell
	int Np; // No. of pips 
	double Cr; // current rate
	double lotSize; //lotSize
	System.out.println("Purchase Type");
	System.out.println("1. Buy");
	System.out.println("2. Sell");
	purcType = in.nextInt();
	
	purchType(purcType);
	System.out.print("Insert Lot Size: "); //LOT SIZE
	lotSize = in.nextDouble();
	
	pip_lot_value(lotSize);
	
	System.out.print("Insert Current Equity size: ");
	equity = in.nextDouble();
	
	
	
	System.out.print("No. Of Pips:  ");
	Np = in.nextInt();
	System.out.print("Current Rate: ");
	Cr = in.nextDouble();
	
//	dec_count(Cr);
	
	if (dec_count(Cr) > 3 && purcType == 1) {
		 rate_calc_4dp_buy(Np, Cr);
	
	}
	
	else if (dec_count(Cr) > 3 && purcType == 2) {
		 rate_calc_4dp_sell(Np, Cr);
		
	}
	
	else if (dec_count(Cr) <= 3 && purcType == 1) {
		 rate_calc_2dp_buy(Np, Cr);
		
	}
	
	else if (dec_count(Cr) <= 3 && purcType == 2) {
		 rate_calc_2dp_sell(Np, Cr);
		
	}
	else {
		System.out.println("Enter a Valid Number!!!");
	}
	
	}catch(Exception e) {
		System.out.print("ERROR: "+e);
		System.out.println("\n Enter a Number!!!");
		
				}
	}
	

}