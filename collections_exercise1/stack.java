package collections_exercise1;

/** The class responsible for the stack's operations
 * @author ccheibas
 * consists of the stack itself as a private variable with a getter.
 * as well as two methods to push and pop elements. LIFO means the last one in the first one out.
 */
public class stack {
	
	private String[] stack_array = new String[0];
	
	public void push(String element){ //last in - will extend the array one more cell and add the element to it to position 0
		int new_size = stack_array.length+1; 
		String [] temp_array = this.stack_array; //dummy variable used for dynamic memory allocation
		this.stack_array = new String[new_size];
		stack_array[0]=element;
		System.arraycopy(temp_array, 0, stack_array, 1, new_size-1); //copies the array starting from temp[0] to stack_array[1]
	}
	
	public void pop(){//first out - will remove the element in position 0 and allocate space for the now smaller array
		int new_size = stack_array.length-1;
		String [] temp_array = this.stack_array;
		this.stack_array = new String[new_size];
		System.arraycopy(temp_array, 1, stack_array, 0, new_size); //copies the array starting from temp[1] to stack_array[0]
	}
	
	public String[] getstack(){
		return this.stack_array;
	}
}
