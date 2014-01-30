package nemix_Memory_Part_Number_Frame_Work;

public class memory_Value_storage {

	String nemix_Main_Part_number;
	String nemix_SKU_part_nuber;
	int capacity;
	String Speed_MHz;
	String Speed_PC;
	int ddr_generation;
	String speed_decritpion;
	String volt;
	String URL_Location;
	String pin_config;
	int rank;
	int chip_artitecture;
	boolean low_volt;
	boolean low_profile;
	Pure_Enum memory_type;
	boolean nemix_or_NonNemix;			//Difference between MF5300-424 or NF5300-424
	//This just stores info, have minimal function?
	//LAPTOP, DESKTOP, ECC, ECC_REG ,REG , MACPRO , FULLYBUFFERED ,PROPRIETARY
	void set_enum_mem_too_LAPTOP()				{memory_type = Pure_Enum.LAPTOP;			}
	void set_enum_mem_too_DESKTOP()				{memory_type = Pure_Enum.DESKTOP; 			}
	void set_enum_mem_too_ECC()					{memory_type = Pure_Enum.ECC; 				}
	void set_enum_mem_too_ECC_REG()				{memory_type = Pure_Enum.ECC_REG; 			}
	void set_enum_mem_too_REG()					{memory_type = Pure_Enum.REG; 				}
	void set_enum_mem_too_MACPRO()				{memory_type = Pure_Enum.MACPRO; 			}
	void set_enum_mem_too_FULLYBUFFERED()		{memory_type = Pure_Enum.FULLYBUFFERED; 	}
	void set_enum_mem_too_PROPRIETARY()			{memory_type = Pure_Enum.PROPRIETARY; 		}
	
}
