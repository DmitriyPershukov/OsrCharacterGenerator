package chargen.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import chargen.bz.BzCharacter;
import chargen.ose.OseCharacter;

@Controller
@RequestMapping("/bz")
@SessionAttributes("bzCharacter")
public class BzCharacterCreationController {

	@GetMapping
	public String showAbilityScoreRollingPage(Model model) {
		return "bz/abilityScore";
	}
	
	@ModelAttribute("bzCharacter")
	public BzCharacter character() {
		BzCharacter character = new BzCharacter();
		character.generateRandomAbilityScores();
		
		return character;
	}
	
	@PostMapping
	public String processButtons(@ModelAttribute("bzCharacter") BzCharacter character, @RequestParam("action") String action, @RequestBody String postPayload) {
		if(action.equals("reroll")) {
			character.generateRandomAbilityScores();
			return "redirect:bz";
		}
		if (action.equals("proceed")) {
			return "";
		}
		return "";
	}
}
