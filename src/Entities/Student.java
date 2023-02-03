package Entities;

public class Student {
	public String studentName;
	public double nota1;
	public double nota2;
	
	
public double Media() {
	return (nota1 + nota2) / 2;
 }
}
