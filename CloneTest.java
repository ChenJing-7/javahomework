package ofchenjing;

public class CloneTest {
	public static void main(String[] args) {
		
		Course course1 = new Course("JAVA");
		course1.addStudent("Peter"); 
		course1.addStudent("Kim"); 
		
		//使用clone方法进行复制
		Course course2 = (Course) course1. clone(); 
		course2.addStudent("Steve"); 
		
		//验证复制是否实现
		System.out.println("Number of students in course1: " + course1. getNumberOfStudents()); 
		System.out.println("Number of students in course2: " + course2. getNumberOfStudents());
		}
}

//程序清单10-6的Class类
class Course implements Cloneable {
	private String courseName; 
	private String[] students = new String[100]; 
	private int numberOfStudents; 
	
	public Course(String courseName) {
		this. courseName = courseName;
	}
	public void addStudent(String student){
		students[numberOfStudents] = student; 
		numberOfStudents++;
}
	public String[] getStudents() {
		return students; 
	}
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	public String getCourse1Name() {
		return courseName; 
	}
	public void dropStudent(String student) {
		//Left as an exercise in Exercise 10.9
	}
	
	//可以实现深度复制的clone方法
	public Object clone() {
		try{
			Course c= (Course) super. clone(); 
			c. students = new String[100]; 
			System. arraycopy(students, 0, c. students, 0, 100); 
			c. numberOfStudents = numberOfStudents; 
			return c;
		} catch (CloneNotSupportedException ex) {
			return null;
		}
	}
}