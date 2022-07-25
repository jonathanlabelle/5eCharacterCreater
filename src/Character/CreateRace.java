package Character;

import Items.*;
import Rules.DamageTypes;
import Spells.Spells;

import java.util.ArrayList;
import java.util.Arrays;

enum Ancestries { black, blue, brass, bronze, copper, gold, green, red, silver, white }
/*
TODO ROCK GNOME character.proficiencies.add(Items11.thinkersTool);
 */
public class CreateRace {

    /*
    Method for the races with no subraces: Half-orc
     */
    public static void createRace(Character character, Races race) {
        switch (race) {
            case halfOrc -> createHalfOrc(character);
        }
    }

    /*
    Method to create a dwarf, elf (except wood), gnome, halfling and tiefling
     */
    public static void createRace(Character character, Subraces subrace) {
        switch (subrace) {
            case mountainDwarf, hillDwarf -> createDwarf(character, subrace);
            case woodElf, drow -> createElf(character, subrace);
            case rockGnome, forestGnome -> createGnome(character, subrace);
            case lightfoot, stout -> createHalfling(character, subrace);
            case asmodeus -> createTiefling(character, subrace);
        }
    }

    /*
    Method to create a race with extra languages : High-elves and human
     */
    public static void createRace(Character character, Races race, Languages extraLanguage) {
        switch (race) {
            case elf -> createElf(character, race, extraLanguage);
            case human -> createHuman(character, race, extraLanguage);
        }
    }

    /*
    Method to create a half-elf (extra abilities, proficiencies and language)
     */
    public static void createRace(Character character, Languages extraLanguage,
                                  abilityEnum extraAbility1, abilityEnum extraAbility2, abilityEnum extraProficiency1,
                                  abilityEnum extraProficiency2) {
        createHalfElf(character, extraLanguage, extraAbility1, extraAbility2, extraProficiency1, extraProficiency2);
    }

    /*
    Method for creation of a Dragonborn (extra ancestry)
     */
    public static void createRace(Races race, Character character, Ancestries ancestry){
        if (race == Races.dragonborn){
            character.setRace(race);
            createDragonborn(character, ancestry);
        }
    }

    private static void createDragonborn(Character character, Ancestries ancestry){
        character.getAbilities().setStrength(character.getAbilities().getStrength() + 2);
        character.getAbilities().setCharisma(character.getAbilities().getCharisma() + 1);
        character.addToLanguages(Languages.draconic);
        character.setSize(Sizes.medium);
        character.setSpeed(30);
        character.addToOtherAbilities("breath-weapon");
        switch (ancestry) {
            case black, copper -> character.addToResistances(DamageTypes.acid);
            case blue, bronze -> character.addToResistances(DamageTypes.lightning);
            case brass, gold, red -> character.addToResistances(DamageTypes.fire);
            case green -> character.addToResistances(DamageTypes.poison);
            case silver, white -> character.addToResistances(DamageTypes.cold);
        }
        character.setDarkvision(false);

    }

    private static void createDwarf(Character character, Subraces subrace) {
        character.setRace(Races.dwarf);
        character.setSubrace(subrace);
        character.setSize(Sizes.medium);
        character.setSpeed(25);
        character.setDarkvision(true);
        character.getAbilities().setConstitution(character.getAbilities().getConstitution() + 2);
        character.addToResistances(DamageTypes.poison);
        character.addToAdvantageAgainst(DamageTypes.poison);
        character.addToOtherAbilities("Stonecuning");
        ArrayList<Languages> languages = new ArrayList<Languages>(Arrays.asList(Languages.common, Languages.dwarvish));
        Character.addMultipleLanguages(character, languages);
        ArrayList<Object> proficiencies = new ArrayList<Object>(Arrays.asList(WeaponTypes.battleaxe, WeaponTypes.handaxe,
                WeaponTypes.handaxe, WeaponTypes.warharmmer));
        Character.addMultipleProficiencies(character, proficiencies);
        if (subrace == Subraces.mountainDwarf) {
            character.getAbilities().setStrength(character.getAbilities().getStrength() + 2);
            proficiencies = new ArrayList<Object>(Arrays.asList(ArmorTypes.lightArmor, ArmorTypes.mediumArmor));
            Character.addMultipleProficiencies(character, proficiencies);
        } else {
            character.getAbilities().setWisdom(character.getAbilities().getWisdom() + 1);
            character.setHp(character.getHp() + 1);
        }
    }

    private static void createGnome(Character character, Subraces subrace) {
        character.setRace(Races.gnome);
        character.setSubrace(subrace);
        character.setSize(Sizes.small);
        character.setSpeed(25);
        character.setDarkvision(true);
        character.addToOtherAbilities("Gnome cunning");
        ArrayList<Languages> languages = new ArrayList<Languages>(Arrays.asList(Languages.common, Languages.gnomish));
        Character.addMultipleLanguages(character, languages);
        if (subrace == Subraces.forestGnome) {
            character.getAbilities().setDexterity(character.getAbilities().getDexterity() + 1);
            character.addToOtherAbilities("Speak with animals");
            character.addToSpells(Spells.minorIllusion);
        } else {
            character.getAbilities().setConstitution(character.getAbilities().getConstitution() + 1);
            character.addToOtherAbilities("Artificer's lore");
            character.addToOtherAbilities("Tinker");
        }
    }

    /*
    Creates a wood elf or a drow
     */
    private static void createElf(Character character, Subraces subrace) {
        character.setRace(Races.elf);
        character.setSubrace(subrace);
        character.getAbilities().setDexterity(character.getAbilities().getDexterity() + 2);
        character.setSize(Sizes.medium);
        character.setSpeed(30);
        character.setDarkvision(true);
        ArrayList<Languages> languages = new ArrayList<Languages>(Arrays.asList(Languages.common, Languages.elvish));
        Character.addMultipleLanguages(character, languages);
        ArrayList<Object> proficiencies = new ArrayList<Object>(Arrays.asList(abilityEnum.perception));
        Character.addMultipleProficiencies(character, proficiencies);
        character.addToAdvantageAgainst(Conditions.charmed);
        character.addToOtherAbilities("Can't be put asleep by magic");
        if (subrace == Subraces.woodElf) {
            character.getAbilities().setWisdom(character.getAbilities().getWisdom() + 1);
            character.setSpeed(35);
            proficiencies = new ArrayList<Object>(Arrays.asList(WeaponTypes.longsword, WeaponTypes.shortsword,
                    WeaponTypes.shortbow, WeaponTypes.longbow));
            Character.addMultipleProficiencies(character, proficiencies);
            character.addToOtherAbilities("Mask of the wild");
        } else {
            character.addToOtherAbilities("Superior darkvision");
            character.addToOtherAbilities("Drow magic");
            proficiencies = new ArrayList<Object>(Arrays.asList(WeaponTypes.rapier, WeaponTypes.shortsword,
                    WeaponTypes.handCrossbow));
            Character.addMultipleProficiencies(character, proficiencies);
            character.getAbilities().setCharisma(character.getAbilities().getCharisma() + 1);
        }
    }

    /*
    overloaded createElf method to create a High elf with an extre language
     */
    private static void createElf(Character character, Races race, Languages extraLanguage) {
        character.setRace(race);
        character.setSubrace(Subraces.highElf);
        character.getAbilities().setDexterity(character.getAbilities().getDexterity() + 2);
        character.setSize(Sizes.medium);
        character.setSpeed(30);
        character.setDarkvision(true);
        ArrayList<Languages> languages = new ArrayList<Languages>(Arrays.asList(Languages.common, Languages.elvish,
                extraLanguage));
        Character.addMultipleLanguages(character, languages);
        ArrayList<Object> proficiencies = new ArrayList<Object>(Arrays.asList(abilityEnum.perception));
        Character.addMultipleProficiencies(character, proficiencies);
        character.addToAdvantageAgainst(Conditions.charmed);
        character.addToOtherAbilities("Can't be put asleep by magic");
        character.getAbilities().setIntelligence(character.getAbilities().getIntelligence() + 1);
        proficiencies = new ArrayList<Object>(Arrays.asList(WeaponTypes.longsword, WeaponTypes.shortsword,
                WeaponTypes.shortbow, WeaponTypes.longbow));
        Character.addMultipleProficiencies(character, proficiencies);
    }

    private static void createHalfElf(Character character, Languages extraLanguage, abilityEnum ability1,
                                      abilityEnum ability2, abilityEnum extraProficiency1,
                                      abilityEnum extraProficiency2) {
        character.getAbilities().setCharisma(character.getAbilities().getCharisma() + 2);
        character.setSize(Sizes.medium);
        character.setSpeed(30);
        character.setDarkvision(true);
        character.addToProficiencies(extraProficiency1);
        character.addToProficiencies(extraProficiency2);
        ArrayList<Languages> languages = new ArrayList<Languages>(Arrays.asList(Languages.common, Languages.elvish,
                extraLanguage));
        Character.addMultipleLanguages(character, languages);
        abilityEnum[] abilities = new abilityEnum[]{ability1, ability2};
        Utils.updateUnknownAbilities(character, abilities);
        character.addToAdvantageAgainst(Conditions.charmed);
        character.addToOtherAbilities("Magic can't put you to sleep");
    }

    private static void createHalfOrc(Character character) {
        character.setRace(Races.halfOrc);
        character.setSize(Sizes.medium);
        character.setSpeed(30);
        character.setDarkvision(true);
        character.addToProficiencies(abilityEnum.intimidation);
        character.addToOtherAbilities("Relentless endurance");
        character.addToOtherAbilities("Savage Attacks");
        ArrayList<Languages> languages = new ArrayList<Languages>(Arrays.asList(Languages.common, Languages.orc));
        Character.addMultipleLanguages(character, languages);
    }

    private static void createHalfling(Character character, Subraces subrace) {
        character.setRace(Races.halfling);
        character.setSubrace(subrace);
        character.setSize(Sizes.small);
        character.setSpeed(25);
        character.setDarkvision(false);
        character.getAbilities().setDexterity(character.getAbilities().getDexterity() + 2);
        character.addToOtherAbilities("Lucky");
        character.addToOtherAbilities("Brave");
        character.addToOtherAbilities("Nimble");
        ArrayList<Languages> languages = new ArrayList<Languages>(Arrays.asList(Languages.common, Languages.halfling));
        Character.addMultipleLanguages(character, languages);
        if (subrace == Subraces.lightfoot) {
            character.getAbilities().setCharisma(character.getAbilities().getCharisma() + 1);
            character.addToOtherAbilities("Naturaly Stealthy");
        } else {
            character.getAbilities().setConstitution(character.getAbilities().getConstitution() + 1);
            character.addToResistances(DamageTypes.poison);
            character.addToAdvantageAgainst(DamageTypes.poison);
        }
    }

    private static void createHuman(Character character, Races race, Languages extraLanguage) {
        character.setRace(race);
        character.setSize(Sizes.medium);
        character.setSpeed(30);
        character.setDarkvision(false);
        ArrayList<Languages> languages = new ArrayList<Languages>(Arrays.asList(Languages.common, extraLanguage));
        Character.addMultipleLanguages(character, languages);
        character.getAbilities().setConstitution(character.getAbilities().getConstitution() + 1);
        character.getAbilities().setStrength(character.getAbilities().getStrength() + 1);
        character.getAbilities().setDexterity(character.getAbilities().getDexterity() + 1);
        character.getAbilities().setIntelligence(character.getAbilities().getIntelligence() + 1);
        character.getAbilities().setWisdom(character.getAbilities().getWisdom() + 1);
        character.getAbilities().setCharisma(character.getAbilities().getCharisma() + 1);
    }

    private static void createTiefling(Character character, Subraces subrace) {
        character.setRace(Races.tiefling);
        character.setSubrace(subrace);
        character.setSize(Sizes.medium);
        character.setSpeed(30);
        character.setDarkvision(false);
        character.getAbilities().setCharisma(character.getAbilities().getCharisma() + 2);
        character.addToResistances(DamageTypes.fire);
        ArrayList<Languages> languages = new ArrayList<Languages>(Arrays.asList(Languages.common, Languages.infernal));
        Character.addMultipleLanguages(character, languages);
        if (subrace == Subraces.asmodeus) {
            character.getAbilities().setIntelligence(character.getAbilities().getIntelligence() + 1);
        }
    }
}
