package classpart;

public class Student {

	int studentID;
	String studentName;
	int grade;
	String address;
	
	
	public void showStudnet() {
		System.out.println(studentName + "," +address );
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	
	

}
