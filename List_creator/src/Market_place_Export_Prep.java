import java.io.IOException;


public class Market_place_Export_Prep {
	/*
	 * Goal here, you will receive two things, a string, and an int number choice.
	 * With these two things you will import a flat csv file (location is created by another function)
	 * Import the flat file, then using the int, choose the marketplace being created
	 */

	
	Market_place_Export_Prep(){}
	//Do nothing constructor

	public Market_place_Export_Prep(String Source_Location,	int Source_choice_INT) throws IOException {
		// TODO Auto-generated constructor stub
		/*
		 * Successful accomplishment, continue with exportation methods
		 * 1 = Amazon
		 * 2 = buy.com
		 * 3 = eBay
		 * 4 = Amazon EU
		 * 5 = whatever you want to expand
		 */
		
		
        switch(Source_choice_INT){
        case 1:
            Amazon_MarketPlace_Export_Main temp_AMZ_Export = new Amazon_MarketPlace_Export_Main();
            temp_AMZ_Export.import_flat_file_data(Source_Location);
            /*
             * Next step in creating a MarketPlace flat file
             * In this switch statement create an amazon export method(s)
             * Pass only a sting address, create needed 2Dim objects there
             * as well as anything else needed to create a functioning flat file
             * Pass only the address, all other work must be done there as well
             */
            
            break;
        case 2:

        	
        }
	}
	
	
	
	
}
