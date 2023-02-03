import java.util.*;
import Entities.Student;
public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter de student name: ");
			student.studentName = input.nextLine();
		
		System.out.println();
			System.out.print("Enter the test score 1: ");
			student.nota1 = input.nextDouble();
			System.out.print("Enter the test score 2: ");
			student.nota2 = input.nextDouble();
			
		System.out.println("Final Score: " + student.Media());
		
		if (student.Media() >= 6.00 ) {
			System.out.println("Aproved!");
		}
		else {
			System.out.println("Reproved!");
		}

input.close();
}}			
		
		
		 
		




