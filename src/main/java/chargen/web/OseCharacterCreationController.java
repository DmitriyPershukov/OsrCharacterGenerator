package chargen.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import chargen.ose.OseCharacter;

@Controller
@RequestMapping("/ose")
@SessionAttributes("oseCharacter")
public class OseCharacterCreationController {
	
	@ModelAttribute(name = "oseCharacter")
	public OseCharacter charcter() {
		OseCharacter character = new OseCharacter();
		character.generateRandomAbilityScores();
		return character;
	}
	
	@GetMapping
	public String showAbilityScoreRollingPage(Model model) {
		return "ose/abilityScore";
	}
	
	@PostMapping
	public String processButtons(@ModelAttribute("oseCharacter") OseCharacter character, @RequestParam("action") String action) {
		if(action.equals("reroll")) {
			character.generateRandomAbilityScores();
			return "ose/abilityScore";
		}
		if (action.equals("proceed")) {
			return "";
		}
		return "";
	}
}
