import java.sql.Date;
import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		//create an instance of the DAO so that we may call its methods
		StudentDAO studentDAO = new StudentDAO();
		//we created an empty array list to store all our students from our getAllStudents() method
		ArrayList<StudentModel> students = studentDAO.getAllStudents();
		
		for (StudentModel i: students) {
			System.out.println(i);
		}
		
		//studentDAO.addStudent(new StudentModel(0, "Albus", "Dumbledore", 150, Date.valueOf("1992-12-03"), "Green"));

	}

}
