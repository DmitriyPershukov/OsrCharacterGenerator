package chargen.bz;

import java.util.HashMap;
import java.util.LinkedHashMap;

import chargen.Character;

public class BzCharacter extends Character{
	
	public BzCharacter() {
		this.abilityScores = new LinkedHashMap();
		this.abilityScores.put("Сила", 0);
		this.abilityScores.put("Интеллект", 0);
		this.abilityScores.put("Мудрость", 0);
		this.abilityScores.put("Ловкость", 0);
		this.abilityScores.put("Телосложение", 0);
		this.abilityScores.put("Харизма", 0);
	}
}
