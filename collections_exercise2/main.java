package collections_exercise2;



/**
 * @author ccheibas
 * Implement your own List data structure, 
 * which will allow to access and remove objects (String type). 
 * It has to contain the following methods: 
 * public void add(String element) and public String get(int i).
 */


public class main {

	public static void main(String[] args) {
		list test_obj = new list(); //creates the LIST object
		test_obj.add("add#0");
		test_obj.add("add#1");
		test_obj.add("add#2");
		test_obj.add("add#3");
		test_obj.add("add#4"); 
		test_obj.add("add#5"); 
		test_obj.add("add#6");
		test_obj.add("add#7");
		test_obj.remove(1);
		test_obj.remove(4);
		test_obj.remove(0);

		System.out.println(test_obj); //printing the list
	}
}

