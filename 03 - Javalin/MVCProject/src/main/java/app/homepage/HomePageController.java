package app.homepage;

import io.javalin.Javalin;
import io.javalin.http.Handler;

public class HomePageController {
	
	HomePageView view;
	HomePageModel model;

	public HomePageController(Javalin app) {
		
		model = new HomePageModel("Jacob");
		view = new HomePageView(model);
		
		app.get("/", getHandler);
	}
	
	public Handler getHandler = ctx -> {
		ctx.html(view.render());
	};
}
