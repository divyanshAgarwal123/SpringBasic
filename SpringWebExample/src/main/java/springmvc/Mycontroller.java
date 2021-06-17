package springmvc;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import springmvc.model.User;

@Controller
//first way
public class Mycontroller{
@RequestMapping("/hello")
public String show(HttpServletRequest request, HttpServletResponse response, Model model) {
	
	String name1=request.getParameter("user1");
	String name2 = request.getParameter("user2");
	String email=request.getParameter("email");
	String pass1 = request.getParameter("pass1");
	String pass2=request.getParameter("pass2");
	String zero= null;
	String a ="Please fill all the fields";
	String b ="You've Entered Wrong Credentials";
	System.out.print(name1);
    if(name1.equals(zero) || name2.equals(zero) || email.equals(zero) || pass1.equals(zero) || pass2.equals(zero))
	{
    	model.addAttribute("key5",a);
    	
    	return "error";
	}
	else
	{
		if(name1.equals("divyansh") && name2.equals("agarwal") && email.equals("divyansh104agarwal@gmail.com")&&pass1.equals("divyansh123")&&pass2.equals("divyansh123"))
		{				
			model.addAttribute("key",name1);
			model.addAttribute("key2",name2);
			model.addAttribute("key3",email);
			model.addAttribute("key4",pass1);
			model.addAttribute("key5",pass2);
			return "success";
		}
		
		else
		{
	    	model.addAttribute("key6",b);			
			return "error";
		}
		
	}
}
}
//second way
//public class Mycontroller{
//@RequestMapping("/hello")
//
//public String show(@ModelAttribute("key") User user) {
//	return "success";
//}
//}