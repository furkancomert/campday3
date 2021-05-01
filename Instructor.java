package campday3;

public class Instructor extends User {
	private String course;
	private String courseinformation;
	
	public Instructor() {
		
	}
	
	public Instructor(String course,String courseinformation) {
		super();
		this.course = course;
		this.courseinformation = courseinformation;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCourseinformation() {
		return courseinformation;
	}

	public void setCourseinformation(String courseinformation) {
		this.courseinformation = courseinformation;
	}
	
}