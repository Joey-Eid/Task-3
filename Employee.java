package Sumerge;
public class Employee {
	String title;
	String name;
	String number;
	
	public Employee(String title, String name, String number) {
		this.title = title;
		this.name = name;
		this.number = number;
	}
	
	public String getTitle() {
		return title;
	}
	public String toString() {
		return ("Name " + name + " - Mobile " + number);
	}
}
