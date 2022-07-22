public class Utils {

    public static void updateUnknownAbilities(Character character, abilityEnum[] abilities) {
        for (int i = 0; i < abilities.length; i++) {
            switch (abilities[i]) {
                case constitution -> character.abilities.setConstitution(character.abilities.getConstitution() + 1);
                case strength -> character.abilities.setStrength(character.abilities.getStrength() + 1);
                case athletics -> character.abilities.setAthletics(character.abilities.getAthletics() + 1);
                case dexterity -> character.abilities.setDexterity(character.abilities.getDexterity() + 1);
                case sleightOfHand -> character.abilities.setSleightOfHand(character.abilities.getSleightOfHand() + 1);
                case stealth -> character.abilities.setStealth(character.abilities.getStealth() + 1);
                case intelligence -> character.abilities.setIntelligence(character.abilities.getIntelligence() + 1);
                case arcana -> character.abilities.setArcana(character.abilities.getArcana() + 1);
                case history -> character.abilities.setHistory(character.abilities.getHistory() + 1);
                case investigation -> character.abilities.setInvestigation(character.abilities.getInvestigation() + 1);
                case nature -> character.abilities.setNature(character.abilities.getNature() + 1);
                case religion -> character.abilities.setReligion(character.abilities.getReligion() + 1);
                case wisdom -> character.abilities.setWisdom(character.abilities.getWisdom() + 1);
                case animalHandling -> character.abilities.setAnimalHandling(character.abilities.getAnimalHandling() + 1);
                case insight -> character.abilities.setInsight(character.abilities.getInsight() + 1);
                case medecine -> character.abilities.setMedecine(character.abilities.getMedecine() + 1);
                case perception -> character.abilities.setPerception(character.abilities.getPerception() +1 );
                case survival -> character.abilities.setSurvival(character.abilities.getSurvival() + 1);
                case charisma -> character.abilities.setCharisma(character.abilities.getCharisma() + 1);
                case deception -> character.abilities.setDeception(character.abilities.getDeception() + 1);
                case intimidation -> character.abilities.setIntimidation(character.abilities.getIntimidation() + 1);
                case performance -> character.abilities.setPerformance(character.abilities.getPerformance() + 1);
                case persuasion -> character.abilities.setPersuasion(character.abilities.getPersuasion() + 1);
            }
        }
    }
}
