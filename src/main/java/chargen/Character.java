package chargen;

import java.util.Random;

import lombok.Data;

@Data
public class Character {
	
	private static Random rand = new Random();
	
	protected int strengthScore;
	protected int intelligenceScore;
	protected int wisdomScore;
	protected int dexterityScore;
	protected int constitutionScore;
	protected int charismaScore;
	
	private int generateRandomAbilityScore() {
		return rand.nextInt(6) + rand.nextInt(6) + rand.nextInt(6) + 3;
	}
	
	public void generateRandomAbilityScores() {
		strengthScore = generateRandomAbilityScore();
		intelligenceScore = generateRandomAbilityScore();
		wisdomScore = generateRandomAbilityScore();
		dexterityScore = generateRandomAbilityScore();
		constitutionScore = generateRandomAbilityScore();
		charismaScore = generateRandomAbilityScore();
	}
}
