package collections_exercise1;

/**
 * Implement your own stack data structure (LIFO) of strings. 
 * It has to contain the following methods: 
 * public void push(String element) and public String pop().
 * @author ccheibas
 */

public class Main {

	public static void main(String[] args) {
		Stack stacky = new Stack(); //creates the stack object
		stacky.push("Push#1");
		stacky.push("Push#2");
		stacky.push("Push#3");
		stacky.pop();
		stacky.push("Push#4"); 
		stacky.push("Push#5");   
		//playing around with the array for testing purposes
		stacky.pop();
		stacky.push("Push#6");
		stacky.push("Push#7");
		stacky.pop();
		stacky.push("Push#8");
		stacky.push("Push#9");
		stacky.push("Push#10");
		stacky.pop();
		stacky.pop();

		for(int i = 0; i < stacky.getstack().length; i++) {
			//printing what's left of the array
			System.out.println(stacky.getstack()[i]);	
		}
	}
}

