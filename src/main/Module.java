package main;

import java.util.ArrayList;

public class Module {
	private String ModuleName;
	private String ID;
	private ArrayList<Student> StudentList = new ArrayList<Student>();
	
	public Module (String modName, String id){
		this.ModuleName = modName;
		this.ID =id;
	}
	
	public String getModuleName() {
		return ModuleName;
	}
	
	public void setModuleName(String moduleName) {
		ModuleName = moduleName;
	}
	
	public String getID() {
		return ID;
	}
	
	public void setID(String iD) {
		ID = iD;
	}
	
	public ArrayList<Student> getStudentList() {
		return StudentList;
	}
	
	public void setStudentList(ArrayList<Student> studentList) {
		StudentList = studentList;
	}
	
	public void addStudent(Student student) {
		StudentList.add(student);
	}
	
}
