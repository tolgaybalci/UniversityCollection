
public class Instructor extends Person{

	private String name;
	private Faculty faculty;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	@Override
	public String toString() {
		return "Instructor [name=" + name + ", faculty=" + faculty + "]";
	}

	

	

	
}
