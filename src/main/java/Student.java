
public class Student {
	
	String id;
	String name;
	int age;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String id,String name,int age) {
		
		this.id= id;
		this.name= name;
		this.age= age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
