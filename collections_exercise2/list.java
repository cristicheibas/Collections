package collections_exercise2;

/** List Manipulation functions
 * @author ccheibas
 * first stands for the first element, last for the last one
 * the size is used to know the general weight of the object
 * and make sure the user doesn't try to remove an non-existing object
 */


public class list{
	private Node first;
	private Node last;
	private int size = 0;

	private class Node{ // Defining a list Node as a class
		String str ;
		Node next ;
	}

	public boolean isEmpty (){
		return first == null;  //checks if the list is empty
	}

	/** Adds an element to the List 
	 * @author ccheibas
	 * Links the new element to the last Node, 
	 * increases the size and saves the String in the Node
	 */
	
	public void add ( String element ) 
	{
		Node x = new Node ();
		x. str = element ;
		x. next = null ;
		size++;
		if (isEmpty()){ 
			first = x; 
			last = x;		//if the queue is empty nullify it
		}
		else{
			last.next = x;
			last = x; 
		}		// else add the element to the last position
	}

	/**Function used to remove the n-th element of the list.
	 * @author ccheibas
	 * In order to be able to remove an element from a list we need to have a placeholder for the previous one.
	 * Namely previous and current, which are used as variables below.
	 */
	
	public void remove (int position){
		if ((isEmpty())||(position >= size)) 
			return;//if the queue is empty |OR| the number is greater than the size do nothing
		if (position == 0) {
			first=first.next; //if we want to remove the first element this will save us from NullPointerException
			return;
		}
		size--; //the size gets smaller once we remove an element
		Node previous = null;//previous element of the iterative base - current
		Node current = first;//will help us iterate through the list without damaging anything
		for (int i=0;i<position;i++){
			previous = current;
			current = current.next; //elements take the next elements place until we get to the required position in the list
		}
		previous.next = current.next; //the only reason we needed previous for, to be able to remove the link between Nodes once we are done iterating.
	}

	/** Function used to print the list
	 * @author ccheibas
	 * Didn't want to add a ton of getters and setters and create more spagetti code
	 * So i decided to add a method for printing the entire List
	 */

	public String toString(){
		String output ="";
		if(isEmpty()) 
			return "I am printing an empty list";
		Node temp = first;//wouldn't want to ruin the entire list if this is called in the middle of the program
		while(temp.next!=null){ //as long as the next element exists we add its' content to the overall string
			output += temp.str+"\n";
			temp = temp.next;  //eventually we will run out of Nodes and the loop will break.
		}
		output+=last.str; //add the last piece since its' out of the loop
		return output;
	}
}
