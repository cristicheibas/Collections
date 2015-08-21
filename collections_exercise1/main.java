package collections_exercise1;



/**
 * @author ccheibas
 * Implement your own stack data structure (LIFO) of strings. 
 * It has to contain the following methods: 
 * public void push(String element) and public String pop().
 */


public class main {

	public static void main(String[] args) {
		stack test_obj = new stack(); //creates the stack object
		test_obj.push("Push#1");
		test_obj.push("Push#2");
		test_obj.push("Push#3");
		test_obj.pop();
		test_obj.push("Push#4"); 
		test_obj.push("Push#5");   //playing around with the array for testing purposes
		test_obj.pop();
		test_obj.push("Push#6");
		test_obj.push("Push#7");
		test_obj.pop();
		test_obj.push("Push#8");
		test_obj.push("Push#9");
		test_obj.push("Push#10");
		test_obj.pop();
		test_obj.pop();
		for(int i=0;i<test_obj.getstack().length;i++)
		System.out.println(test_obj.getstack()[i]); //printing what's left of the array
	}
}

