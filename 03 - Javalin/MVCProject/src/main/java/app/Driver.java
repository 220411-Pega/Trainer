package app;

import app.homepage.HomePageController;
import io.javalin.Javalin;

public class Driver {

	public static void main(String[] args) {
		
		Javalin app = Javalin.create().start(7070);
		HomePageController controller = new HomePageController(app);
	}
}
