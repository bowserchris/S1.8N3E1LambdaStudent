package n3;

import lombok.Data;

@Data
public class Student {
	
	private String name;
	private int age;
	private int grade;
	private String subjectLesson;
	
	public Student(String name, int age, int grade, String subjectLesson) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.subjectLesson = subjectLesson;
	}

}


