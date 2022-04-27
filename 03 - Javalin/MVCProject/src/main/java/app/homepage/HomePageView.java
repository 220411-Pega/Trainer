package app.homepage;

public class HomePageView {
	
	private HomePageModel model;
	
	public HomePageView(HomePageModel model) {
		this.model = model;
	}

	public String render() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("<html>");
		
		sb.append("<h2>Hello!</h2>");
		sb.append("<h5>Welcome back, " + model.username + "!</h5>");
		
		sb.append("</html>");
		
		return sb.toString();
	}
}
