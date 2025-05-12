import java.util.*;

class Student implements Comparable<Student> {
	String name;
	double cgpa;

	public Student(String name, double cgpa) {
		this.name = name;
		this.cgpa = cgpa;
	}

	// Comparable implementation: sort by CGPA in descending order
	@Override
	public int compareTo(Student other) {
		if (this.cgpa == other.cgpa)
			return this.name.compareTo(other.name); // tie-breaker: alphabetical order
		return Double.compare(other.cgpa, this.cgpa); // descending
	}

	@Override
	public String toString() {
		return name + " - CGPA: " + cgpa;
	}
}

public class ComparableDemo {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();

		students.add(new Student("Aarav", 8.5));
		students.add(new Student("Neha", 9.1));
		students.add(new Student("Zoya", 8.5));
		students.add(new Student("Raj", 7.9));

		Collections.sort(students); // uses compareTo

		System.out.println("Sorted Students (by CGPA):");
		for (Student s : students) {
			System.out.println(s);
		}
	}
}
