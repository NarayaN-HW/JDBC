package example.spring.mvc.model;

public class User {
	private String uName;
	private String password;

	public User() {

	}

	public User(String uName, String password) {
		super();
		this.uName = uName;
		this.password = password;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

