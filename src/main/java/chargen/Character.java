package chargen;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import lombok.Data;

public class Character {
	
	private static Random rand = new Random();
	
	protected LinkedHashMap<String, Integer> abilityScores;
	
	private int generateRandomAbilityScore() {
		return rand.nextInt(6) + rand.nextInt(6) + rand.nextInt(6) + 3;
	}
	
	public void generateRandomAbilityScores() {
		for (String name: this.abilityScores.keySet()) {
			this.abilityScores.put(name, generateRandomAbilityScore());
		}
	}
	
	public Iterator<Map.Entry<String, Integer>> getAbilityScores(){
		return abilityScores.entrySet().iterator();
	}
	
	public int getAbilityScore(String name) {
		return this.abilityScores.get(name);
	}
	
	public void setAbilityScore(String name, int value) {
		this.abilityScores.put(name, value);
	}
}
