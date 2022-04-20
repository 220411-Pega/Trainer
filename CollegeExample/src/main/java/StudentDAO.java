import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

public class StudentDAO {
	
	//this creates an instance of our getConnection() method from the ConnectionManager file
	private Connection conn = ConnectionManager.getConnection();
	
	//this method returns all students
	public ArrayList<StudentModel> getAllStudents() {
		try {
			//this creates a new statement called statement that uses a connection to the db
			Statement statement = conn.createStatement();
			
			ResultSet rs = statement.executeQuery("SELECT * FROM Student");
			//this is our arraylist for storing our results
			ArrayList<StudentModel> students = new ArrayList<StudentModel>();
			
			//this loop runs so long as there is another row in rs
			while (rs.next()) {
				int id = rs.getInt("id");
				String firstName = rs.getString("firstName");
				String lastName = rs.getString("lastName");
				int age = rs.getInt("age");
				Date date = rs.getDate("birthday");
				String favColor = rs.getString("fav_color");
				
				//this adds each new student to our student list(array)
				students.add(new StudentModel(id, firstName, lastName, age, date, favColor));
			} return students;
		} catch (SQLException e) {
			e.printStackTrace();
		} return null;
	}
}
