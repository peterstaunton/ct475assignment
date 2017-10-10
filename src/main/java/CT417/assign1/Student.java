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
		long age = ChronoUnit.YEARS.between(dateofbirth, today); //years between
		return (int)age;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

