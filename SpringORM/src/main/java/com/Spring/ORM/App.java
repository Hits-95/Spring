package com.Spring.ORM;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.Spring.ORM.dao.StudentDao;
import com.Spring.ORM.entities.Student;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("confg.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		// create buffer reader for console input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean go = true;
		while (go) {
			System.out.println("PRESS 1 for add student.");
			System.out.println("PRESS 2 for display all student.");
			System.out.println("PRESS 3 for get details of single student.");
			System.out.println("PRESS 4 for delete student.");
			System.out.println("PRESS 5 for update student.");
			System.out.println("PRESS 6 Exit.");

			try {

				System.out.print("Enter your choich : ");

				switch (Integer.parseInt(br.readLine())) {
				case 1:
					// add student
					// create student object
					Student student = new Student();

					// insert data from user
					System.out.print("Enter user id   : ");
					student.setId(Integer.parseInt(br.readLine()));

					System.out.print("Enter user name : ");
					student.setName(br.readLine());

					System.out.print("Enter user city : ");
					student.setCity(br.readLine());

					// inset student into database
					System.out.println(studentDao.insert(student) + "student added");
					System.out.println("**************************************");

					break;
				case 2:
					// display all student

					List<Student> allStudents = studentDao.getAllStudent();
					System.out.println(">>> All Student Data <<<");
					for (Student stud : allStudents) {
						System.out.println("Id   : " + stud.getId());
						System.out.println("Name : " + stud.getName());
						System.out.println("City : " + stud.getCity());
						System.out.println("--------------------------------------");

					}
					break;
				case 3:
					// display single student
					System.out.print("Enter user id : ");
					int id = Integer.parseInt(br.readLine());
					Student stud = studentDao.getStudent(id);
					// display student
					System.out.println("Id   : " + stud.getId());
					System.out.println("Name : " + stud.getName());
					System.out.println("City : " + stud.getCity());
					System.out.println("--------------------------------------");

					break;
				case 4:
					// delete student
					System.out.print("Enter user id : ");
					int student_id = Integer.parseInt(br.readLine());
					studentDao.deleteStudent(student_id);
					System.out.println("Student deleted.");
					break;
				case 5:
					// update student
					
					System.out.print("Enter user id   : ");
					int old_id = Integer.parseInt(br.readLine());
					
					//get data from database
					Student newstudent = studentDao.getStudent(old_id);
			
					// insert new data from user
					
					System.out.print("Enter user name : ");
					newstudent.setName(br.readLine());

					System.out.print("Enter user city : ");
					newstudent.setCity(br.readLine());

					// inset student into database
					studentDao.updateStudent(newstudent);
					System.out.println("student updated.");
					System.out.println("**************************************");
					
					break;
				case 6:
					go = false;
					break;

				}

			} catch (Exception e) {
				System.out.println("Invalid Input !!!");
				System.out.println(e.getMessage());
			}
		} // while loop
		System.out.println("Thank you !!!");
	}
}
