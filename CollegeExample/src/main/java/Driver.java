import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		//create an instance of the DAO so that we may call its methods
		StudentDAO studentDAO = new StudentDAO();
		
		ArrayList<StudentModel> students = studentDAO.getAllStudents();
		for (StudentModel i: students) {
			System.out.println(i);
		}

	}

}
