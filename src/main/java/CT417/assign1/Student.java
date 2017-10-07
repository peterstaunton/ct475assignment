package CT417.assign1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Student {
	private String name; //Student's name
	private String username; //Student's username

	private LocalDate dateofbirth; //Student's date of birth
	private int age;
	
	private static int userID = 100000; //unique userID
	
//	private ArrayList<String> studentUsernames; //list of usernames
	
	public Student(String nm, int day, int month, int year){
		this.name = nm;
//		this.username = createUsername(nm); //creates unique username from Student's name

	    dateofbirth = LocalDate.of(year, month, day);
		this.age = getAge();
		Student.userID = userID++; //ID increments for each new User
		
		this.username = getUsername();
	}

//	/**
//	 * @param name of Student nm
//	 * removes whitespace from Student's name and adds integer to create unique username
//	 * @return username 
//	 */
//	private String createUsername(String nm){
//		String un = nm.replaceAll(" ", ""); //replaces whitespace from name / makes full name one word
//		checkUsername(1, un);		
//		return un; }
//	private String inttoString(int n){ //takes integer n, returns it as a string object
//		return Integer.toString(n); }
	
//	/**
//	 * @param int n added to end of String un
//	 * Checks if username already exists
//	 * If it does, increment username and check again
//	 * If username doesn't exist, adds new username to list of usernames
//	 * @return created usrname
//	 */
//	private String checkUsername(int n, String un){
//		String nn = inttoString(n); //make int n a String
//		un += nn; //adds n to end of String un
//		if(!studentUsernames.contains(un)) {
//			studentUsernames.add(un); //if username does not exist, add to usernames list
//			return un; //returns username added to list
//		}
//		else checkUsername(n+1, un); //increments username and tries again
//		return null;	}
	/**
	 * @return Student's name without spaces and age added to end
	 */
	String getUsername() {
		String nspace = name.replaceAll(" ", ""); //replaces whitespace from name / makes full name one word
		String sage = Integer.toString(age);
		username = nspace + sage;
		return username;
	}

	int getAge() {
		LocalDate today             = LocalDate.now(); //today's date as LocalDate object
//		LocalDate birthday = new java.sql.Date(dob.getTime()).toLocalDate(); //converts Date dob into LocalDate birthday

		long age = ChronoUnit.YEARS.between(dateofbirth, today); //years between
		return (int)age;
	}
}
