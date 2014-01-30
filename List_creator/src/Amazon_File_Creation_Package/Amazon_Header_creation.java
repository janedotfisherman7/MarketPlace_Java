package Amazon_File_Creation_Package;

import Two_dimension_Vector_Packages.TWO_Dimension_Vector;
import Two_dimension_Vector_Packages.TWO_Dimension_Vector_OBJ;

public class Amazon_Header_creation {
	/*
	 * Create the required header information here
	 */
	
	String[] header_09_29_2013;
	Amazon_Header_creation(){
		//Do nothing constructor
		
	}
	
	//Delete me if needed
	String[] Amazon_Header_creation_create_header_ARRAY(){
		header_09_29_2013 = prep_header();
		/*
		 * String array now has all the needed header
		 */
		
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");
		System.out.println("DO not delete the Amaon header creation create header array yet!!!!!!!!!!!!");
		System.out.println("It's being called here?");
		return header_09_29_2013;
	}
	
	public void Populate_Amazon_header_info(TWO_Dimension_Vector Source_2_Dimesnion_vector){
		/*
		 * This function will now create a String Array, that has the Amazon flat File headers 
		 * It will create a 2D Vector OBJECT, with this series
		 * THEN put these said String Array into said 2D vector Object
		 * Then Add it to the 2D vector stack
		 */
		
		String[] Amazon_headers = prep_header();
		/*
		 * String Array has header
		 * Bypassed a function, see if I can delete it????
		 */
		
		TWO_Dimension_Vector_OBJ amzon_temp_2D_Vector_OBJECT = Source_2_Dimesnion_vector.return_a_new_two_Dim_Vectr_Object();
		//amzon_temp_2D_Vector_OBJECT.add(source);
		for (int i = 0; i<Amazon_headers.length; i++ ){
			//This is a for loop to add header into 2D vector OBJECT
			//Process verified works fine
			amzon_temp_2D_Vector_OBJECT.add(Amazon_headers[i]);
			//System.out.println(" I have just added = " + Amazon_headers[i]);
			
		}
		
		Source_2_Dimesnion_vector.add_to_Main_Vector_Stack(amzon_temp_2D_Vector_OBJECT);
		//Process verified works fine
		
	}


	private String[] prep_header() {
		// TODO Auto-generated method stub
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
