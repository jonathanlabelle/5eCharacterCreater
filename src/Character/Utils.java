package Character;

public class Utils {

    public static void updateUnknownAbilities(Character character, abilityEnum[] abilities) {
        for (int i = 0; i < abilities.length; i++) {
            switch (abilities[i]) {
                case constitution -> character.getAbilities().setConstitution(character.getAbilities().getConstitution() + 1);
                case strength -> character.getAbilities().setStrength(character.getAbilities().getStrength() + 1);
                case athletics -> character.getAbilities().setAthletics(character.getAbilities().getAthletics() + 1);
                case dexterity -> character.getAbilities().setDexterity(character.getAbilities().getDexterity() + 1);
                case sleightOfHand -> character.getAbilities().setSleightOfHand(character.getAbilities().getSleightOfHand() + 1);
                case stealth -> character.getAbilities().setStealth(character.getAbilities().getStealth() + 1);
                case intelligence -> character.getAbilities().setIntelligence(character.getAbilities().getIntelligence() + 1);
                case arcana -> character.getAbilities().setArcana(character.getAbilities().getArcana() + 1);
                case history -> character.getAbilities().setHistory(character.getAbilities().getHistory() + 1);
                case investigation -> character.getAbilities().setInvestigation(character.getAbilities().getInvestigation() + 1);
                case nature -> character.getAbilities().setNature(character.getAbilities().getNature() + 1);
                case religion -> character.getAbilities().setReligion(character.getAbilities().getReligion() + 1);
                case wisdom -> character.getAbilities().setWisdom(character.getAbilities().getWisdom() + 1);
                case animalHandling -> character.getAbilities().setAnimalHandling(character.getAbilities().getAnimalHandling() + 1);
                case insight -> character.getAbilities().setInsight(character.getAbilities().getInsight() + 1);
                case medecine -> character.getAbilities().setMedecine(character.getAbilities().getMedecine() + 1);
                case perception -> character.getAbilities().setPerception(character.getAbilities().getPerception() +1 );
                case survival -> character.getAbilities().setSurvival(character.getAbilities().getSurvival() + 1);
                case charisma -> character.getAbilities().setCharisma(character.getAbilities().getCharisma() + 1);
                case deception -> character.getAbilities().setDeception(character.getAbilities().getDeception() + 1);
                case intimidation -> character.getAbilities().setIntimidation(character.getAbilities().getIntimidation() + 1);
                case performance -> character.getAbilities().setPerformance(character.getAbilities().getPerformance() + 1);
                case persuasion -> character.getAbilities().setPersuasion(character.getAbilities().getPersuasion() + 1);
            }
        }
    }
}
