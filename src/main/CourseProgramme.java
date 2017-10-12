package main;

import java.util.ArrayList;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class CourseProgramme {
	private DateTimeFormatter formatter = DateTimeFormat.forPattern("dd/MM/yyyy");
	private String CourseName;
	private ArrayList<Module> ModuleList = new ArrayList<Module>();
	private DateTime StartDate;
	private DateTime EndDate;
	
	public CourseProgramme(String CourseName, String start, String end){
		this.StartDate = formatter.parseDateTime(start);
		this.EndDate = formatter.parseDateTime(end);
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
