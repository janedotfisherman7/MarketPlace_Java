package nemix_Memory_Part_Number_Frame_Work;

import java.util.Iterator;
import java.util.Vector;

public class Main {
	
	memory_Value_storage internal_memory_data;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("This is the public main args struct inside of the nemix memory part number frame work package.");
		
		
	}
	
	public void initialize_memory_value(String Source){
		internal_memory_data = new memory_Value_storage();
		String Mem_type_2_or_3_letters = "blank";
		/*
		 * Begin the task of parsing the info.
		 * 1) break component and find the initial 2, or 3 character ID
		 * IE MS/NS MER/NER MP etc....
		 * 
		 * 2) get the PC speed, it must detect pre-defined speeds
		 * IE 66/100/133/2100/27000/3200/3202/4200/5300/6400/8500/10600/12800
		 * This part make a string/vector with each gen type for future expansion
		 * 
		 * 3) Find the type separator, allow for '|'  ,  '-'  ,  ','  ,  '.'  ,  '_'  etc...
		 * Find 1st instance of separator, this will be followed by the capacity
		 * 
		 * 4) Room for auto intelligence, work out the logic to get the rank, chip artitecture
		 * Have the ability to see if this is a 'Kit' type set up
		 * 
		 * 5) The dot feture operator. If you have a .LP or .LV , then the Low Profile or Low voltage is part of the memory description
		 * IE MER10600-644.LR.LV means this is a ECC Registered PC3-10600 1333MHz 16GB 4Rank x4 Load Reduced Low Volatage module
		 * 
		 * 6) Future and must be added functionality, memory type operator overloads
		 * In the fututure you will pass the information, and the nemix PN will have ALL of the possible options
		 * You will have these reserved actions
		 * a ':' will be reserved for an OEM PN, IE MF5300-424:SYNP0645S mean this 'SYNP0645S' is the OEM PN
		 * from the manufactorer with there sepcifications
		 * 
		 * Allow multiple PN with the ':' overload, IE MF5300-424:SYNP5670s:446C40:A119654 etc....
		 * 
		 * the '{}' section is a hidden operator, the memory description will claim A, but infact will be B
		 * Later explanation will be provided but think about the IBM MER6400-4 that will ship as MER8500-4 due to compatiliblity
		 * 
		 * 
		 */
		
		
		
		//Step one, yank the initial identifier
		Mem_type_2_or_3_letters = initial_identifier(Source);
		//Now the 'Mem_type_2_or_3' has something like MER or MF or MS or MP etc....
		
		
	}

	private String initial_identifier(String Source) {
		// TODO Auto-generated method stub
		Vector<String> memory_Types_STR = new Vector<String>();
		
		System.out.println("Inside the What Kind of memory type");
		System.out.println("The value that was passed is" + Source);
	
		if(Source.isEmpty()){	System.out.println("sent a blank String to What Kind of Memmory Type am I"); return "";	}
		//Have faith in human stupidity, catch a blank string and print out warning. Return NULL
		//Maybe later on void 

		
		initilize_The_Memtype_Vector(memory_Types_STR);
		//This functions just pre-filled all of the type of Nemix data
		//Later add the Kingston part numbers or Dataram part numbers
		//Who knows where this function will go
		
		Iterator Vector_itrrator = memory_Types_STR.iterator();		//iterator
		int temp_Value_for_3_char_test = 0;							//Use this for the 3 char
		
		String Parent_Source_Three_Char = Source.substring(0,3);	//use for 3 char scan
		String Parent_Source_Two_Char = Source.substring(0,2);		//use for 2 char scan
		
		

		
		//------------------------------------------------------------------------Add more brackets?
		
		
		
		while(Vector_itrrator.hasNext()){
			//In here iterate through the Vector DB, and find match
			
			//System.out.println("I have passed inside the while loop " + temp_Value_for_3_char_test + "times");	
			if(temp_Value_for_3_char_test < 2)
			{
			//Inside the STAND ALONE Internal if statement
			//We look for an over-ride match of 3 characters
			//After the 2nd scan, if statement ignored!!!!
				
				String compare_Mem_from_Mem_DB = (String) Vector_itrrator.next();
				//Copy current memory type STRING ID, into comparer
				//Understand that this action copied things like "MER" or "MF"
				
				if(compare_Mem_from_Mem_DB.equals(Parent_Source_Three_Char)){
					internal_memory_data.set_enum_mem_too_ECC_REG();
					
					//return Memory_Type.get_ECC_REG();		//Memory_Type.ECC_REG;
					//The returned if memory was MER or NER only!!!!
					
					//If you are inside the loop, that means you found a MER, or NER memory
					//exit out of the whole loop as the correct memory was found
					//Do NOT allow multiple hits in this framework
				}
			
				System.out.println("I should SEE THIS STATEMENT only 2X for the What Kind of Memmory type am I section!!!");
				//Comment this out after successful testing
				
				temp_Value_for_3_char_test++;
				//Increment this as to switch to two char testing
			}
			//Outside of here, we have the rest of the if statement that SKIPPED the 1st scan
			//Ergo the 3 chars character testing is OVER
			else{
				String compare_Mem_from_Mem_DB = (String) Vector_itrrator.next();
				//Same rules as before, except now we check for two characters 
				//This string now has either MF or NF now
				
				temp_Value_for_3_char_test++;	//Place this here for good reason
				//increment the count to return what TYPE of memory, see notes
				//Also implement the divide by two rule for the memory type
				
				if(compare_Mem_from_Mem_DB.equals(Parent_Source_Two_Char)){
					/*
					 * 
					 * If you have made it here then you must do the following
					 * Divide the total count by 2, then hit ceiling 
					 * After do the switch statement and send matching memory
					 */
					double switch_value = temp_Value_for_3_char_test;
					/*
					 * do a type case to convert the int into a double
					 */
					
					//This double is now either 2.5 or 3
					//doing ceiling, will cause it to become ONLY 3.
					switch_value = switch_value / 2;
					//Divide the value, chance of being 3.5 OR 4
					switch_value = Math.ceil(switch_value);
					//use ceiling value to get rig of ambiguity
					int switch_value_int = (int) switch_value;
					//Case BACK to int, and proceed with SWITCH
					switch(switch_value_int){
					case 1:
						System.out.println("If you see this, please review code in What Kind of Memory type Please See switch(switch_value_int)");
						//return Memory_Type.get_ECC_REG();			//Memory_Type.get_ECC_REG_Type();
						internal_memory_data.set_enum_mem_too_ECC_REG();
						break;
						
					case 2:	//ME
						//return Memory_Type.get_ECC();				//Memory_Type.get_ECC_Type();
						internal_memory_data.set_enum_mem_too_ECC();
						break;
								
					case 3:	//MR
						//return Memory_Type.get_REG();				//Memory_Type.get_REG_Type();
						internal_memory_data.set_enum_mem_too_REG();
						break;
					case 4:	//MF
						//return Memory_Type.get_FULLYBUFFERED();		//Memory_Type.get_FULLYBUFFERED_Type();
						internal_memory_data.set_enum_mem_too_FULLYBUFFERED();
						break;
								
					case 5:	//MP
						//return Memory_Type.get_MACPRO();			//Memory_Type.get_MACPRO_Type();
						internal_memory_data.set_enum_mem_too_MACPRO();
						break;
								
					case 6:	//MD
						//return Memory_Type.get_DESKTOP();			//Memory_Type.get_DESKTOP_Type();
						internal_memory_data.set_enum_mem_too_DESKTOP();
						break;
						
					case 7:	//MS
						//return Memory_Type.get_LAPTOP();			//Memory_Type.get_LAPTOP_Type();
						internal_memory_data.set_enum_mem_too_LAPTOP();
						break;
					}
						
					//return Memory_Type.get_PROPRIETARY();			//Memory_Type.get_PROPRIETARY_Type();
					internal_memory_data.set_enum_mem_too_PROPRIETARY();
					break;
					//The returned if memory was MER or NER only!!!!
					
				}
				System.out.println("I should SEE THIS STATEMENT X Many times for the What Kind of Memmory type am I section!!!");	
			}
		
		
		}
		//-----------------------------------------------------------------------Add more brackets?
		
		return null;
	}

	
	
	
	private void initilize_The_Memtype_Vector(Vector<String> memory_Types_STR) {
		// TODO Auto-generated method stub
		//Create the MER 1st, to make sure that it's recognized
		//and the mistake of ME vs MER won't happen
		
		/*
		 * Here contain all of the Nemix Prefix types
		 * from the Memory type starting with M, to the generic type of N
		 * Later expand to include things like Kingstons maybe and Dataram
		 */
		memory_Types_STR.add("MER");	//ECC Reg	//between .5 and 1
		memory_Types_STR.add("NER");
		memory_Types_STR.add("ME");		//ECC only	//between 1.5 and 2
		memory_Types_STR.add("NE");
		memory_Types_STR.add("MR");		//Reg Only	//between 2.5 and 3
		memory_Types_STR.add("NR");
		memory_Types_STR.add("MF");		//Fully Buff //between 3.5 and 4
		memory_Types_STR.add("NF");
		memory_Types_STR.add("MP");		//Mac Pro 	//between 4.5 and 5
		memory_Types_STR.add("NP");
		memory_Types_STR.add("MD");		//Desktop	//between 5.5 and 6
		memory_Types_STR.add("ND");
		memory_Types_STR.add("MS");		//Laptop	//between 6.5 and 7
		memory_Types_STR.add("NS");
		
	};

	
}
