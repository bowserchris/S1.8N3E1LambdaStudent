package n3;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		//create list of 10 students
		List<Student> listStudent = new ArrayList<>();
		listStudent.add(new Student("John", 25, 6,"Java"));
		listStudent.add(new Student("Mark", 17, 7,"Java"));
		listStudent.add(new Student("Haley", 17, 4,"PHP"));
		listStudent.add(new Student("Antoni", 33, 8,"Python"));
		listStudent.add(new Student("Jamal", 24, 9,"Java"));
		listStudent.add(new Student("Beth", 21, 8,"PHP"));
		listStudent.add(new Student("Samantha", 17, 7,"Python"));
		listStudent.add(new Student("Luisa", 30, 7,"Python"));
		listStudent.add(new Student("Joaquin", 42, 7,"Java"));
		listStudent.add(new Student("Bob", 24, 9,"Java"));
		
		//print name and age only
		listStudent.forEach( student -> {System.out.println("Name: " + student.getName() + ", Age: " +  student.getAge()); } );
		
		//filter starts with a and assign to other list
		System.out.println("List Starts with 'A': ");
		ThruList startsWithA = (list) -> {
			List<Student> array = new ArrayList<>();
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getName().startsWith("A")) {
					array.add(list.get(i));
				}
			}
			return array;
		};
		List<Student> listStudentA = startsWithA.thruList(listStudent);
		listStudentA.forEach(System.out::println);
		
		//grade 5 or higher
		System.out.println("List grade with 5 or higher: ");
		ThruList fiveOrHigher = (list) -> {
			List<Student> array = new ArrayList<>();
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getGrade() > 5) {
					array.add(list.get(i));
				}
			}
			return array;
		};

		List<Student> listStudent5Hi = fiveOrHigher.thruList(listStudent);
		listStudent5Hi.forEach(System.out::println);
		
		//grade 5 or higher and not php
		System.out.println("List grade with 5 or higher & not PHP: ");
		
		ThruList fiveOrHigherNoPHP = (list) -> {
			List<Student> array = new ArrayList<>();
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getGrade() > 5 && !list.get(i).getSubjectLesson().equals("PHP")) {
					array.add(list.get(i));
				}
			}
			return array;
		};

		List<Student> listStudent5HiNoPHP = fiveOrHigherNoPHP.thruList(listStudent);
		listStudent5HiNoPHP.forEach(System.out::println);
		
		//take java and 18<
		System.out.println("List Java only & 18yo or <: ");

		ThruList javaAnd18 = (list) -> {
			List<Student> array = new ArrayList<>();
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getSubjectLesson().equals("Java") && list.get(i).getAge() >= 18) {
					array.add(list.get(i));
				}
			}
			return array;
		};

		List<Student> listStudentJava = javaAnd18.thruList(listStudent);
		listStudentJava.forEach(System.out::println);
	}

}

/*
 * Cr
   - Shows all students who take JAVA and are of legal age.
 * 
 * 
 * */
