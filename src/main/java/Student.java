import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	//mantory paramter
	String studentId;
	String studentName;
	int age;
	//optional paaremeter
	Teacher assignedTeacher;
	Course course;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String studentId,String studentName,int age) {
		
		this.studentId= studentId;
		this.studentName= studentName;
		this.age= age;
	}
	
	public Teacher getAssignedTeacher() {
		return assignedTeacher;
	}
	
	@Autowired
	public void setAssignedTeacher(Teacher assignedTeacher) {
		this.assignedTeacher = assignedTeacher;
	}
	public Course getCourse() {
		return course;
	}
	
	@Autowired
	public void setCourse(Course course) {
		this.course = course;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", age=" + age
				+ ", assignedTeacher=" + assignedTeacher + ", course=" + course + "]";
	}
}
