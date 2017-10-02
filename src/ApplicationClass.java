import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ApplicationClass {

	public static void main(String[] args) {

		Faculty faculty1 = new Faculty();
		Faculty faculty2 = new Faculty();
		faculty1.setName("Tıp Fakültesi");
		faculty2.setName("Mühendislik Fakültesi");
		
		ArrayList<Instructor> instructors = new ArrayList<>();
		Instructor instructor1 = new Instructor();
		Instructor instructor2 = new Instructor();
		Instructor instructor3 = new Instructor();
		Instructor instructor4 = new Instructor();

		instructor1.setName("Muhammet Ünal");
		instructor1.setFaculty(faculty1);

		instructor2.setName("Fırat Kalaycı");
		instructor2.setFaculty(faculty1);

		instructor3.setName("Hacer Karacan");
		instructor3.setFaculty(faculty1);

		instructor4.setName("Mehmet Erdem");
		instructor4.setFaculty(faculty2);

		instructors.add(instructor1);
		instructors.add(instructor2);
		instructors.add(instructor3);
		instructors.add(instructor4);

		ArrayList<Department> departments = new ArrayList<>();
		Department department1 = new Department();
		Department department2 = new Department();
		Department department3 = new Department();
		Department department4 = new Department();
		
		department1.setName("Bilgisayar Mühendisliği");
		department2.setName("Biyoloji");
		
		departments.add(department1);
		departments.add(department2);
		departments.add(department3);
		departments.add(department4);
		
		ArrayList<Manager> managers = new ArrayList();
		
		Manager manager1 = new Manager();
		Manager manager2 = new Manager();

		manager1.setDepartment(department1);
		manager1.setName("Haluk");

		manager2.setDepartment(department2);
		manager2.setName("Mahmut");
		
		managers.add(manager1);
		managers.add(manager2);
		
		department1.setName("Yazılım");
		department1.setManagers(managers);
		
		department2.setName("Kimya");
		department2.setManagers(managers);
		
		department3.setName("Cs");
		department3.setManagers(managers);

		department4.setName("Fizik");
		department4.setManagers(managers);
		
		faculty1.setInstructors(instructors);
		faculty1.setDepartments(departments);

		Lesson lesson1 = new Lesson();
		Lesson lesson2 = new Lesson();
		Lesson lesson3 = new Lesson();
		
		lesson1.setCode(123);
		lesson1.setName("Algoritma");
		lesson1.setInstructor(instructor1);
				
		lesson2.setCode(1234);
		lesson2.setName("Mekanik");
		lesson2.setInstructor(instructor2);
		
		lesson3.setCode(12345);
		lesson3.setName("Liner Cebir");
		lesson3.setInstructor(instructor3);

		ArrayList<Student> student = new ArrayList<>();
		
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();

		student1.setId(1);
		student1.setName("Tolgay");
		student1.setDepartments(departments);

		student2.setId(2);
		student2.setName("Ayhan");
		student2.setDepartments(departments);

		student3.setId(3);
		student3.setName("Melike");
		student3.setDepartments(departments);

		student.add(student1);
		student.add(student2);
		student.add(student3);
		
		HashMap<Integer, Student> registeredStudents = new HashMap<>();
		
		registeredStudents.put(student1.getId(), student1);
		registeredStudents.put(student2.getId(), student2);
		registeredStudents.put(student3.getId(), student3);

		lesson1.setRegisteredStudents(registeredStudents);
		lesson2.setRegisteredStudents(registeredStudents);
		
		HashMap<Integer, Lesson> lessons = new HashMap<>();
		
		lessons.put(lesson1.getCode(), lesson1);
		lessons.put(lesson2.getCode(), lesson2);
		lessons.put(lesson3.getCode(), lesson3);
		
		HashMap<Integer, Department> department = new HashMap<>();
		
		department.put(lesson1.getCode(), department1);
		department.put(lesson2.getCode(), department2);
		department.put(lesson3.getCode(), department3);
		
		for (Instructor ins : instructors) {
			
			System.out.println(ins.getFaculty().getName());
		}
		
		System.out.println();
		
		for(Manager man : managers) {
			
			System.out.println(man.getName()); 
			System.out.println(man.getDeparment().getName()); 
		}
			
		System.out.println();
		
		for (Student stu : student) {
			
			System.out.println(stu.getName());
		}
		
		System.out.println();
		
		ArrayList<Faculty> fac = new ArrayList<>();
		fac.add(faculty1);
		fac.add(faculty2);
	    
		for (Faculty f : fac) {
			
	    	System.out.println(f.getName());
		}

		System.out.println();
		
	    for (Department dep : departments) {
			
	    	System.out.println(dep.getName());
		}
	   
	    System.out.println();
	    
	    System.out.println(registeredStudents.put(student1.getId(), student1).getName() + " " + lessons.put(lesson1.getCode(), lesson1).getName());
	    System.out.println();
	
		System.out.println();
		
	    for (Department dep : departments) {
			
	    	System.out.println(dep.getName());
		}
	   
	    System.out.println();
	    
	    System.out.println(registeredStudents.put(student1.getId(), student1).getName() + " " + lessons.put(lesson1.getCode(), lesson1).getName());
	    System.out.println();
	}
}
