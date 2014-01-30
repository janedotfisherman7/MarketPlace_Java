import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;


public class Write_Template_CSV {

	void write_Data(Vector<String> Source_Vecotr_STR){		};

	Write_Template_CSV() throws IOException{		
		//Constructor, execute immediate write to file command
		
		execute_Write();
		
		}

	
	private void execute_Write() throws IOException {
		// TODO Auto-generated method stub

		String default_directory = System.getProperty("user.dir");
		System.out.println("The current default dir = " + default_directory);
		//FileWriter fw = new FileWriter("C:\\Users\\Ghost\\Dropbox\\Programs\\Eclipse\\workspace\\List_creator\\CSV_Data\\WriteTest2.csv");
		FileWriter fw = new FileWriter(default_directory.toString() + "\\WriteTest2.csv");
	    
	    PrintWriter pw = new PrintWriter(fw);
		
	    CSV_File_Header_Defintions(pw);
	  
	  //Flush the output to the file
	    pw.flush();
	    
	    //Close the Print Writer
	    pw.close();
	    
	    //Close the File Writer
	    fw.close();
		
	}

	private static void CSV_File_Header_Defintions(PrintWriter Source_PW) {
		//The header will define all of the arguments,
		//This is self sustaining code
		Vector <String> Header_Defintions = new Vector<String>();
		Header_Defintions.add("UPC_Rev_09_27_2013");		//Code over-write
		Header_Defintions.add("Machine");
		Header_Defintions.add("Series");
		Header_Defintions.add("Model");
		Header_Defintions.add("Max Ram");
		Header_Defintions.add("Slots");
		Header_Defintions.add("Capacity");
		Header_Defintions.add("Speed");
		Header_Defintions.add("Speed Discription");
		Header_Defintions.add("Title");
		Header_Defintions.add("Decriptioin");
		Header_Defintions.add("Nemix PN");
		Header_Defintions.add("SKU");
		Header_Defintions.add("URL_IMG");
		Header_Defintions.add("OEM");
		Header_Defintions.add("Weight");
		
		create_Header_with_Vector(Header_Defintions,Source_PW);
		}
	
	private static void create_Header_with_Vector(Vector<String> source_Vector, PrintWriter source_PW) {
		// TODO Auto-generated method stub
		java.util.Iterator<String> vector_iterator = source_Vector.iterator();
		
		//Here is the over-write clause
		String newInput = vector_iterator.next();	//take the 1st value, and then IGNORE it
		Integer over_Write_Value_Int = source_Vector.capacity();
		newInput = over_Write_Value_Int.toString();
		
		source_PW.print("UPC");
		line(source_PW);
		
		
		while(vector_iterator.hasNext()){	
			newInput = vector_iterator.next();
			source_PW.print(newInput);
			line(source_PW);
		}

	}

	private static void line(PrintWriter source_PW) {source_PW.print(",");	}
}


