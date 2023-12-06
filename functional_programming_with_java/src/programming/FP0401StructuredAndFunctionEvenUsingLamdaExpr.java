package programming;

import java.util.List;

public class FP0401StructuredAndFunctionEvenUsingLamdaExpr {

	public static void main(String[] args) {
		
		//Print All Numbers in List Structure
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		//printAllEvenNumbersInListStructured(numbers);
		printAllEvenNumbersInListFunctional(numbers);
	}
	
//	private static boolean isEven(int number) {
//		return number%2 ==0;
//	}
//	private static void printAllEvenNumbersInListStructured(List<Integer> numbers) {
//		
//		//How to loop the numbers?
//		for(int number:numbers) {
//			if(number %2 == 0)
//			System.out.println(number);
//		}
//	}
	
	private static void printAllEvenNumbersInListFunctional(List<Integer> numbers) {
		
		//1.What to do ?Ans: Convert list to stream
		numbers.stream()
			//.filter(FP0401StructuredAndFunctionEven::isEven) //Filter -only Allow Even Number
			.filter(number -> number%2 ==0) //Lamda Expresion
			.forEach(System.out::println);//Method Reference
	}

}
