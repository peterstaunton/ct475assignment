package CT417.assign1;

import java.util.ArrayList;

public class Module {
	private String name; //module's name e.g. Software Engineering III
	private String moduleID; //unique ID code for module e.g. CT475
	private ArrayList<Student> studentlist; //ArrayList container holding all students in class
	
	public Module(String nm, String ID){
		this.name = nm;
		this.moduleID = ID;
		this.studentlist = new ArrayList<Student>(); //create new ArrayList container for all students in class
	}
	public void addStudent(Student student){ //adds student to list
		studentlist.add(student);
	}
	

}
