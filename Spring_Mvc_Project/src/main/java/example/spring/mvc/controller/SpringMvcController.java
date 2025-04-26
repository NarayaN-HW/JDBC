package example.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import example.spring.mvc.model.User;
import example.spring.mvc.model.UserValidator;

@Controller // class level Controller class
@SessionAttributes({"loggedInUser"}) // storing ttribute session level
public class SpringMvcController {// handling request

//	@RequestMapping("/doGreet")
	@GetMapping("/doGreet")
	public String getIndexPage() {
		System.out.println("url request recive and method invoke method getindexpage()");
		return "index"; // returning view Name
	}

	@RequestMapping("/doLogin")
	public String getLoginPage() {
		return "login";
	}

//	@RequestMapping(value = "/doValidate", method = RequestMethod.POST)
	@PostMapping("/doValidate")
	public String doValidateuser(
			@RequestParam("uid") String userName,
			@RequestParam("pwd") String password) {
		String page = "failure";
		User userObj = new User(userName, password);
		boolean valid = UserValidator.isValidUser(userObj);
		if (valid)
			page = "success";
		return page;
	}

	@PostMapping("/doValidateAgain")
	public String doValidateuserAgain(
			@RequestParam("uid") String userName,
			@RequestParam("pwd") String password,
			Model modelobj) {
		String page = "failurePage";
		User userObj = new User(userName, password);
		boolean valid = UserValidator.isValidUser(userObj);
		if (valid) {
			page = "successPage";
			modelobj.addAttribute("loggedInUser", userName); // by default request level
			modelobj.addAttribute("successMessage", "WelcomeBhai...");
		}else {
			modelobj.addAttribute("falureMessage", "Access Denied...");
		}
		return page;
	}
}
