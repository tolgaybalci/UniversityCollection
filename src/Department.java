import java.util.ArrayList;
import java.util.Map;

public class Department {

	private String name;
	private Map<Integer, Lesson> lessons;
	private ArrayList<Manager> managers;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Manager> getManagers() {
		return managers;
	}

	public void setManagers(ArrayList<Manager> managers) {
		this.managers = managers;
	}

	public Map<Integer, Lesson> getLessons() {
		return lessons;
	}

	public void setLessons(Map<Integer, Lesson> lessons) {
		this.lessons = lessons;
	}
	
}
