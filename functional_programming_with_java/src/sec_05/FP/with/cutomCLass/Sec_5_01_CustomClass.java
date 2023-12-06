package sec_05.FP.with.cutomCLass;

import java.util.List;
import java.util.function.Predicate;

class Course {
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the reviewScore
	 */
	public int getReviewScore() {
		return reviewScore;
	}

	/**
	 * @param reviewScore the reviewScore to set
	 */
	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}

	/**
	 * @return the noOfStudents
	 */
	public int getNoOfStudents() {
		return noOfStudents;
	}

	/**
	 * @param noOfStudents the noOfStudents to set
	 */
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	public Course(String name, String category, int reviewScore, int noOfStudents) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", category=" + category + ", reviewScore=" + reviewScore + ", noOfStudents="
				+ noOfStudents + "]";
	}

}

public class Sec_5_01_CustomClass {

	public static void main(String[] args) {

		List<Course> courses = List.of(new Course("Spring", "Framework", 98, 20000),
				new Course("Spring Boot", "Framework", 95, 18000), new Course("API", "MicroServices", 97, 22000),
				new Course("MicroServices", "MicroServices", 96, 25000),
				new Course("FullStack", "FullSTack", 91, 21000), new Course("AWS", "Cloud", 92, 19000),
				new Course("Azure", "Cloud", 91, 20000), new Course("Docker", "Cloud", 93, 20000),
				new Course("Kubernates", "Cloud", 94, 20000));

		// allMatch, noneMatch, anyMatch
		Predicate<Course> reviewScoreGreterThan95predicate = course -> course.getReviewScore() > 95;
		
		Predicate<Course> reviewScorelessThan90predicate = course -> course.getReviewScore() < 90;

		System.out.println(courses.stream().allMatch(reviewScoreGreterThan95predicate));
		
		System.out.println(courses.stream().noneMatch(reviewScorelessThan90predicate));
		
		System.out.println(courses.stream().anyMatch(reviewScoreGreterThan95predicate));

		
	}

}
