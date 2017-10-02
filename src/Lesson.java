import java.util.Map;

public class Lesson {

	private Integer code;
	private String name;
	private Map<Integer, Student> registeredStudents;
	private Instructor instructor;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<Integer, Student> getRegisteredStudents() {
		return registeredStudents;
	}

	public void setRegisteredStudents(Map<Integer, Student> registeredStudents) {
		this.registeredStudents = registeredStudents;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	

	
}
