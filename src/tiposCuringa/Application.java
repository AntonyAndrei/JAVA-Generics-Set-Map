package tiposCuringa;

import java.util.List;
import java.util.Arrays;


public class Application {

	public static void main(String[] args) {

		List<Integer> MyInts = Arrays.asList(5, 2, 10);
		printList(MyInts);
		
		List<String> MyStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(MyStrs);
		
	}

	public static void printList(List<?> list) {
		// list.add(3); <-- Em tipos curinga voce não pode adicionar na ArrayList pelo metodo add.();
		for (Object obj : list ) {
			System.out.println(obj);
		}	
		
	}

}