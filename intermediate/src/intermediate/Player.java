package intermediate;

public class Player {
	
	
	int number = 0; //guess container
	
	public void guess() {
		number = (int) (Math.random()*10);
		System.out.println("I'm guessing "+number);
		
	}
}
