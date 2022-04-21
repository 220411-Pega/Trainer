import com.revature.dao.UserDAO;
import com.revature.dao.UserDAOImpl;
import com.revature.models.User;

public class Driver {

	public static void main(String[] args) {
		
		UserDAO userDao = new UserDAOImpl();
		User u = userDao.getUser("jacob");
		System.out.println("User " + u.username + ":");
		System.out.println("First Name: " + u.firstName);
		System.out.println("Last Name: " + u.lastName);
		System.out.println("Birth Month: " + u.birthMonth);
	}
}
