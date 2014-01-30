import java.util.Scanner;


public class main {

    public static void main(String[] args)  {
        
    	navigate_java my_navigate = new navigate_java();
        Create_Marketplace_Flat_Files my_Market_Marketplace = new Create_Marketplace_Flat_Files();
        /*
         * Above stuff is required when by passing that if loop
         * Set testing to true to find and copy testing url
         */
    	
    	boolean testing_to_direct_ama = true;
    	
    	
    	
    	if(testing_to_direct_ama){
    		String testing_to_direct_amz = "C:\\Users\\Ghost\\Documents\\test.csv";
    		String[] temp_Location_flat_file = new String[1];
        	temp_Location_flat_file[0] = testing_to_direct_amz;
        	
    		System.out.println("bypass initial set-up steps");
    		start_exporting_to_Marketplace(temp_Location_flat_file,my_Market_Marketplace);
    		
    	}
    	else{
    		String user_Input = "";
            Scanner scan = new Scanner(System.in);
            String[] path_abs_inside_main_loop = new String[1];//"abs path";
            
            
            System.out.println("This section deals with only creating listings");
            System.out.println("1: View Data");		//View data available (unimplemented)
            System.out.println("2: Locate flat file Data");	//Navigate options, add option to export template
            System.out.println("3: Create new listings");	//export???
             
            while(true){
        
            user_Input = scan.nextLine();
            Integer user_input_int = Integer.parseInt(user_Input);// = user_Input.
            

            switch(user_input_int){
            case 1:
                //If your here give an more options to view more data
                //Start making the query section to the MVC and find what has been activated?
                
                break;
            case 2:
            	start_the_list_creator_part(path_abs_inside_main_loop,my_navigate);
            	/*
            	 * Be aware of this, new thread is created. Program will continue to run, but
            	 * execution here is successful, and now the Array
            	 * path_abs_inside_main_loop[0] holds the string location of said import file
            	 */
            	break;
            case 3:
            	/*
            	 * Work around needed to send location
            	 * Remember the thread makes it on the fly value, have to transfer value each time...
            	 */
            	String[] temp_Location_flat_file = new String[1];
            	temp_Location_flat_file[0] = my_navigate.return_path_STR();
            	start_exporting_to_Marketplace(temp_Location_flat_file,my_Market_Marketplace);
            	
                break;
                
            default:
                break;
            }
            
            if(user_Input.contentEquals("Quit")){
                break;    
            }
            else{
                System.out.println(user_Input);
            }
	
    	}
                
    }
    }

	private static void start_exporting_to_Marketplace(String[] SourceSTR,Create_Marketplace_Flat_Files SoureMarket_Files) {
		// TODO Auto-generated method stub
		/*
		 * Begin process of creating Market Place flat files
		 * Pass two things, a String address of a targeted flat file
		 * a marketplace create object which will give you options to
		 * export to desired marketplace 
		 */


		SoureMarket_Files.my_Marketplace_Flat_Files(SourceSTR);
	}

	private static void start_the_list_creator_part(String[] SourceSTR, navigate_java SourceNavigate) {
		// TODO Auto-generated method stub
		
		SourceNavigate.my_navigate(SourceSTR);

	}
}
