package programming;

import java.util.List;

public class FP0601SquaresOfNumbers {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,5,13,89,2,0,1,58,45,7);
		List<String> courses = List.of("Spring","Spring Boot","API","MicroServices","AWS","PCP","Azure","Docker","Kubernate");

		//printSquareOfAllNumbers(numbers);
		
		printNoOfCharacterinCousres(courses);

	}

	private static void printNoOfCharacterinCousres(List<String> courses) {
		
		courses.stream()
			.map(course -> course+" "+ course.length())
			.forEach(System.out::println);
		
	}

	private static void printSquareOfAllNumbers(List<Integer> numbers) {
		
		//Squares of numbers
//		numbers.stream()
//			.map(number -> number*number)
//			.forEach(System.out::println);
		
		//Cubes of Numbers
		numbers.stream()
			.map(number -> Math.pow(number, 3))
			.forEach(System.out::println);
			
		
	}

}
