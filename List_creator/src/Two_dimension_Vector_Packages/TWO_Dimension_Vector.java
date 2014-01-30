package Two_dimension_Vector_Packages;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;



public class TWO_Dimension_Vector {
	/*
	 * Created your own class of a 2D vector, nice what a slacker you are.....
	 * How this should work? You will have to pass the correct number of strings
	 * to represent the number of columns.
	 * the initial part will have to contain the marketplace default values
	 * then the proceeding vectors will be created dynamically, and then added
	 */
	
	
	Vector <TWO_Dimension_Vector_OBJ> my_ROWS_Vector = new Vector <TWO_Dimension_Vector_OBJ>();
	/*
	 * Unlimited amount off space to add new arrays into
	 */
	
	public String[] return_header(){
		String[] returning_String_array = {"empty"};
		//Create an empty array
		//Test to make sure 2D vector is not empty
		if(my_ROWS_Vector.isEmpty()){
			System.out.println("The main Vector stack is empty");
			return returning_String_array;
			
		}
		
		TWO_Dimension_Vector_OBJ very_top_object = my_ROWS_Vector.firstElement();
		//Copy the 1st element here, you tested if have one all ready
		//Tested, it is not empty
		
		if(very_top_object.is_this_empty()){
			
			System.out.println("The 1st Vector is empty, no data?");
			return returning_String_array;
		}
		//Tested to see if the top vector has information in it
		//If here, then there is data and it is ASSUMED that this is header info
		
		Iterator<String> intenal_iterator = very_top_object.return_Iterator();
		returning_String_array = new String[very_top_object.return_size()];
		//Created an iterator to go through the header of a vector
		//Set the size of the String array to return, now populate it!
		
		//System.out.println("Inside the two Dim Vector print header function for loop, test each item here = ");
		for(int i = 0; i <very_top_object.return_size(); i++){
			
			returning_String_array[i] = intenal_iterator.next();
			//System.out.println("Just added this here = " + returning_String_array[i]);
			//Copy one at a time into the String array
			//Copied from the very top vector, NOT main Stack
		}
		
		//System.out.println("I Have finsihed adding stuff to the header, now returning everything");
		
		return returning_String_array;
	}

	public TWO_Dimension_Vector_OBJ return_a_new_two_Dim_Vectr_Object(){
		
		TWO_Dimension_Vector_OBJ a_new_2_Dimension_vector_Object = new TWO_Dimension_Vector_OBJ();
		return a_new_2_Dimension_vector_Object;
	}


	public void create_header_coloumn(String[] SourceArray_STR) {
		// TODO Auto-generated method stub
		/*
		 * In here we have our marketplace header Please take the time to create and follow
		 * the format of the desired marketplace
		 */
		TWO_Dimension_Vector_OBJ temp_Vecotr_OBJ = new TWO_Dimension_Vector_OBJ();

		String temp = "nah nah batman";
		for(int i = 0 ; i < SourceArray_STR.length; i++){
			temp = SourceArray_STR[i];
			temp_Vecotr_OBJ.add(temp);
			
		}
		

		my_ROWS_Vector.add(temp_Vecotr_OBJ);
		//Here you just added the 'object' that happens to function as an array
	
	}
	
	public void add_to_Main_Vector_Stack(TWO_Dimension_Vector_OBJ Source_VECTOR_OBJ){
		
		my_ROWS_Vector.add(Source_VECTOR_OBJ);
		//System.out.println("This Vector object has been succesfully added!, attempt to print????");
		//Source_VECTOR_OBJ.Print_to_Screen_All_data();
		
	}

	public void Print_to_Screen_All_data() {
		// TODO Auto-generated method stub
		
		//System.out.println("Can you see this 2 Dim Vecotr");
		Iterator main_Stack_Iterator = my_ROWS_Vector.iterator();
		//TWO_Dimension_Vector_OBJ temp_OBJ = new TWO_Dimension_Vector_OBJ();
		TWO_Dimension_Vector_OBJ temp_2D_OBJECT;
		//System.out.println(" inside the main stack vecotr, see this once per ROW!!!!!");
		while(main_Stack_Iterator.hasNext()){
			temp_2D_OBJECT = (TWO_Dimension_Vector_OBJ) main_Stack_Iterator.next();

//			temp_OBJ = (TWO_Dimension_Vector_OBJ) main_Stack_Iterator.next();
			//System.out.println(" call before calling for each coloum inside 2D OBJECT");
			temp_2D_OBJECT.Print_to_Screen_All_data();
	
			
		}
				   
		  }
		
		
	
	

}
