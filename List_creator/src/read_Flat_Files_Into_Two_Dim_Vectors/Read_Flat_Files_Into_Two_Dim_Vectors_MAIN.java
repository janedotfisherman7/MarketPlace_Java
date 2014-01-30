package read_Flat_Files_Into_Two_Dim_Vectors;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import Two_dimension_Vector_Packages.TWO_Dimension_Vector;
import Two_dimension_Vector_Packages.TWO_Dimension_Vector_OBJ;

public class Read_Flat_Files_Into_Two_Dim_Vectors_MAIN {

	
	public Read_Flat_Files_Into_Two_Dim_Vectors_MAIN(){
		//This is a public do nothing constructor!
		System.out.println("This is a public do nothing constructor! for read flat files into two dim vector main");
		
	}
	
	
	public TWO_Dimension_Vector Read_Flat_Files_Into_Two_Dim_Vectors(String file_location_STR) {
		/*
		 * This is the public constructor file call
		 * Here there will be only a single task
		 * Read a flat file data into a 2Dimesion Vector
		 * After completion, save the 2D Vector and return it to the caller
		 * The data there will have all the contents of the flat file
		 * There will be no integrity checks in this function call
		 */
		
		System.out.println("Inside the read flat files into two dim vectors, passing a string file location str");
		TWO_Dimension_Vector two_Dimesnion_vector = new TWO_Dimension_Vector();
		//Created the 2D vector, now pass this info to a private function
		
		begin_importing_data(file_location_STR,two_Dimesnion_vector);
		
		//System.out.println("Please call the print 2D vector to verify data is saved/stored correctly");
		//two_Dimesnion_vector.Print_to_Screen_All_data();
		
		//System.out.println("After this call, data should be returned back to host caller, test there to verify data is intact");
		//Process verfied to work correctly, all data is good
		return two_Dimesnion_vector;
		
	}

	private void begin_importing_data(String source_LocationSTR, TWO_Dimension_Vector Source_2D_Vector) {
		// TODO Auto-generated method stub
		
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
		    
		    TWO_Dimension_Vector_OBJ temp_Vector_OBJECT = Source_2D_Vector.return_a_new_two_Dim_Vectr_Object();
		    for (int i=0; i< imported_column.length; i++){

		    	//System.out.println("Debug inside the read flat files = " + imported_column[i]);
		    	temp_Vector_OBJECT.add(imported_column[i]);
		    	//After this, the temp vector now has all of the needed info
		    }
		    /*
		     * Tested here, data is stored correctly, add to the main vector stack
		     */
		    
		    Source_2D_Vector.add_to_Main_Vector_Stack(temp_Vector_OBJECT);
		    //Added this temp 2D object data into main vector stack successfully
		    //System.out.println("Before adding the vector object, print it's contents");
		    //Source_2D_Vector.Print_to_Screen_All_data();
		    //System.out.println("Finsihed printing all the data before adding to main vector stack");
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
		  
		  
		 // return Source_2D_Vector;
	//	  Static_LocationSTR = source_LocationSTR;
		
	}
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("This is the 'MAIN' stub inside of the Read_Flat_Files_Into_Two_Dim_Vectors_MAIN, which is inside the Read_Flat_Files_Into_Two_Dim_Vectors_MAIN creation package");
		System.out.println("You should not see this unless you are debuging, as this is the main call, instead use the public call to do all of the work");
		System.out.println("There should be no functionaility in this section");
		

	}
	*/

}
