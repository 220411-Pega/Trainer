import dao.UserDAO;
import io.javalin.Javalin;
import io.javalin.http.Handler;
import io.javalin.http.staticfiles.Location;
import model.User;

public class Driver {

	public static void main(String[] args) {
		
		Javalin app = Javalin.create( config -> { 
			config.addStaticFiles("/html", Location.CLASSPATH); 
			}).start(7070);
		
		app.post("/signup", postHandler);
	}
	
	public static Handler postHandler = ctx -> {
		
		User user = new User();
		user.username = ctx.formParam("username");
		user.password = ctx.formParam("password");
		user.firstName = ctx.formParam("firstName");
		user.lastName = ctx.formParam("lastName");
		user.birthMonth = ctx.formParam("birthMonth");
		
		UserDAO dao = new UserDAO();
		dao.create(user);
		
		System.out.println(user.username + " was created!");
	};
}
