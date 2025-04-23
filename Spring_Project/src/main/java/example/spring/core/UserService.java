package example.spring.core;

// DI dependency injection 
public class UserService implements GreetingService {
	private String name;
	private String message;
	private int age;

	@Override
	public String sayGreeting() {
		String reply = message + " name: " + name + ", your age is: " + age + " years Old ";
		return reply;
	}

	public UserService() {
		System.out.println("inside userservice()");
	}

	public UserService(String name, String message, int age) {
		System.out.println("inside userservice(string,string,int)");
		this.name = name;
		this.message = message;
		this.age = age;
	}

	public UserService(int age, String name, String message) {
		System.out.println("inside userservice(int,string,string)");
		this.name = name;
		this.message = message;
		this.age = age;
	}

	public String getName() {
		System.out.println("inside GetName()");
		return name;
	}

	public void setName(String name) {
		System.out.println("inside SetName()");
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserService\t[name=" + name + ", message=" + message + ", age=" + age + "]";
	}

}
