package programming;

import java.util.List;

public class FP03Functional {

	public static void main(String[] args) {
		
		//Print All Numbers in List Functional
		
		printAllNumbersInListFunctional(List.of(12,9,13,4,6,2,4,12,15));

	}
	
	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		
		//1.What to do ?Ans: Convert list to stream
		numbers.stream()
			.forEach(System.out::println);//Method Reference
	}

}
