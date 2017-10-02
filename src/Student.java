import java.util.ArrayList;
import java.util.Map;

public class Student extends Person{

	private Integer id;
	private String name;
	private ArrayList<Department> departments;
	private Map<Integer, Lesson> lessons;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(ArrayList<Department> departments) {
		this.departments = departments;
	}

	public Map<Integer, Lesson> getLessons() {
		return lessons;
	}

	public void setLessons(Map<Integer, Lesson> lessons) {
		this.lessons = lessons;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", departments=" + departments + ", lessons=" + lessons + "]";
	}

	
	
	

}