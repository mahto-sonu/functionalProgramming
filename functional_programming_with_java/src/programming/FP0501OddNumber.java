package programming;

import java.util.List;

public class FP0501OddNumber {

	public static void main(String[] args) {
		
		List<Integer> number = List.of(12,5,13,89,2,0,1,58,45,7);
		
		PrintAllOddNumberUsingFP(number);
	}

	private static void PrintAllOddNumberUsingFP(List<Integer> numbers) {
		
		numbers.stream()
			.filter(number -> number%2 ==1)
			.forEach(System.out::println);
		
	}

}
