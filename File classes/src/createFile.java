import java.io.File;
import java.lang.*;
import java.util.*;

public class createFile { 
	private Formatter x;
	
	public void openFile() {try {
		x = new Formatter("Akan.txt");
	
	}
	catch (Exception e) {
		System.out.println("ERROR: "+e);
		}
	}
	
	public void addRecords() {
		
		x.format("%s%s%s", "5 ", "Ekow ", "Yamoah");
	}
	
	public void closeFile() {
		x.close();
	}
}