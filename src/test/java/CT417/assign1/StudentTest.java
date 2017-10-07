package CT417.assign1;

import junit.framework.TestCase;

public class StudentTest extends TestCase {

Student teststudent = new Student("Frank Byrne", 3, 3, 1992);

public void testgetUsername(){
	String expected = "FrankByrne25";
	System.out.println(teststudent);
	String actual = teststudent.getUsername(); //studentname + age
	
	assertEquals(expected,actual);	
}
}
