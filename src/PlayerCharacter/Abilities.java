package PlayerCharacter;

public class Abilities {
    int constitution;
    int strength;
    int athletics;
    int dexterity;
    int acrobatics;
    int sleightOfHand;
    int stealth;
    int intelligence;
    int arcana;
    int history;
    int investigation;
    int nature;
    int religion;
    int wisdom;
    int animalHandling;
    int insight;
    int medecine;
    int perception;
    int survival;
    int charisma;
    int deception;
    int intimidation;
    int performance;
    int persuasion;

    public Abilities(int constitution, int strength, int dexterity, int intelligence, int wisdom, int charisma) {
        this.constitution = constitution;
        this.strength = strength;
        this.athletics = strength;
        this.dexterity = dexterity;
        this.acrobatics = dexterity;
        this.sleightOfHand = dexterity;
        this.stealth = dexterity;
        this.intelligence = intelligence;
        this.arcana = intelligence;
        this.history = intelligence;
        this.investigation = intelligence;
        this.nature = intelligence;
        this.religion = intelligence;
        this.wisdom = wisdom;
        this.animalHandling = wisdom;
        this.insight = wisdom;
        this.medecine = wisdom;
        this.perception = wisdom;
        this.survival = wisdom;
        this.charisma = charisma;
        this.deception = charisma;
        this.intimidation = charisma;
        this.performance = charisma;
        this.persuasion = charisma;
    }

    protected int getAbilityModifier(int abilityScore) {
        int abilityMod = 0;
        switch (abilityScore) {
            case 1 -> {
                abilityMod = -5;
            }
            case 2, 3 -> {
                abilityMod = -4;
            }
            case 4, 5 -> {
                abilityMod = -3;
            }
            case 6, 7 -> {
                abilityMod = -2;
            }
            case 8, 9 -> {
                abilityMod = -1;
            }
            case 12, 13 -> {
                abilityMod = 1;
            }
            case 14, 15 -> {
                abilityMod = 2;
            }
            case 16, 17 -> {
                abilityMod = 3;
            }
            case 18, 19 -> {
                abilityMod = 4;
            }
            case 20, 21 -> {
                abilityMod = 5;
            }
            case 22, 23 -> {
                abilityMod = 6;
            }
            case 24, 25 -> {
                abilityMod = 7;
            }
            case 26, 27 -> {
                abilityMod = 8;
            }
            case 28, 29 -> {
                abilityMod = 9;
            }
            case 30 -> {
                abilityMod = 10;
            }
        }
        return abilityMod;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }
    public int getCharisma() {
        return charisma;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getAthletics() {
        return athletics;
    }

    public void setAthletics(int athletics) {
        this.athletics = athletics;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setAcrobatics(int acrobatics) {
        this.acrobatics = acrobatics;
    }

    public int getAcrobatics() {
        return acrobatics;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getSleightOfHand() {
        return sleightOfHand;
    }

    public void setSleightOfHand(int sleightOfHand) {
        this.sleightOfHand = sleightOfHand;
    }

    public int getStealth() {
        return stealth;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getArcana() {
        return arcana;
    }

    public void setArcana(int arcana) {
        this.arcana = arcana;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    public int getInvestigation() {
        return investigation;
    }

    public void setInvestigation(int investigation) {
        this.investigation = investigation;
    }

    public int getNature() {
        return nature;
    }

    public void setNature(int nature) {
        this.nature = nature;
    }

    public int getReligion() {
        return religion;
    }

    public void setReligion(int religion) {
        this.religion = religion;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getAnimalHandling() { return animalHandling; }

    public void setAnimalHandling(int animalHandling) { this.animalHandling = animalHandling; }

    public int getInsight() {
        return insight;
    }

    public void setInsight(int insight) {
        this.insight = insight;
    }

    public int getMedecine() {
        return medecine;
    }

    public void setMedecine(int medecine) {
        this.medecine = medecine;
    }

    public int getPerception() {
        return perception;
    }

    public void setPerception(int perception) {
        this.perception = perception;
    }

    public int getSurvival() {
        return survival;
    }

    public void setSurvival(int survival) {
        this.survival = survival;
    }

    public int getDeception() {
        return deception;
    }

    public void setDeception(int deception) {
        this.deception = deception;
    }

    public int getIntimidation() {
        return intimidation;
    }

    public void setIntimidation(int intimidation) {
        this.intimidation = intimidation;
    }

    public int getPerformance() {
        return performance;
    }

    public void setPerformance(int performance) {
        this.performance = performance;
    }

    public int getPersuasion() {
        return persuasion;
    }

    public void setPersuasion(int persuasion) {
        this.persuasion = persuasion;
    }


}
