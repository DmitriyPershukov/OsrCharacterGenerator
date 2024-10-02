package chargen.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import chargen.SupportedSystems.SupportedSystem;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import chargen.SupportedSystems;

@Slf4j
@Controller
@RequestMapping("/")
public class HomeController {
	
	private SupportedSystems supportedSystems;
	
	@Autowired
	public HomeController(SupportedSystems supportedSystems) {
		this.supportedSystems = supportedSystems;
	}
	
	@ModelAttribute(name="supportedSystems")
	public List<SupportedSystem> addSupportedSystemsToModel(Model model) {
		return supportedSystems.getSupportedSystems();
	}
	
	@GetMapping
	public String showHomePage() {
		return "home";
	}
}
