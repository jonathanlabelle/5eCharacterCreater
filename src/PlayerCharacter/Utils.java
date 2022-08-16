package PlayerCharacter;

public class Utils {

    public static void updateUnknownAbilities(PlayerCharacter playerCharacter, abilityEnum[] abilities) {
        for (abilityEnum ability : abilities) {
            switch (ability) {
                case constitution -> playerCharacter.getAbilities().setConstitution(playerCharacter.getAbilities().getConstitution() + 1);
                case strength -> playerCharacter.getAbilities().setStrength(playerCharacter.getAbilities().getStrength() + 1);
                case athletics -> playerCharacter.getAbilities().setAthletics(playerCharacter.getAbilities().getAthletics() + 1);
                case dexterity -> playerCharacter.getAbilities().setDexterity(playerCharacter.getAbilities().getDexterity() + 1);
                case sleightOfHand -> playerCharacter.getAbilities().setSleightOfHand(playerCharacter.getAbilities().getSleightOfHand() + 1);
                case stealth -> playerCharacter.getAbilities().setStealth(playerCharacter.getAbilities().getStealth() + 1);
                case intelligence -> playerCharacter.getAbilities().setIntelligence(playerCharacter.getAbilities().getIntelligence() + 1);
                case arcana -> playerCharacter.getAbilities().setArcana(playerCharacter.getAbilities().getArcana() + 1);
                case history -> playerCharacter.getAbilities().setHistory(playerCharacter.getAbilities().getHistory() + 1);
                case investigation -> playerCharacter.getAbilities().setInvestigation(playerCharacter.getAbilities().getInvestigation() + 1);
                case nature -> playerCharacter.getAbilities().setNature(playerCharacter.getAbilities().getNature() + 1);
                case religion -> playerCharacter.getAbilities().setReligion(playerCharacter.getAbilities().getReligion() + 1);
                case wisdom -> playerCharacter.getAbilities().setWisdom(playerCharacter.getAbilities().getWisdom() + 1);
                case animalHandling -> playerCharacter.getAbilities().setAnimalHandling(playerCharacter.getAbilities().getAnimalHandling() + 1);
                case insight -> playerCharacter.getAbilities().setInsight(playerCharacter.getAbilities().getInsight() + 1);
                case medecine -> playerCharacter.getAbilities().setMedecine(playerCharacter.getAbilities().getMedecine() + 1);
                case perception -> playerCharacter.getAbilities().setPerception(playerCharacter.getAbilities().getPerception() +1 );
                case survival -> playerCharacter.getAbilities().setSurvival(playerCharacter.getAbilities().getSurvival() + 1);
                case charisma -> playerCharacter.getAbilities().setCharisma(playerCharacter.getAbilities().getCharisma() + 1);
                case deception -> playerCharacter.getAbilities().setDeception(playerCharacter.getAbilities().getDeception() + 1);
                case intimidation -> playerCharacter.getAbilities().setIntimidation(playerCharacter.getAbilities().getIntimidation() + 1);
                case performance -> playerCharacter.getAbilities().setPerformance(playerCharacter.getAbilities().getPerformance() + 1);
                case persuasion -> playerCharacter.getAbilities().setPersuasion(playerCharacter.getAbilities().getPersuasion() + 1);
            }
        }
    }
}
