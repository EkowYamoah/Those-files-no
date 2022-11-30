package intermediate;

public class stringMeths {
	public static void main(String [] args) {
		String[] words = {"funk","chunk","furry","baconator","emasculator"};
	
		String s = "elastriculatrist";
		
		
		//startsWith method
		for(String b :  words) {
			if(b.startsWith("ba")) 
				System.out.println(b+" starts with "+b.charAt(0)+""+b.charAt(1));
		}
		System.out.println();
		
		//endsWith method
		for(String w :  words) {
			if(w.endsWith("or")) 
				System.out.println(w+" ends with "+w.charAt(w.length()-2)+""+w.charAt(w.length()-1));
		
		
	}
		System.out.println();
		// indexOf(value,starting point ) method - looks for the first instance of a character
		System.out.println(s.indexOf("rist"));
} // other methods inlude: toLowerCase(), toUpperCase(), concat 
}
