package campday3;

public class StudentManager extends UserManager {
	
	public void addUser(User user) {
		System.out.println(user.getFirstName()+" "+user.getLastName() +" "+ "adlı kullanıcı eklendi. ");
	} 
	
	public void addAdress(Student student) {
		System.out.println( student.getAddress() +" "+ "adresi eklendi.");
	}
	public void addEmail(Student student) {
		System.out.println( student.getEmail() +" "+ "emaili eklendi.");
	}
	public void editProfile(Student student) {
		System.out.println(student.getFirstName() +" "+student.getLastName() +" "+ "profili oluşturuldu.");
	}

}