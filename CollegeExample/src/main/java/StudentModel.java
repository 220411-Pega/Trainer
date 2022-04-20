import java.sql.Date;

public class StudentModel {

	//these correspond to columns in our database
	public int id;
	public String firstName;
	public String lastName;
	public int age;
	public Date date;
	public String favColor;
	
	//this is a constructor that maps the database values to the variables in our code
	public StudentModel(int id, String firstName, String lastName, int age, Date birthday, String fav_color) {
		//this.variablename = databaseColumnName;
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.date = birthday;
		this.favColor = fav_color;
	}



	@Override
	public String toString() {
		return "StudentModel [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", date=" + date + ", favColor=" + favColor + "]";
	}



	public StudentModel() {
		
	}
}
