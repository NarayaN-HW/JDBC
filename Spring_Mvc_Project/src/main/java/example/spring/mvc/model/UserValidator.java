package example.spring.mvc.model;

public class UserValidator {

	public static boolean isValidUser(User currentUser) {
		boolean success = false;
		String currentUserName = currentUser.getuName();
		String currentPassword = currentUser.getPassword();
		if (currentUserName.equalsIgnoreCase("admin") && currentPassword.equalsIgnoreCase("admin"))
			success = true;
		return success;

	}
}
