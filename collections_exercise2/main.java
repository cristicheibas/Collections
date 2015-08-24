package collections_exercise2;



/**
 * Implement your own List data structure,
 * which will allow to access and remove objects (String type).
 * It has to contain the following methods:
 * public void add(String element) and public String get(int i).
 * @author ccheibas
 */


public class Main {

	public static void main(String[] args) {
		List listy = new List(); //creates the LIST object
		listy.add("add#0");
		listy.add("add#1");
		listy.add("add#2");
		listy.add("add#3");
		listy.add("add#4");
		listy.add("add#5");
		listy.add("add#6");
		listy.add("add#7");
		listy.remove(1);
		listy.remove(4);
		listy.remove(0);

		System.out.println(listy); //printing the list
	}
}

