package chargen.ose;

import java.util.Random;

import chargen.Character;
import lombok.Data;

@Data
public class OseCharacter extends Character{
	
	private int getMeleeModifier() {
		return mapScoreToModifier(getAbilityScore("strength"));
	}
	
	private int getOpenDoorsChance() {
		if (getAbilityScore("strength") <= 8) {
			return 1;
		}
		if (getAbilityScore("strength") <= 12) {
			return 2;
		}
		if (getAbilityScore("strength") <= 15) {
			return 3;
		}
		if (getAbilityScore("strength") <= 17) {
			return 4;
		}
		return 5;
	}
	
	public int getAdditionalSpokenLanguagesNumber() {
		if (getAbilityScore("intelligence") <= 12) {
			return 0;
		}
		if (getAbilityScore("intelligence") <= 15) {
			return 1;
		}
		if (getAbilityScore("intelligence") <= 17) {
			return 2;
		}
		return 3;
	}
	
	public LiteracyLevel getLiteracy() {
		if (getAbilityScore("intelligence") <= 5) {
			return LiteracyLevel.Illiterate;
		}
		if (getAbilityScore("intelligence") <= 8) {
			return LiteracyLevel.Basic;
		}
		return LiteracyLevel.Literate;
	}
	
	private int getMagicSaveModifier() {
		return mapScoreToModifier(getAbilityScore("wisdom"));
	}
	
	private int getArmorClassModifier() {
		return mapScoreToModifier(getAbilityScore("dexterity"));
	}
	
	private int getMissileModifier() {
		return mapScoreToModifier(getAbilityScore("dexterity"));
	}
	
	private int getInitiativeModifier() {
		if (getAbilityScore("dexterity") == 3) {
			return -2;
		}
		if (getAbilityScore("dexterity") <= 8) {
			return -1;
		}
		if (getAbilityScore("dexterity") <= 12) {
			return 0;
		}
		if (getAbilityScore("dexterity") <= 17) {
			return 1;
		}
		return 2;
	}
	
	private int getHitPointsModifier() {
		return mapScoreToModifier(getAbilityScore("constitution"));
	}
	
	public int getNpcReactionModifier() {
		if (getAbilityScore("intelligence") <= 12) {
			return 0;
		}
		if (getAbilityScore("intelligence") <= 15) {
			return 1;
		}
		if (getAbilityScore("intelligence") <= 17) {
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
