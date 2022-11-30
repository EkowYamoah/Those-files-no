package intermediate;
import java.util.*;

//collections with ArrayList
public class collections {
	public static void main(String[] args) {
		String[] stuff= {"eggs", "hats", "lasers","pie"};
		List<String> list1 = new ArrayList<String>();
	
	//add array items to list
		for(String x: stuff) 
			list1.add(x);
		
		String[] morethings   = {"lasers", "hats"};
		List<String> list2 = new ArrayList<String>();
	
	//add array items to list2 
		for(String y: morethings)
			list2.add(y);
		
	//print out list 1
		for(int i = 0; i<list1.size();i++) {
			System.out.printf("%s ",list1.get(i));
		}
		
		editList(list1,list2);
		System.out.println();
	
		System.out.println("\n");
		System.out.println("List 1 : ");
	//print out new list 1
		for(int i= 0;i<list1.size();i++) {
			System.out.printf("%s ",list1.get(i));
			
		}
	//print out list 2
			System.out.println("\n");
			System.out.println("List 2: ");
			for(int x =0; x<list1.size();x++) {
				
				System.out.printf("%s ", list2.get(x));
			}
		
		}
	
	public static void editList(Collection<String> L1, Collection<String> L2) {
		Iterator<String> it = L1.iterator();
		while(it.hasNext()) {
			if(L2.contains(it.next()))
				it.remove();
		}
	}
}