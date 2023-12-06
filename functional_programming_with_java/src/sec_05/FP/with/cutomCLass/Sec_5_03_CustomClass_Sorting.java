package sec_05.FP.with.cutomCLass;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class CourseSorting {
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
	@Override
	public int hashCode() {
		return Objects.hash(category, name, noOfStudents, reviewScore);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CourseSorting other = (CourseSorting) obj;
		return Objects.equals(category, other.category) && Objects.equals(name, other.name)
				&& noOfStudents == other.noOfStudents && reviewScore == other.reviewScore;
	}
	public CourseSorting(String name, String category, int reviewScore, int noOfStudents) {
		super();
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}
	@Override
	public String toString() {
		return "CourseSorting [name=" + name + ", category=" + category + ", reviewScore=" + reviewScore
				+ ", noOfStudents=" + noOfStudents + "]";
	}

	

}

public class Sec_5_03_CustomClass_Sorting {

	public static void main(String[] args) {

		List<CourseSorting> courses = List.of(new CourseSorting("Spring", "Framework", 98, 20000),
				new CourseSorting("Spring Boot", "Framework", 95, 18000), 
				new CourseSorting("API", "MicroServices", 97, 22000),
				new CourseSorting("MicroServices", "MicroServices", 96, 25000),
				new CourseSorting("FullStack", "FullSTack", 91, 21000), 
				new CourseSorting("AWS", "Cloud", 92, 19000),
				new CourseSorting("Azure", "Cloud", 91, 20000), 
				new CourseSorting("Docker", "Cloud", 93, 20000),
				new CourseSorting("Kubernates", "Cloud", 94, 20000));
		//Ascending
		Comparator<CourseSorting> comparingByNoOfStudents  = Comparator.comparing(CourseSorting::getNoOfStudents);
		//Descending
		Comparator<CourseSorting> comparingByNoOfStudentsDecresing  = Comparator.comparing(CourseSorting::getNoOfStudents).reversed();
		
		Comparator<CourseSorting> comparingByNoOfStudentsAndNoOfReviews  = Comparator.comparing(CourseSorting::getNoOfStudents).thenComparing(CourseSorting::getNoOfStudents);

		System.out.println(courses.stream().sorted(comparingByNoOfStudentsAndNoOfReviews).collect(Collectors.toList()));
		
	}

}
