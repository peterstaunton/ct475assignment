package CT417.assign1;

import java.util.ArrayList;
import java.time.LocalDate;

public class CourseProgramme {
	private String name; //Name of course e.g. CS & IT, ECE, EEE etc.
	private ArrayList<Module> subjects;
	private LocalDate startdate; //start of academic year
	private LocalDate enddate; //end of academic year
	
	public CourseProgramme(String name){
		this.name = name;
		this.subjects = new ArrayList<Module>(); //create new ArrayList container for modules
	}
	
	public void addModule(Module mod){
		subjects.add(mod);
	}
	
	public LocalDate getStartDate(){
		return startdate;
	}
	public void setStartDate(int dd, int mm, int yy){ //sets start of academic year (day/month/year)
		startdate = LocalDate.of(yy, mm, dd);
	}
	public LocalDate getEndDate(){
		return enddate;
	}
	public void setEndDate(int dd, int mm, int yy){ //sets end of academic year (day/month/year)
		enddate = LocalDate.of(yy,  mm,  dd);
	}
	public String getName() {
		return name;
	}
	public ArrayList<Module> listModules() {
		return subjects;
	}
	
}
