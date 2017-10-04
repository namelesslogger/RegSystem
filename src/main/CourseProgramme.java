package main;

import java.util.ArrayList;

import org.joda.time.DateTime;

public class CourseProgramme {
	private String CourseName;
	private ArrayList<Module> ModuleList;
	private DateTime StartDate;
	private DateTime EndDate;
	
	public CourseProgramme(String CourseName){
		this.CourseName = CourseName;
	}
	
	public String getCourseName() {
		return CourseName;
	}
	
	public void setCourseName(String courseName) {
		CourseName = courseName;
	}
	
	public ArrayList<Module> getModuleList() {
		return ModuleList;
	}
	
	public void setModuleList(ArrayList<Module> moduleList) {
		ModuleList = moduleList;
	}
	
	public void addModule(Module module) {
		ModuleList.add(module);
	}
	
	public DateTime getStartDate() {
		return StartDate;
	}
	
	public void setStartDate(DateTime startDate) {
		StartDate = startDate;
	}
	
	public DateTime getEndDate() {
		return EndDate;
	}
	
	public void setEndDate(DateTime endDate) {
		EndDate = endDate;
	}
}
