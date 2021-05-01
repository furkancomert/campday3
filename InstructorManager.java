package campday3;

public class InstructorManager extends UserManager {
	
	public void addUser(User user) {
		System.out.println("Kurs Ögretmeni :"+" "+ user.getFirstName()+" "+user.getLastName());
	}
	public void addCourse(Instructor instructor) {
		System.out.println("Kurs Adý : " + instructor.getCourse() );
	}
	public void addCourseinformation(Instructor instructor) {
		System.out.println("Kurs Bilgisi : " + instructor.getCourseinformation() );
	}

}