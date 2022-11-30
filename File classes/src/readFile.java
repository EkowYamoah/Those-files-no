import java.util.*;
import java.io.*;

public class readFile {
	private Scanner r;
	
	public void openFile() {
		try {
			r = new Scanner(new File("Akan.txt"));
			
		}
		catch(Exception e) {
			System.out.println("ERROR: "+e);
		}
		
	}
	public void readfile() {
		while(r.hasNext()) {
			String a = r.next();
			String b = r.next();
			String c = r.next();
			
			System.out.printf("%s %s %s\n",a,b,c);
			
		}
		
	}
	public void closeFIle() {
		r.close();
	}
}
