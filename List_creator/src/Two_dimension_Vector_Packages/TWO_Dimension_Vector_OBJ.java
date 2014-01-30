package Two_dimension_Vector_Packages;
import java.util.Iterator;
import java.util.Vector;


public class TWO_Dimension_Vector_OBJ {
	/*
	 * To finish creating my two 2dim vectors, I must wrap this vector in an object class
	 * 
	 */
	
	Vector <String> my_ROWS_Vector;// = new Vector <String>();
	
	public TWO_Dimension_Vector_OBJ(){
		my_ROWS_Vector = new Vector <String>();
	}
	
	
	public void add(String source)				{	my_ROWS_Vector.add(source);			}
	//Adding stuff to the object vector
	
	Iterator<String> return_Iterator()	{	return my_ROWS_Vector.iterator();	}
	//Returning the iterator
	
	int return_size()					{	return my_ROWS_Vector.size();		}


	public boolean is_this_empty(){		return my_ROWS_Vector.isEmpty();	}
	
	public void Print_to_Screen_All_data() {
		// TODO Auto-generated method stub
		Iterator row_Iterator = my_ROWS_Vector.iterator();
		while(row_Iterator.hasNext()){
			System.out.println(row_Iterator.next().toString());
		};

		
	}
		
	

}
