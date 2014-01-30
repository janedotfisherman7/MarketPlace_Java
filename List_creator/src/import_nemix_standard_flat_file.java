import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import Two_dimension_Vector_Packages.TWO_Dimension_Vector;
import Two_dimension_Vector_Packages.TWO_Dimension_Vector_OBJ;

//import Amazon_Flat_File_Creation.Amazon_Flat_file_creation_main;


public class import_nemix_standard_flat_file {
	
	static TWO_Dimension_Vector Static_Source_2D_Vector;
	static String Static_LocationSTR;

	public import_nemix_standard_flat_file(String source_LocationSTR,TWO_Dimension_Vector Source_2D_Vector) throws IOException {
		/*
		 * Here begin importation of a flat file
		 * To do so you need two things, one, a location of file (as a string), and then an empty 2Dim Vector
		 * After completion the 2Dim vector now has all that data including the column
		 * This file is intended for importing of the Nemix Standard flat files, and those specific flat files only.
		 * 
		 */
		
		/*
		 * TO DO!!!!!!!!!!
		 * Create rejection option to make sure the data is correct.
		 * Use the same code that creates the flat file, and create check function in there
		 * Allow room for 
		 * 
		 */
		
		System.out.println("Inside the import_nemix_standard_file");
		
		read_nemix_Standard_flat_file(source_LocationSTR, Source_2D_Vector);
	    System.out.println("See me at the start before print all =aaaaa ");
	//    Source_2D_Vector.Print_to_Screen_All_data();
	    System.out.println("See me at the end ");
		/*
		 * After execution, you have the flat file data inside the 2D Vector
		 * Save data to a static file for future use for different Marketplaces :)
		 */
	
		
	}
	/*
	public void create_Amazon_Flat_File(){
		System.out.println("Is this stuck???");
	}
	*/
	
	public void create_Amazon_Flat_File() {
		// TODO public argument, to call private function and do needed tasks
		//To create amazon flat file. See Static fields????
		//Create fail safe to make this can not be called uninitialized static fields? 
		System.out.println("test to see if static url string works nananana");
	//	System.out.println(Static_LocationSTR.toString());
		System.out.println("I hope you see this before hello?");
		if(Static_Source_2D_Vector == null){
			System.out.println("Sorry it seems you called this function while a critical data point is empty, Code import_nemix_Standard_flat_file_001");
			return;
		}
		if(Static_LocationSTR == null){
			//Do I need this?!?!??!?!?!?
			System.out.println("Sorry it seems you called this function while a critical data point is empty, Code import_nemix_Standard_flat_file_002");
			return;
		}
		
		private_create_Amazon_Flat_File();
	}


	private void private_create_Amazon_Flat_File() {
		// TODO Auto-generated method stub
		/*
		 * Magic time, crease the needed functionality to have create the amazon flat file here
		 * Use the static fields to url source (not needed???!?!?!) and the 2D vector 
		 * Create new Amazon reusable package to figure out what to do with the data
		 * Goals, pass a single array (row) at a time to the function. Create a static 
		 * 2D vector object that keeps adding that data onto it
		 * After completion, then and only then export it to default path with date stamp
		 * 
		 */
		
		Amazon_Flat_file_creation_main Amazon_Flat_file_creation_main_Object = new Amazon_Flat_file_creation_main(Static_Source_2D_Vector);
		
	}


	private static void read_nemix_Standard_flat_file(String source_LocationSTR,TWO_Dimension_Vector Source_2D_Vector ) throws IOException {

		 System.out.println("the target being read inside import nemix std = " + source_LocationSTR);
		 
		 
		 String csvFileToRead = source_LocationSTR.toString();  
		  BufferedReader br = null;  
		  String line = "";  
		  String splitBy = ",";  
		  
		  try {  
		  
		   br = new BufferedReader(new FileReader(csvFileToRead));  
		   while ((line = br.readLine()) != null) {  
		  
		    String[] imported_column = line.split(splitBy);  
		    //Goal here, take each individual sting in array, and copy into the vector inside
		    //Not main stack vector stack
		    
		    TWO_Dimension_Vector_OBJ temp_Vector_OBJECT = new TWO_Dimension_Vector_OBJ();
		    for (int i=0; i< imported_column.length; i++){

		    	temp_Vector_OBJECT.add(imported_column[i]);
		    	//After this, the temp vector now has all of the needed info
		    }

		    Source_2D_Vector.add_to_Main_Vector_Stack(temp_Vector_OBJECT);
		    //Added this temp 2D object data into main vector stack successfully
		    
		   }  
		  
		  } catch (FileNotFoundException e) {  
		   e.printStackTrace();  
		  } catch (IOException e) {  
		   e.printStackTrace();  
		  } finally {  
		   if (br != null) {  
		    try {  
		     br.close();  
		    } catch (IOException e) {  
		     e.printStackTrace();  
		    }  
		   }  
		  }  
		  
		  System.out.println("Done with reading CSV"); 
		  
		  Static_Source_2D_Vector = Source_2D_Vector;
		  Static_LocationSTR = source_LocationSTR;
		  /*
		   * Run once, implement as many times as you want :)
		   * Create fail safe to make sure importation/exportation occurs once??????
		   * 
		   */
		  
	
	}
	
	

}
