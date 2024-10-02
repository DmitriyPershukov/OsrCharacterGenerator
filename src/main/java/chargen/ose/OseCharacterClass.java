package chargen.ose;

import java.util.HashMap;

import lombok.Data;

@Data
public class OseCharacterClass {
	
	private String name;
	
	private HashMap<String, Integer> abilityScoreRequirments;
	
	private int hitDice;
}
