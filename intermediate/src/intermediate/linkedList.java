package intermediate;
import java.util.*;

public class linkedList {
	public static void main(String[] args) {
		String [] items= {"apples","shoes","goat","pigs"};
		List<String> list= new LinkedList<String>();
		
		
		for(String x: items)
			list.add(x);
	}
}
