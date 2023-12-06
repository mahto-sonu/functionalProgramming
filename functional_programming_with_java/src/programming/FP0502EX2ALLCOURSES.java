package programming;

import java.util.List;

public class FP0502EX2ALLCOURSES {

	public static void main(String[] args) {
		
		List<String> courses = List.of("Spring","Spring Boot","API","MicroServices","AWS","PCP","Azure","Docker","Kubernate");
		 printAllCourses(courses);

	}

	private static void printAllCourses(List<String> courses) {
		
		//Print all courses
//		courses.stream()
//			.forEach(System.out::println);
		
		// print courses containing the word "Spring"
//		courses.stream()
//			.filter(course -> course.contains("Spring"))
//			.forEach(System.out::println);
		
		//Print Courses whose name has atleast 4 letters
		courses.stream()
			.filter(course -> course.length() >=4)
			.forEach(System.out::println);
		
	}

}
