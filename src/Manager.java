
public class Manager extends Person{

	private String name;
	private Department department;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDeparment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Manager [name=" + name + ", department=" + department + "]";
	}

	
}
