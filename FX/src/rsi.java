import java.util.Scanner;

public class rsi {

		//gain
	    public static double gain(double yestD, double toD) {
	    double  profit =toD - yestD;
	    
	    	return profit;
	    }
	    
	    // Loss
	    public static double loss(double yestD,  double toD) {
	    	double lost =  yestD - toD;
	    	 
	    	return lost;
	    }
		
	    // break even
	    public static double even(double yestD, double toD) {
	    	double norm = toD;
	    	return norm;
	    }
	    
	    // Initial Average Gain
	    public static double InitAvgGain() {
	    	double InitGain = 0;
	    			
	    			
	    		return InitGain; 
	    }
	    
	    // Initial Average Loss
	    public static double InitAvgLoss() {
	    	double InitLoss=0;
	    	
	    	return InitLoss;
	    }
	    
	    //Average Gain
//	    public static double AvgGain(N,InitGain()) {
//	    	double AvGain = ((InitGain*(N-1)+gain.profit)/N);
//	    	
//	    	return AvGain;
//	    			
//	    }
	    
//	    //Average Loss
//	    public static double AvgLoss(N,InitLoss()) {
//	    	double AvGain = ((InitGain*(N-1)+loss.lost)/N);
//	    	
//	    	return AvLoss;
//	    			
//	    }

public static void main(String args[]) {

	Scanner sn = new Scanner(System.in);
	int N=0;  //Number of days to calculate for
	 System.out.println("Number of Days : " );
	 N = sn.nextInt();
	
	 
	double c = 7.123; //current closing price
	double p = 7.123; // previous closing price
	
	if (c<p) {
	System.out.println("LOSS: "+loss(c,p));
	}
	else if(c>p) {
		System.out.println("GAIN: "+gain(c,p));
	}
	else {
		System.out.println("BREAK EVEN: "+even(c,p));
	}
	
	
}
}