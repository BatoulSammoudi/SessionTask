package axsos.finalproject;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/counter")
	public String firstPage(HttpSession session, Model model) {
		int currentCounter = (Integer) session.getAttribute("count");
		model.addAttribute("countToShow", currentCounter);
		System.out.println(currentCounter);

		return "firstPage.jsp";
	}

	@RequestMapping("/home")
	public String secondPage(HttpSession session, Model model) {
		if (session.getAttribute("count") ==(null)) {
			session.setAttribute("count", 0);
		} else {
			int counter = (Integer) session.getAttribute("count") + 1;
			session.setAttribute("count", counter);
		}
		int currentCounter = (Integer) session.getAttribute("count");
		model.addAttribute("countToShow", currentCounter);
		System.out.println(currentCounter);
		return "secondPage.jsp";
	}

}
