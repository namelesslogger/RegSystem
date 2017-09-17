package main;

import java.util.ArrayList;

public class Module {
	private String ModuleName;
	private String ID;
	private ArrayList<Student> StudentList;
	
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
	
}
