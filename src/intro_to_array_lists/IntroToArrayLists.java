package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		
		ArrayList<String> examples = new ArrayList<String>();
		
		//2. Add five Strings to your list
		
		examples.add("annie");
		examples.add("bob");
		examples.add("carl");
		examples.add("diego");
		examples.add("edward");
		
		//3. Print all the Strings using a standard for-loop
		
		for(int i = 0; i < examples.size(); i++) {
			System.out.println(examples.get(i));
		}
		
		System.out.println("\n");
		
		//4. Print all the Strings using a for-each loop
		
		for(String s : examples){
			System.out.println(s);
		}
		
		System.out.println("\n");
		
		//5. Print only the even numbered elements in the list.
		
		for(int i = 0; i < examples.size(); i++) {
			if(i % 2 == 0) {
				System.out.println(examples.get(i));
			}
		}
		
		System.out.println("\n");
		
		//6. Print all the Strings in reverse order.
		
		for(int i = examples.size() - 1; i >= 0; i--){
			  System.out.println(examples.get(i));
			}
		
		System.out.println("\n");
		
		//7. Print only the Strings that have the letter 'e' in them.
		
		for( String example : examples) {
			if(example.contains("e")) {
				System.out.println(example);
			}
		}
	}
}
