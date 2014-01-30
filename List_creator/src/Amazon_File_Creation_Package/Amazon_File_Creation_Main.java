package Amazon_File_Creation_Package;

import read_Flat_Files_Into_Two_Dim_Vectors.Read_Flat_Files_Into_Two_Dim_Vectors_MAIN;
import Two_dimension_Vector_Packages.TWO_Dimension_Vector;

public class Amazon_File_Creation_Main {
	static String file_location_STR;// = "Yes";

	public Amazon_File_Creation_Main(String nemix_Flat_File_Location) {
		// TODO Auto-generated constructor stub
		/*
		 * This is the package file need to create amazon flat files
		 * Do all the work that's needed
		 * Only required argument is a url String to the file LOCATION
		 * 
		 * Call reading flat file packages to read the contents into a 2D vector
		 * Call that 'Vector' 'imported_flat_file_data'
		 * Now Use both the Amazon header info, and the nemix standard flat file info
		 * and create the the required parameters 1st
		 * IE Read a single row, find the nemix Part #
		 * then extract required information from that part #
		 * IE if it is MD6400-2, have the fact that it is 800MHz PC2-6400 DDR2 240Pin Desktop 1.8V
		 * 2GB modules, with img url = blahblahbalh.com/images/240Pin_Desktop.jpg
		 * 
		 * THEN
		 * Create the an array that will then intern create required fields in order (but not completed)
		 * AFTER all info extracted and in correct order, then send this NEW 2D vector to be exported under the
		 * amazon coloumns
		 */
		
		file_location_STR = nemix_Flat_File_Location;
		
		/*
		 * String location saved in a static file
		 * Create the required headers and anything else needed
		 */
		
		Amazon_Header_creation Amz_header = new Amazon_Header_creation();
		//String[] amaz_header_array = Amz_header.Amazon_Header_creation_create_header_ARRAY();
		/*
		 * File above has header information inside a String array
		 * Currently the Amazon header is take from 09/29/2013
		 * May require later updates?
		 */
		
		TWO_Dimension_Vector Amazon_Flat_file_2_Dimesnion_vector = new TWO_Dimension_Vector();
		TWO_Dimension_Vector imported_flat_file_data = new TWO_Dimension_Vector();
		/*
		 * Above are the two separate 2D vector objects
		 * One will contain the imported nemix flat file data
		 * the other will contain amazon header, and THEN
		 * contain all of the needed data to be used by amazon flat file uploading media
		 */
		Amz_header.Populate_Amazon_header_info(Amazon_Flat_file_2_Dimesnion_vector);
		/*
		 * Created a 2D vector to store the imported flat file data.
		 * That said flat file MUST be the nemix Standard flat file
		 */
		
		Read_Flat_Files_Into_Two_Dim_Vectors_MAIN read_amz_file_into_2D_Vecotr = new Read_Flat_Files_Into_Two_Dim_Vectors_MAIN();//null;// = new Read_Flat_Files_Into_Two_Dim_Vectors(file_location_STR);
		imported_flat_file_data = read_amz_file_into_2D_Vecotr.Read_Flat_Files_Into_Two_Dim_Vectors(file_location_STR);
		/*
		 * imported_flat_file_data has the nemix flat file info inside a 2D vector 
		 */
		
		
		/*
		 * New step send the nemix flat file 2D vector, and begin creating the 
		 * Intermediate 2D vector (there call function(s) to extract required info)
		 * Ergo, create new function called intermediate amazon flat file creation
		 *
		 */
		
		intermediate_Amazon_Fucntion_step(imported_flat_file_data);
		
		
		
	}

	private void intermediate_Amazon_Fucntion_step(TWO_Dimension_Vector Source_2D_vector_Data) {
		// TODO Auto-generated method stub
		/*
		 * Goals here, begin extraction process of data
		 * 
		 */
		
		TWO_Dimension_Vector intermideate_2D_vector = new TWO_Dimension_Vector();
		System.out.println("Inside the Amazon File Creation made, inside the intermediate Amazon Function Steps");
		
		intermediate_Amazon_Fucntion intermediate_steps = new intermediate_Amazon_Fucntion(Source_2D_vector_Data,intermideate_2D_vector);		// intermediate_steps
		//Source_2D_vector_Data.
		
		
	}

	public String get_desired_flat_file_address() {
		/*
		 * A public wide system call to get string address.
		 * This can now be used anywhere in the system
		 * I kinda wanna make a struct type deal here, but I don't know if java can do that.
		 */

		return file_location_STR;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("This is the 'MAIN' stub inside of the Amazon_File_Creation_Main, which is inside the amazon file creation package");
		System.out.println("You should not see this unless you are debuging, as this is the main call, instead use the public call to do all of the work");
		System.out.println("There should be no functionaility in this section");
		
	}

}
