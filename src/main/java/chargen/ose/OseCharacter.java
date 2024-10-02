package chargen.ose;

import java.util.Random;

import chargen.Character;
import lombok.Data;

@Data
public class OseCharacter extends Character{
	
	private int getMeleeModifier() {
		return mapScoreToModifier(strengthScore);
	}
	
	private int getOpenDoorsChance() {
		if (strengthScore <= 8) {
			return 1;
		}
		if (strengthScore <= 12) {
			return 2;
		}
		if (strengthScore <= 15) {
			return 3;
		}
		if (strengthScore <= 17) {
			return 4;
		}
		return 5;
	}
	
	public int getAdditionalSpokenLanguagesNumber() {
		if (intelligenceScore <= 12) {
			return 0;
		}
		if (intelligenceScore <= 15) {
			return 1;
		}
		if (intelligenceScore <= 17) {
			return 2;
		}
		return 3;
	}
	
	public LiteracyLevel getLiteracy() {
		if (intelligenceScore <= 5) {
			return LiteracyLevel.Illiterate;
		}
		if (intelligenceScore <= 8) {
			return LiteracyLevel.Basic;
		}
		return LiteracyLevel.Literate;
	}
	
	private int getMagicSaveModifier() {
		return mapScoreToModifier(wisdomScore);
	}
	
	private int getArmorClassModifier() {
		return mapScoreToModifier(dexterityScore);
	}
	
	private int getMissileModifier() {
		return mapScoreToModifier(dexterityScore);
	}
	
	private int getInitiativeModifier() {
		if (dexterityScore == 3) {
			return -2;
		}
		if (dexterityScore <= 8) {
			return -1;
		}
		if (dexterityScore <= 12) {
			return 0;
		}
		if (dexterityScore <= 17) {
			return 1;
		}
		return 2;
	}
	
	private int getHitPointsModifier() {
		return mapScoreToModifier(constitutionScore);
	}
	
	public int getNpcReactionModifier() {
		if (intelligenceScore <= 12) {
			return 0;
		}
		if (intelligenceScore <= 15) {
			return 1;
		}
		if (intelligenceScore <= 17) {
			return 2;
		}
		return 3;
	}
	
	private int mapScoreToModifier(int score) {
		if (score == 3) {
			return -3;
		}
		if (score <= 5) {
			return -2;
		}
		if (score <= 8) {
			return -1;
		}
		if (score <= 12) {
			return 0;
		}
		if (score <= 15) {
			return 1;
		}
		if (score <= 17) {
			return 2;
		}
		return 3;
	}
	
	public enum LiteracyLevel{
		Illiterate,
		Basic,
		Literate
	}
}
