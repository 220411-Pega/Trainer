package app;

import controller.UserController;
import io.javalin.Javalin;

public class Driver {

	public static void main(String[] args) {
		
		Javalin app = Javalin.create().start(7070);
		
		UserController userController = new UserController(app);
	}
}
