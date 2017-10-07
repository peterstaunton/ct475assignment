package CT417.assign1;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Student teststudent = new Student("Frank Smith", 3, 3, 1990);
        System.out.println(teststudent);
        System.out.println(teststudent.getAge());
        System.out.println(teststudent.getUsername());
        System.out.println(teststudent);
    }
}
