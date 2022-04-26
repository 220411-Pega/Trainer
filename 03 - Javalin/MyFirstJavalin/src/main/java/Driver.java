import io.javalin.Javalin;
import io.javalin.http.Context;
import io.javalin.http.Handler;

public class Driver {
	
	public static void main(String[] args) {
		
		// Creates a Javalin server object, and starts listening on port 7070
		Javalin app = Javalin.create().start(7070);
		
		// This block sets up a listener for GET requests to the path /user
		// and, when a request is detected, returns "Hello!" in the body of 
		// the response
		app.get("/user", ctx -> { 
				ctx.result("Hello!"); 
			}
		);
		
		// Can also break up the definition of the listener/path and the
		// code to run once a message is recieved by storing the lamda
		// in a variable (which we do on line 41)
		app.get("/user2", userHandler);
		
		// A listener is just a path+verb combination
		
		// We can use path parameters, or variables stored in the path,
		// to create listeners for resources without hard-coding the 
		// resources to look up
		app.get("/user/{id}", ctx -> {
			
			// We can retrieve path parameters with the pathParam method
			// pathParam takes the name of the path parameter, which is set
			// in the path of the listener (set in line 30)
			String id = ctx.pathParam("id");
			
			ctx.result("Your id is " + id);
		});
	}
	
	public static Handler userHandler = ctx -> {
		ctx.result("Hello!");
	};
	
}
