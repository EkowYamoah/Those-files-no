import java.io.File;
import java.lang.*;
import java.util.*;


class FileMain {
	public static void main(String[] args){try {
// ** READING FROM FILES
		readFile rfile = new readFile();
		
		rfile.openFile();
		rfile.readfile();
		rfile.closeFIle();
		
// ** WRITING TO FILES
//		createFile cfile = new createFile();
//		cfile.openFile();
//		cfile.addRecords();
//		cfile.closeFile();
		
// ** CREATING FILES
//		final Formatter x; // outputs strings to a file
//		
//		x = new Formatter("Ekow.txt");
//		System.out.println("File created succesfully!");
//		
		
// ** TESTING FOR FILE EXISTENCE		
//		File x = new File("Ekow.txt");
//	if(x.exists())
//		System.out.println(x.getName()+" exists");
//	else
//		System.out.println(x.getName()+" does not exist");
	}
	catch(Exception e) {
		System.out.println("ERROR: "+e);
		}
	}
}
