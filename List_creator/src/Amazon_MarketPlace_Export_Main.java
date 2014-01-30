import java.io.IOException;
import java.util.Vector;

import Two_dimension_Vector_Packages.TWO_Dimension_Vector;
import Amazon_File_Creation_Package.Amazon_File_Creation_Main;


public class Amazon_MarketPlace_Export_Main {
	/*
	 * Amazon file chosen, have a Frame work set up here
	 * Read from the flat file that 'Headers' Allow ambiguity and auto correct
	 * Give feedback on the Rev_ID as well
	 * With each pass of a row, create and add to the 2D Vector
	 * The 2D Vector will have the Amazon req. headers
	 * Then the needed info in the rest of the Vector IDs.
	 */
	TWO_Dimension_Vector Amazon_Marketplace_flat_file = new TWO_Dimension_Vector();
	//TWO_Dimension_Vector imported_template_flat_file_2D_Vector = new TWO_Dimension_Vector();
	
	Amazon_MarketPlace_Export_Main(){
		//Default constructor
		//Create required parameters and prep for creating listings
		//prep_vector_column_header();
		//Create a single array with the amazon headers
		//Information at this point is empty, only has the header info required for exportation
		//to a flat file.
		
		
		//Passed array with column headers, will not be able to accept information (as long as it follows the said system
		//The two D vector will NOT take care of the wrong information, or check integrity
		//Set-up, execution, integrity must be done in the respective marketplaces
		
	}
	
	void import_flat_file_data(String source_Location_of_Flat_File_STR) throws IOException{
		/*
		 * You will be passed a string of a location of a flat file
		 * You will 1st check the integrity of the flat file via header check
		 * Abort if something does not match, continue unabaited if passed
		 * You will then begin importing of said flat file into a 2D vector
		 * 
		 * Allow room for improvement and 'mark' the needed fields by # for future clarification
		 * IE, Nemix Part number is the '5' column, ergo take column 5 and extract info
		 *
		 */
		
		/*
		 * Steps taken here
		 * Create an Array with the required headers 1st
		 * After words create a two Dimension vector and place the Amazon flat file headers there
		 * AFTER creating this proper 2 Dimension vector, pass this preped 2 Dim vector
		 * and String address to the next step to start placing the information in the proper order
		 */
		
		System.out.println("Testing ne amazon file creation package here");
		Amazon_File_Creation_Main Amazon_File_Creation_Main_OBJECT = new Amazon_File_Creation_Main(source_Location_of_Flat_File_STR);
		//String[] amazon_headers_array = prep_vector_column_header();
		//Created an address to store and pointer to a String array
		//This array has the required amazon header information
		//Amazon_Marketplace_flat_file.create_header_coloumn(prep_vector_column_header());
		//prep_vector_column_header();
		//Prepped the header information
		//Place this in a sequence to add to the 2 Dimension vector
		
		
		
		System.out.println("I made it to the Amazon marketplace main export, calling further function import data into 2D vector");
		//import_nemix_standard_flat_file importing_data_into_2D_Vector = new import_nemix_standard_flat_file(source_Location_of_Flat_File_STR,Amazon_Marketplace_flat_file );
		
		System.out.println("For now comment out the above call in amazon marketplace export main");
		//Sending two things, a string address of a targeted Nemix standard flat file
		//That file will have information needed to create AMAZON listings
		//Must follow the template format for it to properly to work
		//The 2nd thing being passed is a 2 Dimension vector is empty EXCEPT with the required Amazon header
		//Pass the location of the flat file, and the 2Dim vector to being importing one at a time
		
		//importing_data_into_2D_Vector.create_Amazon_Flat_File();
		//Call the creation of the amazon flat file
		//Pass no parameters to it, use the static fields to pass info around
		
		
	}
	
	
	
	
	String[] prep_vector_column_header(){
		String[] AMZ_Col = new String[320];
		AMZ_Col[0] = "item_sku";
		AMZ_Col[1] = "external_product_id";
		AMZ_Col[2] = "external_product_id_type";
		AMZ_Col[3] = "item_name";
		AMZ_Col[4] = "brand_name";
		AMZ_Col[5] = "manufacturer";
		AMZ_Col[6] = "product_description";
		AMZ_Col[7] = "item_type";
		AMZ_Col[8] = "feed_product_type";
		AMZ_Col[9] = "part_number";
		AMZ_Col[10] = "model";
		AMZ_Col[11] = "update_delete";
		AMZ_Col[12] = "max_order_quantity";
		AMZ_Col[13] = "standard_price";
		AMZ_Col[14] = "list_price";
		AMZ_Col[15] = "currency";
		AMZ_Col[16] = "quantity";
		AMZ_Col[17] = "condition_type";
		AMZ_Col[18] = "condition_note";
		AMZ_Col[19] = "map_price";
		AMZ_Col[20] = "sale_price";
		AMZ_Col[21] = "sale_from_date";
		AMZ_Col[22] = "sale_end_date";
		AMZ_Col[23] = "rebate_name1";
		AMZ_Col[24] = "rebate_name2";
		AMZ_Col[25] = "rebate_start_at1";
		AMZ_Col[26] = "rebate_start_at2";
		AMZ_Col[27] = "rebate_end_at1";
		AMZ_Col[28] = "rebate_end_at2";
		AMZ_Col[29] = "rebate_description1";
		AMZ_Col[30] = "rebate_description2";
		AMZ_Col[31] = "product_tax_code";
		AMZ_Col[32] = "product_site_launch_date";
		AMZ_Col[33] = "merchant_release_date";
		AMZ_Col[34] = "fulfillment_latency";
		AMZ_Col[35] = "restock_date";
		AMZ_Col[36] = "max_aggregate_ship_quantity";
		AMZ_Col[37] = "offering_can_be_gift_messaged";
		AMZ_Col[38] = "offering_can_be_giftwrapped";
		AMZ_Col[39] = "is_discontinued_by_manufacturer";
		AMZ_Col[40] = "missing_keyset_reason";
		AMZ_Col[41] = "delivery_schedule_group_id";
		AMZ_Col[42] = "website_shipping_weight";
		AMZ_Col[43] = "website_shipping_weight_unit_of_measure";
		AMZ_Col[44] = "item_length";
		AMZ_Col[45] = "item_width";
		AMZ_Col[46] = "item_height";
		AMZ_Col[47] = "item_dimensions_unit_of_measure";
		AMZ_Col[48] = "item_weight";
		AMZ_Col[49] = "item_weight_unit_of_measure";
		AMZ_Col[50] = "bullet_point1";
		AMZ_Col[51] = "bullet_point2";
		AMZ_Col[52] = "bullet_point3";
		AMZ_Col[53] = "bullet_point4";
		AMZ_Col[54] = "bullet_point5";
		AMZ_Col[55] = "generic_keywords1";
		AMZ_Col[56] = "generic_keywords2";
		AMZ_Col[57] = "generic_keywords3";
		AMZ_Col[58] = "generic_keywords4";
		AMZ_Col[59] = "generic_keywords5";
		AMZ_Col[60] = "platinum_keywords1";
		AMZ_Col[61] = "platinum_keywords2";
		AMZ_Col[62] = "platinum_keywords3";
		AMZ_Col[63] = "platinum_keywords4";
		AMZ_Col[64] = "platinum_keywords5";
		AMZ_Col[65] = "main_image_url";
		AMZ_Col[66] = "other_image_url1";
		AMZ_Col[67] = "other_image_url2";
		AMZ_Col[68] = "other_image_url3";
		AMZ_Col[69] = "other_image_url4";
		AMZ_Col[70] = "other_image_url5";
		AMZ_Col[71] = "other_image_url6";
		AMZ_Col[72] = "other_image_url7";
		AMZ_Col[73] = "other_image_url8";
		AMZ_Col[74] = "fulfillment_center_id";
		AMZ_Col[75] = "package_height";
		AMZ_Col[76] = "package_width";
		AMZ_Col[77] = "package_length";
		AMZ_Col[78] = "package_dimensions_unit_of_measure";
		AMZ_Col[79] = "package_weight";
		AMZ_Col[80] = "package_weight_unit_of_measure";
		AMZ_Col[81] = "parent_sku";
		AMZ_Col[82] = "relationship_type";
		AMZ_Col[83] = "country_of_origin";
		AMZ_Col[84] = "legal_disclaimer_description";
		AMZ_Col[85] = "prop_65";
		AMZ_Col[86] = "safety_warning";
		AMZ_Col[87] = "cpsia_cautionary_statement1";
		AMZ_Col[88] = "cpsia_cautionary_statement2";
		AMZ_Col[89] = "cpsia_cautionary_statement3";
		AMZ_Col[90] = "cpsia_cautionary_statement4";
		AMZ_Col[91] = "cpsia_cautionary_description";
		AMZ_Col[92] = "antenna_description";
		AMZ_Col[93] = "antenna_type";
		AMZ_Col[94] = "recommended_uses_for_product";
		AMZ_Col[95] = "mounting_hole_diameter";
		AMZ_Col[96] = "includes_rechargable_battery";
		AMZ_Col[97] = "noise_attenuation";
		AMZ_Col[98] = "power_source_type";
		AMZ_Col[99] = "cable_length";
		AMZ_Col[100] = "special_features1";
		AMZ_Col[101] = "special_features2";
		AMZ_Col[102] = "number_of_batteries1";
		AMZ_Col[103] = "number_of_batteries2";
		AMZ_Col[104] = "number_of_batteries3";
		AMZ_Col[105] = "battery_type1";
		AMZ_Col[106] = "battery_type2";
		AMZ_Col[107] = "battery_type3";
		AMZ_Col[108] = "are_batteries_included";
		AMZ_Col[109] = "mfg_warranty_description_type";
		AMZ_Col[110] = "mfg_warranty_description_labor";
		AMZ_Col[111] = "seller_warranty_description";
		AMZ_Col[112] = "disc_holder_capacity";
		AMZ_Col[113] = "display_size";
		AMZ_Col[114] = "display_size_unit_of_measure";
		AMZ_Col[115] = "base_length";
		AMZ_Col[116] = "base_width";
		AMZ_Col[117] = "wireless_comm_standard";
		AMZ_Col[118] = "speaker_count";
		AMZ_Col[119] = "supported_internet_services1";
		AMZ_Col[120] = "supported_internet_services2";
		AMZ_Col[121] = "supported_internet_services3";
		AMZ_Col[122] = "supported_internet_services4";
		AMZ_Col[123] = "supported_internet_services5";
		AMZ_Col[124] = "output_wattage";
		AMZ_Col[125] = "_3d_technology";
		AMZ_Col[126] = "resolution_base";
		AMZ_Col[127] = "includes_remote";
		AMZ_Col[128] = "wireless_communication_technology1";
		AMZ_Col[129] = "wireless_communication_technology2";
		AMZ_Col[130] = "wireless_communication_technology3";
		AMZ_Col[131] = "display_dimensions";
		AMZ_Col[132] = "display_type";
		AMZ_Col[133] = "headphones_jack";
		AMZ_Col[134] = "total_ethernet_ports";
		AMZ_Col[135] = "total_coaxial_inputs";
		AMZ_Col[136] = "connector_type";
		AMZ_Col[137] = "total_vga_in_ports";
		AMZ_Col[138] = "s_video_connector_type";
		AMZ_Col[139] = "total_s_video_in_ports";
		AMZ_Col[140] = "total_composite_ports";
		AMZ_Col[141] = "total_component_in_ports";
		AMZ_Col[142] = "total_video_out_ports";
		AMZ_Col[143] = "total_hdmi_ports";
		AMZ_Col[144] = "optical_digital_input";
		AMZ_Col[145] = "total_subwoofer_outputs";
		AMZ_Col[146] = "calibration_description";
		AMZ_Col[147] = "total_preamp_outputs";
		AMZ_Col[148] = "front_inputs_description1";
		AMZ_Col[149] = "front_inputs_description2";
		AMZ_Col[150] = "front_inputs_description3";
		AMZ_Col[151] = "number_of_zones";
		AMZ_Col[152] = "off_state_passthrough";
		AMZ_Col[153] = "signal_conversion_supported";
		AMZ_Col[154] = "shielding_type";
		AMZ_Col[155] = "cooling_method";
		AMZ_Col[156] = "fan_count";
		AMZ_Col[157] = "computer_cpu_manufacturer";
		AMZ_Col[158] = "finish_type";
		AMZ_Col[159] = "frequency_response_curve";
		AMZ_Col[160] = "programmability";
		AMZ_Col[161] = "amplifier_connector_description";
		AMZ_Col[162] = "number_of_drivers";
		AMZ_Col[163] = "audio_output_effects";
		AMZ_Col[164] = "specification_met";
		AMZ_Col[165] = "network_interface_description";
		AMZ_Col[166] = "material_type";
		AMZ_Col[167] = "exterior_finish";
		AMZ_Col[168] = "item_shape";
		AMZ_Col[169] = "speaker_grille_description";
		AMZ_Col[170] = "speaker_grille_material_type";
		AMZ_Col[171] = "speaker_connectivity";
		AMZ_Col[172] = "tweeter_driver_diameter";
		AMZ_Col[173] = "midrange_driver_diameter_unit_of_measure";
		AMZ_Col[174] = "tweeter_driver_diameter_unit_of_measure";
		AMZ_Col[175] = "subwoofer_diameter_unit_of_measure";
		AMZ_Col[176] = "woofer_driver_diameter_unit_of_measure";
		AMZ_Col[177] = "tweeter_driver_technology";
		AMZ_Col[178] = "tweeter_driver_cone_material_type";
		AMZ_Col[179] = "midrange_driver_diameter";
		AMZ_Col[180] = "midrange_driver_cone_material_type";
		AMZ_Col[181] = "woofer_driver_cone_material_type";
		AMZ_Col[182] = "woofer_driver_diameter";
		AMZ_Col[183] = "subwoofer_amplifier_wattage";
		AMZ_Col[184] = "subwoofer_power_description";
		AMZ_Col[185] = "subwoofer_cone_material_type";
		AMZ_Col[186] = "subwoofer_diameter";
		AMZ_Col[187] = "included_features";
		AMZ_Col[188] = "speaker_maximum_input_power";
		AMZ_Col[189] = "vehicle_speaker_size";
		AMZ_Col[190] = "enclosure";
		AMZ_Col[191] = "supported_standards1";
		AMZ_Col[192] = "supported_standards2";
		AMZ_Col[193] = "supported_standards3";
		AMZ_Col[194] = "supported_standards4";
		AMZ_Col[195] = "supported_standards5";
		AMZ_Col[196] = "speaker_type";
		AMZ_Col[197] = "media_type_base1";
		AMZ_Col[198] = "media_type_base2";
		AMZ_Col[199] = "media_type_base3";
		AMZ_Col[200] = "media_type_base4";
		AMZ_Col[201] = "media_type_base5";
		AMZ_Col[202] = "international_protection_rating";
		AMZ_Col[203] = "cable_length_unit_of_measure";
		AMZ_Col[204] = "operating_system";
		AMZ_Col[205] = "hardware_platform";
		AMZ_Col[206] = "connectivity_technology";
		AMZ_Col[207] = "hard_disk_size";
		AMZ_Col[208] = "hard_disk_size_unit_of_measure";
		AMZ_Col[209] = "software_included";
		AMZ_Col[210] = "memory_slots_available";
		AMZ_Col[211] = "computer_memory_size";
		AMZ_Col[212] = "computer_memory_size_unit_of_measure";
		AMZ_Col[213] = "computer_cpu_speed";
		AMZ_Col[214] = "computer_cpu_speed_unit_of_measure";
		AMZ_Col[215] = "computer_cpu_type";
		AMZ_Col[216] = "rom_size";
		AMZ_Col[217] = "rom_size_unit_of_measure";
		AMZ_Col[218] = "has_color_screen";
		AMZ_Col[219] = "native_resolution";
		AMZ_Col[220] = "supported_devices_quantity";
		AMZ_Col[221] = "human_interface_input1";
		AMZ_Col[222] = "human_interface_input2";
		AMZ_Col[223] = "human_interface_input3";
		AMZ_Col[224] = "camera_description1";
		AMZ_Col[225] = "camera_description2";
		AMZ_Col[226] = "camera_description3";
		AMZ_Col[227] = "efficiency";
		AMZ_Col[228] = "audio_encoding";
		AMZ_Col[229] = "audio_encoding_language";
		AMZ_Col[230] = "video_encoding";
		AMZ_Col[231] = "water_resistance_level";
		AMZ_Col[232] = "water_resistance_depth";
		AMZ_Col[233] = "tuner_technology";
		AMZ_Col[234] = "battery_cell_composition";
		AMZ_Col[235] = "battery_average_life";
		AMZ_Col[236] = "battery_average_life_unit_of_measure";
		AMZ_Col[237] = "battery_average_life_recharge";
		AMZ_Col[238] = "lithium_battery_energy_content";
		AMZ_Col[239] = "lithium_battery_packaging";
		AMZ_Col[240] = "lithium_battery_voltage";
		AMZ_Col[241] = "screen_surface_description";
		AMZ_Col[242] = "image_contrast_ratio";
		AMZ_Col[243] = "universal_remote_code";
		AMZ_Col[244] = "mounting_hole_type";
		AMZ_Col[245] = "parental_control_technology";
		AMZ_Col[246] = "minimum_horizontal_refresh_rate";
		AMZ_Col[247] = "maximum_horizontal_refresh_rate";
		AMZ_Col[248] = "minimum_vertical_refresh_rate";
		AMZ_Col[249] = "maximum_vertical_refresh_rate";
		AMZ_Col[250] = "noise_level";
		AMZ_Col[251] = "included_components1";
		AMZ_Col[252] = "included_components2";
		AMZ_Col[253] = "included_components3";
		AMZ_Col[254] = "image_brightness";
		AMZ_Col[255] = "image_brightness_unit_of_measure";
		AMZ_Col[256] = "input_device_interface1";
		AMZ_Col[257] = "input_device_interface2";
		AMZ_Col[258] = "input_device_interface3";
		AMZ_Col[259] = "input_device_interface4";
		AMZ_Col[260] = "input_device_interface5";
		AMZ_Col[261] = "telephone_type";
		AMZ_Col[262] = "fit_type";
		AMZ_Col[263] = "headphones_form_factor";
		AMZ_Col[264] = "cable_feature";
		AMZ_Col[265] = "built_in_decoders1";
		AMZ_Col[266] = "built_in_decoders2";
		AMZ_Col[267] = "built_in_decoders3";
		AMZ_Col[268] = "built_in_decoders4";
		AMZ_Col[269] = "built_in_decoders5";
		AMZ_Col[270] = "impedance";
		AMZ_Col[271] = "impedance_unit_of_measure";
		AMZ_Col[272] = "control_type";
		AMZ_Col[273] = "audio_sensitivity";
		AMZ_Col[274] = "microphone_form_factor";
		AMZ_Col[275] = "microphone_technology";
		AMZ_Col[276] = "minimum_compatible_size";
		AMZ_Col[277] = "maximum_compatible_size";
		AMZ_Col[278] = "mounting_type";
		AMZ_Col[279] = "pattern_name";
		AMZ_Col[280] = "mounting_hole_diameter_unit_of_measure";
		AMZ_Col[281] = "connector_gender1";
		AMZ_Col[282] = "connector_gender2";
		AMZ_Col[283] = "map_type1";
		AMZ_Col[284] = "map_type2";
		AMZ_Col[285] = "map_type3";
		AMZ_Col[286] = "subscription_term_name";
		AMZ_Col[287] = "traffic_features_description1";
		AMZ_Col[288] = "traffic_features_description2";
		AMZ_Col[289] = "traffic_features_description3";
		AMZ_Col[290] = "gps_navigation";
		AMZ_Col[291] = "digital_audio_capacity";
		AMZ_Col[292] = "maximum_weight_recommendation";
		AMZ_Col[293] = "write_speed";
		AMZ_Col[294] = "media_structure_layers";
		AMZ_Col[295] = "data_transfer_rate";
		AMZ_Col[296] = "data_transfer_rate_unit_of_measure";
		AMZ_Col[297] = "controller_type";
		AMZ_Col[298] = "surround_sound_channel_configuration";
		AMZ_Col[299] = "total_power_outlets";
		AMZ_Col[300] = "maximum_surge_rating";
		AMZ_Col[301] = "maximum_surge_rating_unit_of_measure";
		AMZ_Col[302] = "light_source_wattage";
		AMZ_Col[303] = "light_source_operating_life";
		AMZ_Col[304] = "optimal_image_size";
		AMZ_Col[305] = "minimum_image_size";
		AMZ_Col[306] = "maximum_image_size";
		AMZ_Col[307] = "minimum_throw_distance";
		AMZ_Col[308] = "maximum_throw_distance";
		AMZ_Col[309] = "min_focal_length";
		AMZ_Col[310] = "maximum_effective_throw_ratio";
		AMZ_Col[311] = "zoom_ratio";
		AMZ_Col[312] = "zoom_type";
		AMZ_Col[313] = "aspect_ratio";
		AMZ_Col[314] = "vertical_keystone_correction";
		AMZ_Col[315] = "horizontal_keystone_correction";
		AMZ_Col[316] = "focal_length_description";
		AMZ_Col[317] = "trigger_voltage";
		AMZ_Col[318] = "projection_method";
		AMZ_Col[319] = "mfg_warranty_description_parts";

		return AMZ_Col;
	}

	
}
