package Amazon_File_Creation_Package;

import java.util.Iterator;
import java.util.Vector;

import Two_dimension_Vector_Packages.TWO_Dimension_Vector;
import Two_dimension_Vector_Packages.TWO_Dimension_Vector_OBJ;

public class intermediate_Amazon_Fucntion {
	
	intermediate_Amazon_Fucntion(){
		//Do nothing constructor
	}

	public intermediate_Amazon_Fucntion(TWO_Dimension_Vector Source_Data, TWO_Dimension_Vector Source_EMPTY_intermediate_Vector) {
		
		/*
		 * Goals, take source data, and place it in a useful sequence inside the intermediate section
		 * Go ahead and read the Source data once, which should have the headers. Create a calling section here with the 'int'
		 * value to have quick and direct retrieval
		 * 
		 * After reading the initial time, and setting the initial location data, read each row, one at a time, and export it as needed
		 * to get the required info to place into the intermediate vector
		 * Also create the intermediate Vector headers with the required fields
		 */
		
		Create_amazon_intermidate_header(Source_EMPTY_intermediate_Vector);
		//Now this vector is no longer empty and has the needed intermediate header set up
		
		
		/*
		 * Next steps here, go ahead and read the header of the nemix flat file
		 * Create single array with the exact columns
		 * Let it be smart enough to read revised flat files that will in future be update
		 * Get critical info and save it
		 */
		
		int[] Critical_array_info_locations = new int[12];
		/*
		 * These fields are required for ease of generating required info for intermediate step
		 *  0 will point to Nemix Part number
		 *  1 will point to SKU
		 *  2 will point to Machine
		 *  3 will point to Series
		 *  4 will point to Model
		 *  5 will point to Capacity
		 *  6 will point to OEM
		 *  7 will point to Title
		 *  8 will point to Max Memory
		 *  9 will point to Max Slots
		 * 10 will point to Notes
		 * 11 Keep it open for now?
		 */
		
		find_crtial_info_location_from_imported_2D_Vector(Source_Data,Critical_array_info_locations);
		/*
		 * This looks through the flat files HEADER, and then finds the location of the everything that's needed.
		 * Ideally this will see that column 5 has the nemix part number, so when you read the next row from the
		 * flat file, you wukk call the critical array info location[0] and in this case
		 * it will point to the #5, so you know in the flat file column 5 is the part number
		 */
		
		
		/*
		 * Read the next row into a String array, and take steps needed to place the info into the intermediate 2D vector
		 */
		
		
		
	}

	private void find_crtial_info_location_from_imported_2D_Vector(TWO_Dimension_Vector source_Data,int[] Source_int_array) {
		/*
		 * Go ahead an begin reading the Source_data header info, convert info to all Lower case, change 
		 * all '_' into ' ' Begin individual search for each individual critical memory item
		 */
		
		String [] internal_STR_header_copy = source_Data.return_header();
		//In the internal_STR we have the header items. Please Identify the "nemix part" #
		
		
		Vector <String> reg_exp_NEMIX_PART_NUMBER = new Vector<String>();//String[] reg_exp_nemixpn = {"0","nemix part","nemix part number","nemix pn","nemix partnumber","nemixpartnumber"};
		reg_exp_NEMIX_PART_NUMBER.add("0");
		reg_exp_NEMIX_PART_NUMBER.add("nemix part");
		reg_exp_NEMIX_PART_NUMBER.add("nemix part number");
		reg_exp_NEMIX_PART_NUMBER.add("nemix pn");
		reg_exp_NEMIX_PART_NUMBER.add("nemix partnumber");
		reg_exp_NEMIX_PART_NUMBER.add("nemixpartnumber");
		
		Vector <String> reg_exp_SKU = new Vector<String>();
		reg_exp_SKU.add("1");
		reg_exp_SKU.add("sku");
		
		Vector <String> reg_exp_MACHINE = new Vector<String>();
		reg_exp_MACHINE.add("2");
		reg_exp_MACHINE.add("machine");
		
		Vector <String> reg_exp_SERIES = new Vector<String>();
		reg_exp_SERIES.add("3");
		reg_exp_SERIES.add("series");
		reg_exp_SERIES.add("sereis");
		reg_exp_SERIES.add("ser");
		
		Vector <String> reg_exp_MODEL = new Vector<String>();
		reg_exp_MODEL.add("4");
		reg_exp_MODEL.add("model");
		
		Vector <String> reg_exp_CAPACITY = new Vector<String>();
		reg_exp_CAPACITY.add("5");
		reg_exp_CAPACITY.add("cap");
		reg_exp_CAPACITY.add("capacity");
		reg_exp_CAPACITY.add("capacity per module");
		
		Vector <String> reg_exp_OEM = new Vector<String>();
		reg_exp_OEM.add("6");
		reg_exp_OEM.add("oem");
		reg_exp_OEM.add("manufactor part number");
		reg_exp_OEM.add("manufactor oem");
		reg_exp_OEM.add("oem part number");
		reg_exp_OEM.add("oem number");

		Vector <String> reg_exp_TITLE = new Vector<String>();
		reg_exp_TITLE.add("7");
		reg_exp_TITLE.add("title");
		reg_exp_TITLE.add("title ");
		reg_exp_TITLE.add(" title");

		Vector <String> reg_exp_MAX_MEMORY = new Vector<String>();
		reg_exp_MAX_MEMORY.add("8");
		reg_exp_MAX_MEMORY.add("max memory");
		reg_exp_MAX_MEMORY.add("maximum memory");
		reg_exp_MAX_MEMORY.add("maximummemory");
		reg_exp_MAX_MEMORY.add("max total ram");
		
		Vector <String> reg_exp_MAX_SLOTS = new Vector<String>();
		reg_exp_MAX_SLOTS.add("9");
		reg_exp_MAX_SLOTS.add("max slots");
		reg_exp_MAX_SLOTS.add("total slots");
		reg_exp_MAX_SLOTS.add("slots");
		reg_exp_MAX_SLOTS.add("slot");
		
		Vector <String> reg_exp_NOTES = new Vector<String>();
		reg_exp_NOTES.add("10");
		reg_exp_NOTES.add("note");
		reg_exp_NOTES.add("notes");
		
		find_reg_exp_from_header(internal_STR_header_copy,Source_int_array,reg_exp_NEMIX_PART_NUMBER);
		find_reg_exp_from_header(internal_STR_header_copy,Source_int_array,reg_exp_SKU);
		find_reg_exp_from_header(internal_STR_header_copy,Source_int_array,reg_exp_MACHINE);
		find_reg_exp_from_header(internal_STR_header_copy,Source_int_array,reg_exp_SERIES);
		find_reg_exp_from_header(internal_STR_header_copy,Source_int_array,reg_exp_MODEL);
		find_reg_exp_from_header(internal_STR_header_copy,Source_int_array,reg_exp_MACHINE);
		find_reg_exp_from_header(internal_STR_header_copy,Source_int_array,reg_exp_CAPACITY);
		find_reg_exp_from_header(internal_STR_header_copy,Source_int_array,reg_exp_OEM);
		find_reg_exp_from_header(internal_STR_header_copy,Source_int_array,reg_exp_TITLE);
		find_reg_exp_from_header(internal_STR_header_copy,Source_int_array,reg_exp_MAX_MEMORY);
		find_reg_exp_from_header(internal_STR_header_copy,Source_int_array,reg_exp_MAX_SLOTS);
		find_reg_exp_from_header(internal_STR_header_copy,Source_int_array,reg_exp_NOTES);
		
		
	}

	private void find_reg_exp_from_header(String[] Source_header, int[] Source_int_array,Vector<String> Source_reg_exp) {
		// TODO Auto-generated method stub
		/*
		 * Method to be done here, create a String array that will contain all of the lower case
		 * value of possible nameing conventions for nemix part number
		 * IE nemix pn, nemix_part_number, nemix part number 
		 * 
		 * You will take each individual item from string header, convert everything to lower case, and then compare
		 * Once an item is found, place that said value into location 0, then break
		 */
		//System.out.println("Hard testing = " + Source_reg_exp.toString());
		Iterator Source_reg_exp_iterator = Source_reg_exp.iterator();
		
		String setting_value_STRING = (String) Source_reg_exp_iterator.next();		//The 1st value should have been the identifier string
		int setting_value_int = Integer.parseInt(setting_value_STRING);

		//Just Copied the 1st part of the reg expression into a int.
		//Copy the vector into a String array, SKIPPING the 1st part of the vector
		//1st part has the Critical info part identifier and should not be looked at!!!
		
		String[] reg_expression_bastard = new String[(Source_reg_exp.size()-1)];
		
		int counter = 0;
		
		String temp_str = " blank";
		while(Source_reg_exp_iterator.hasNext()){
			temp_str = (String) Source_reg_exp_iterator.next();
			reg_expression_bastard[counter] = temp_str;
			counter++;
		}
		//Afer this, the reg exp bastard has the string array without the ID
		
		for (int i=0; i<Source_header.length; i++)
		{
			
			for(int j=0; j<reg_expression_bastard.length;j++)
			{
				if(reg_expression_bastard[j].equalsIgnoreCase(Source_header[i]))
				{
					
					Source_int_array[0] = i;
					//Saved the location now
		//			System.out.println("Found " + reg_expression_bastard[j] + " in location " + i);
					break;
				}
				
			}
			
		}
		
	}

	
	
	
	
	private void Create_amazon_intermidate_header(TWO_Dimension_Vector Source_Empty_Vector) {
		//Source Vector here is initialized, but it is EMPTY
		//Create header, place header into a String Array, and begin populating
		//1st thing will be of course the headers
		
		String[] Intermideate_header_String_array;// = null;
		
		Intermideate_header_String_array = Create_amazon_intermideate_header_into_String_array();
		/*
		 * Passed an empty undefined string
		 * After this call, it will have the required headers that must be filled in.
		 * Some of the columns will require lots of work, like the product description
		 * call outside functions to create them
		 * 
		 */
		//System.out.println("Before calling the return 2D vector object");
		TWO_Dimension_Vector_OBJ temp_Vector_OBJECT = Source_Empty_Vector.return_a_new_two_Dim_Vectr_Object();
		//System.out.println("Before the for loop");
		for (int i = 0; i<Intermideate_header_String_array.length; i++){
			temp_Vector_OBJECT.add(Intermideate_header_String_array[i]);
			//Function that adds the columns here
			//one at a time, please test and verify
			//System.out.println("I am adding the intermediate headers here = " + Intermideate_header_String_array[i]);
		}
		Source_Empty_Vector.add_to_Main_Vector_Stack(temp_Vector_OBJECT);
		/*
		System.out.println("Test here to check that everything added correctly");
		Source_Empty_Vector.Print_to_Screen_All_data();
		//Now this vector is no longer empty?
		System.out.println("If data not printed, then vector still empty");
		*/
	}

	private String[] Create_amazon_intermideate_header_into_String_array() {
		// TODO Auto-generated method stub
		String[] String_array = new String[21];
		
		String_array[0] = "SKU";		//Also called SKU?
		String_array[1] = "UPC";
		String_array[2] = "Item Name";
		String_array[3] = "Brand Name";
		String_array[4] = "Product Description";		//This will have the HTML headers and all of the stuff gor humans to read
		String_array[5] = "Part Number";				//Maybe the OEM???
		String_array[6] = "Model";
		String_array[7] = "Price";
		String_array[8] = "Bullet Point 1";
		String_array[9] = "Bullet Point 2";
		String_array[10] = "Bullet Point 3";
		String_array[11] = "Bullet Point 4";
		String_array[12] = "Bullet Point 5";
		String_array[13] = "Search Term 1";
		String_array[14] = "Search Term 2";
		String_array[15] = "Search Term 3";
		String_array[16] = "Search Term 4";
		String_array[17] = "Search Term 5";
		String_array[18] = "image url";
		String_array[19] = "weight of memory";
		String_array[20] = "Notes";
		
		//System.out.println("Hope that this string will copy over??");
		return String_array; 
		
		}

	
	
}

	