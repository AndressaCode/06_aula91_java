package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("How many rooms will be rented?");
		int n = sc.nextInt();
		
		Student[] student = new Student[10];
		
		for(int i=1; i<n; i++) {
			System.out.println();
			System.out.println("Rent #" + i +": " );
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			student[room] = new Student(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		for(int i = 0; i<10; i++) {
			if(student[i] != null) {
				System.out.println(i + ": " + student[i]);
			}
		}
		
		sc.close();

	}

}
