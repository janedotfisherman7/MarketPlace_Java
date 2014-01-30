package Memory_decode_Package;

import nemix_Memory_Part_Number_Frame_Work.Pure_Enum;

public class Memory_Parent_Info_Required {
	//Have the most basic required functions here.
	//NOT a point of entry, this is just a structured way to create manipulate data etc..
	String memory_name_STR;
	String PC_Speed_STR;
	String MHz_Speed;
	int capacity_INT;
	int Optional_rank_INT;
	int Optional_chip_arc_INT;
	int DDR_Generation_INT;
	Pure_Enum Enumeratoed_memory_type;
	
	Memory_Parent_Info_Required(){
		System.out.println("Do nothing constructor");
	}
	
	Memory_Parent_Info_Required(String Source){
		//Constructor, that Passes ONLY a String that is a Nemix Memory String, IE MER10600-424.LP
		
		
		
	}

}
