package main;

public class Student {
	private String Name;
	private int age;
	private String DOB;
	private int ID;
	
	public Student(String name, int age, String DOB, int ID){
		this.Name = name;
		this.age = age;
		this.DOB = DOB;
		this.ID = ID;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getDOB() {
		return DOB;
	}
	
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setID(int iD) {
		ID = iD;
	}
	
	public String getUsername() {
		return this.Name + this.age;
	}
}
