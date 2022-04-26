package controller;

import dao.UserDAO;
import io.javalin.Javalin;
import io.javalin.http.Handler;
import model.User;

public class UserController {

	UserDAO dao;
	
	public UserController(Javalin app) {
		
		dao = new UserDAO();
		
		app.get("/users/{username}", getHandler);
		app.post("/users", postHandler);
		app.put("/users/{username}", putHandler);
		app.delete("/users/{username}", deleteHandler);
	}
	
	/* The 'Algorithm' for controllers
	 * 0. Determine if data is flowing in (to your db) o
	 *    or out (back to the requestor)
	 * 1. Get data (either from the body (if data is flowing in) 
	 *    or path (if data is flowing out))
	 * 2. Use data with your DAO
	 * 3. Return desired result
	 */
	
	public Handler getHandler = ctx -> {
		
		// Get the path's username
		String username = ctx.pathParam("username");
		
		// Get the user based on the username
		User user = dao.get(username);
		
		// Turns the given Java object into JSON format,
		// which is a text format understood by almost everybody and
		// can be used in any system running any technology
		// Think of JSON as a universal data transfer format
		ctx.json(user);
	};
	
	// The 'create' command
	public Handler postHandler = ctx -> {
		
		// Turn the body of the request from JSON (ie text) into
		// a real Java object
		User user = ctx.bodyAsClass(User.class);
		
		dao.create(user);
		
		// As a best practice, responses should have descriptive 
		// status codes
		ctx.status(201);
	};
	
	// 'update' command
	public Handler putHandler = ctx -> {
		User user = ctx.bodyAsClass(User.class);
		
		dao.update(user);
		
		ctx.status(200);
	};
	
	public Handler deleteHandler = ctx -> {
		User user = ctx.bodyAsClass(User.class);
		
		dao.delete(user);
		
		ctx.status(200);
	};
}
