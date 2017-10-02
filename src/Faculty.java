import java.util.ArrayList;

public class Faculty {

	private String name;
	private ArrayList<Department> departments;
	private ArrayList<Instructor> instructors;

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

	public ArrayList<Instructor> getInstructors() {
		return instructors;
	}

	public void setInstructors(ArrayList<Instructor> instructors) {
		this.instructors = instructors;
	}

	
	
}
