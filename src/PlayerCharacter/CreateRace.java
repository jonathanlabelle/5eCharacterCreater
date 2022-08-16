package PlayerCharacter;

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
    public static void createRace(PlayerCharacter playerCharacter, Races race) {
        switch (race) {
            case halfOrc -> createHalfOrc(playerCharacter);
        }
    }

    /*
    Method to create a dwarf, elf (except wood), gnome, halfling and tiefling
     */
    public static void createRace(PlayerCharacter playerCharacter, Subraces subrace) {
        switch (subrace) {
            case mountainDwarf, hillDwarf -> createDwarf(playerCharacter, subrace);
            case woodElf, drow -> createElf(playerCharacter, subrace);
            case rockGnome, forestGnome -> createGnome(playerCharacter, subrace);
            case lightfoot, stout -> createHalfling(playerCharacter, subrace);
            case asmodeus -> createTiefling(playerCharacter, subrace);
        }
    }

    /*
    Method to create a race with extra languages : High-elves and human
     */
    public static void createRace(PlayerCharacter playerCharacter, Races race, Languages extraLanguage) {
        switch (race) {
            case elf -> createElf(playerCharacter, race, extraLanguage);
            case human -> createHuman(playerCharacter, race, extraLanguage);
        }
    }

    /*
    Method to create a half-elf (extra abilities, proficiencies and language)
     */
    public static void createRace(PlayerCharacter playerCharacter, Languages extraLanguage,
                                  abilityEnum extraAbility1, abilityEnum extraAbility2, abilityEnum extraProficiency1,
                                  abilityEnum extraProficiency2) {
        createHalfElf(playerCharacter, extraLanguage, extraAbility1, extraAbility2, extraProficiency1, extraProficiency2);
    }

    /*
    Method for creation of a Dragonborn (extra ancestry)
     */
    public static void createRace(Races race, PlayerCharacter playerCharacter, Ancestries ancestry){
        if (race == Races.dragonborn){
            playerCharacter.setRace(race);
            createDragonborn(playerCharacter, ancestry);
        }
    }

    private static void createDragonborn(PlayerCharacter playerCharacter, Ancestries ancestry){
        playerCharacter.getAbilities().setStrength(playerCharacter.getAbilities().getStrength() + 2);
        playerCharacter.getAbilities().setCharisma(playerCharacter.getAbilities().getCharisma() + 1);
        playerCharacter.addToLanguages(Languages.draconic);
        playerCharacter.setSize(Sizes.medium);
        playerCharacter.setSpeed(30);
        playerCharacter.addToOtherAbilities("breath-weapon");
        switch (ancestry) {
            case black, copper -> playerCharacter.addToResistances(DamageTypes.acid);
            case blue, bronze -> playerCharacter.addToResistances(DamageTypes.lightning);
            case brass, gold, red -> playerCharacter.addToResistances(DamageTypes.fire);
            case green -> playerCharacter.addToResistances(DamageTypes.poison);
            case silver, white -> playerCharacter.addToResistances(DamageTypes.cold);
        }
        playerCharacter.setDarkvision(false);

    }

    private static void createDwarf(PlayerCharacter playerCharacter, Subraces subrace) {
        playerCharacter.setRace(Races.dwarf);
        playerCharacter.setSubrace(subrace);
        playerCharacter.setSize(Sizes.medium);
        playerCharacter.setSpeed(25);
        playerCharacter.setDarkvision(true);
        playerCharacter.getAbilities().setConstitution(playerCharacter.getAbilities().getConstitution() + 2);
        playerCharacter.addToResistances(DamageTypes.poison);
        playerCharacter.addToAdvantageAgainst(DamageTypes.poison);
        playerCharacter.addToOtherAbilities("Stonecuning");
        ArrayList<Languages> languages = new ArrayList<Languages>(Arrays.asList(Languages.common, Languages.dwarvish));
        PlayerCharacter.addMultipleLanguages(playerCharacter, languages);
        ArrayList<Object> proficiencies = new ArrayList<Object>(Arrays.asList(WeaponTypes.battleaxe, WeaponTypes.handaxe,
                WeaponTypes.handaxe, WeaponTypes.warharmmer));
        PlayerCharacter.addMultipleProficiencies(playerCharacter, proficiencies);
        if (subrace == Subraces.mountainDwarf) {
            playerCharacter.getAbilities().setStrength(playerCharacter.getAbilities().getStrength() + 2);
            proficiencies = new ArrayList<Object>(Arrays.asList(ArmorTypes.lightArmor, ArmorTypes.mediumArmor));
            PlayerCharacter.addMultipleProficiencies(playerCharacter, proficiencies);
        } else {
            playerCharacter.getAbilities().setWisdom(playerCharacter.getAbilities().getWisdom() + 1);
            playerCharacter.setHp(playerCharacter.getHp() + 1);
        }
    }

    private static void createGnome(PlayerCharacter playerCharacter, Subraces subrace) {
        playerCharacter.setRace(Races.gnome);
        playerCharacter.setSubrace(subrace);
        playerCharacter.setSize(Sizes.small);
        playerCharacter.setSpeed(25);
        playerCharacter.setDarkvision(true);
        playerCharacter.addToOtherAbilities("Gnome cunning");
        ArrayList<Languages> languages = new ArrayList<Languages>(Arrays.asList(Languages.common, Languages.gnomish));
        PlayerCharacter.addMultipleLanguages(playerCharacter, languages);
        if (subrace == Subraces.forestGnome) {
            playerCharacter.getAbilities().setDexterity(playerCharacter.getAbilities().getDexterity() + 1);
            playerCharacter.addToOtherAbilities("Speak with animals");
            playerCharacter.addToSpells(Spells.minorIllusion);
        } else {
            playerCharacter.getAbilities().setConstitution(playerCharacter.getAbilities().getConstitution() + 1);
            playerCharacter.addToOtherAbilities("Artificer's lore");
            playerCharacter.addToOtherAbilities("Tinker");
        }
    }

    /*
    Creates a wood elf or a drow
     */
    private static void createElf(PlayerCharacter playerCharacter, Subraces subrace) {
        playerCharacter.setRace(Races.elf);
        playerCharacter.setSubrace(subrace);
        playerCharacter.getAbilities().setDexterity(playerCharacter.getAbilities().getDexterity() + 2);
        playerCharacter.setSize(Sizes.medium);
        playerCharacter.setSpeed(30);
        playerCharacter.setDarkvision(true);
        ArrayList<Languages> languages = new ArrayList<Languages>(Arrays.asList(Languages.common, Languages.elvish));
        PlayerCharacter.addMultipleLanguages(playerCharacter, languages);
        ArrayList<Object> proficiencies = new ArrayList<Object>(Arrays.asList(abilityEnum.perception));
        PlayerCharacter.addMultipleProficiencies(playerCharacter, proficiencies);
        playerCharacter.addToAdvantageAgainst(Conditions.charmed);
        playerCharacter.addToOtherAbilities("Can't be put asleep by magic");
        if (subrace == Subraces.woodElf) {
            playerCharacter.getAbilities().setWisdom(playerCharacter.getAbilities().getWisdom() + 1);
            playerCharacter.setSpeed(35);
            proficiencies = new ArrayList<Object>(Arrays.asList(WeaponTypes.longsword, WeaponTypes.shortsword,
                    WeaponTypes.shortbow, WeaponTypes.longbow));
            PlayerCharacter.addMultipleProficiencies(playerCharacter, proficiencies);
            playerCharacter.addToOtherAbilities("Mask of the wild");
        } else {
            playerCharacter.addToOtherAbilities("Superior darkvision");
            playerCharacter.addToOtherAbilities("Drow magic");
            proficiencies = new ArrayList<Object>(Arrays.asList(WeaponTypes.rapier, WeaponTypes.shortsword,
                    WeaponTypes.handCrossbow));
            PlayerCharacter.addMultipleProficiencies(playerCharacter, proficiencies);
            playerCharacter.getAbilities().setCharisma(playerCharacter.getAbilities().getCharisma() + 1);
        }
    }

    /*
    overloaded createElf method to create a High elf with an extre language
     */
    private static void createElf(PlayerCharacter playerCharacter, Races race, Languages extraLanguage) {
        playerCharacter.setRace(race);
        playerCharacter.setSubrace(Subraces.highElf);
        playerCharacter.getAbilities().setDexterity(playerCharacter.getAbilities().getDexterity() + 2);
        playerCharacter.setSize(Sizes.medium);
        playerCharacter.setSpeed(30);
        playerCharacter.setDarkvision(true);
        ArrayList<Languages> languages = new ArrayList<Languages>(Arrays.asList(Languages.common, Languages.elvish,
                extraLanguage));
        PlayerCharacter.addMultipleLanguages(playerCharacter, languages);
        ArrayList<Object> proficiencies = new ArrayList<Object>(Arrays.asList(abilityEnum.perception));
        PlayerCharacter.addMultipleProficiencies(playerCharacter, proficiencies);
        playerCharacter.addToAdvantageAgainst(Conditions.charmed);
        playerCharacter.addToOtherAbilities("Can't be put asleep by magic");
        playerCharacter.getAbilities().setIntelligence(playerCharacter.getAbilities().getIntelligence() + 1);
        proficiencies = new ArrayList<Object>(Arrays.asList(WeaponTypes.longsword, WeaponTypes.shortsword,
                WeaponTypes.shortbow, WeaponTypes.longbow));
        PlayerCharacter.addMultipleProficiencies(playerCharacter, proficiencies);
    }

    private static void createHalfElf(PlayerCharacter playerCharacter, Languages extraLanguage, abilityEnum ability1,
                                      abilityEnum ability2, abilityEnum extraProficiency1,
                                      abilityEnum extraProficiency2) {
        playerCharacter.getAbilities().setCharisma(playerCharacter.getAbilities().getCharisma() + 2);
        playerCharacter.setSize(Sizes.medium);
        playerCharacter.setSpeed(30);
        playerCharacter.setDarkvision(true);
        playerCharacter.addToProficiencies(extraProficiency1);
        playerCharacter.addToProficiencies(extraProficiency2);
        ArrayList<Languages> languages = new ArrayList<Languages>(Arrays.asList(Languages.common, Languages.elvish,
                extraLanguage));
        PlayerCharacter.addMultipleLanguages(playerCharacter, languages);
        abilityEnum[] abilities = new abilityEnum[]{ability1, ability2};
        Utils.updateUnknownAbilities(playerCharacter, abilities);
        playerCharacter.addToAdvantageAgainst(Conditions.charmed);
        playerCharacter.addToOtherAbilities("Magic can't put you to sleep");
    }

    private static void createHalfOrc(PlayerCharacter playerCharacter) {
        playerCharacter.setRace(Races.halfOrc);
        playerCharacter.setSize(Sizes.medium);
        playerCharacter.setSpeed(30);
        playerCharacter.setDarkvision(true);
        playerCharacter.addToProficiencies(abilityEnum.intimidation);
        playerCharacter.addToOtherAbilities("Relentless endurance");
        playerCharacter.addToOtherAbilities("Savage Attacks");
        ArrayList<Languages> languages = new ArrayList<Languages>(Arrays.asList(Languages.common, Languages.orc));
        PlayerCharacter.addMultipleLanguages(playerCharacter, languages);
    }

    private static void createHalfling(PlayerCharacter playerCharacter, Subraces subrace) {
        playerCharacter.setRace(Races.halfling);
        playerCharacter.setSubrace(subrace);
        playerCharacter.setSize(Sizes.small);
        playerCharacter.setSpeed(25);
        playerCharacter.setDarkvision(false);
        playerCharacter.getAbilities().setDexterity(playerCharacter.getAbilities().getDexterity() + 2);
        playerCharacter.addToOtherAbilities("Lucky");
        playerCharacter.addToOtherAbilities("Brave");
        playerCharacter.addToOtherAbilities("Nimble");
        ArrayList<Languages> languages = new ArrayList<Languages>(Arrays.asList(Languages.common, Languages.halfling));
        PlayerCharacter.addMultipleLanguages(playerCharacter, languages);
        if (subrace == Subraces.lightfoot) {
            playerCharacter.getAbilities().setCharisma(playerCharacter.getAbilities().getCharisma() + 1);
            playerCharacter.addToOtherAbilities("Naturaly Stealthy");
        } else {
            playerCharacter.getAbilities().setConstitution(playerCharacter.getAbilities().getConstitution() + 1);
            playerCharacter.addToResistances(DamageTypes.poison);
            playerCharacter.addToAdvantageAgainst(DamageTypes.poison);
        }
    }

    private static void createHuman(PlayerCharacter playerCharacter, Races race, Languages extraLanguage) {
        playerCharacter.setRace(race);
        playerCharacter.setSize(Sizes.medium);
        playerCharacter.setSpeed(30);
        playerCharacter.setDarkvision(false);
        ArrayList<Languages> languages = new ArrayList<Languages>(Arrays.asList(Languages.common, extraLanguage));
        PlayerCharacter.addMultipleLanguages(playerCharacter, languages);
        playerCharacter.getAbilities().setConstitution(playerCharacter.getAbilities().getConstitution() + 1);
        playerCharacter.getAbilities().setStrength(playerCharacter.getAbilities().getStrength() + 1);
        playerCharacter.getAbilities().setDexterity(playerCharacter.getAbilities().getDexterity() + 1);
        playerCharacter.getAbilities().setIntelligence(playerCharacter.getAbilities().getIntelligence() + 1);
        playerCharacter.getAbilities().setWisdom(playerCharacter.getAbilities().getWisdom() + 1);
        playerCharacter.getAbilities().setCharisma(playerCharacter.getAbilities().getCharisma() + 1);
    }

    private static void createTiefling(PlayerCharacter playerCharacter, Subraces subrace) {
        playerCharacter.setRace(Races.tiefling);
        playerCharacter.setSubrace(subrace);
        playerCharacter.setSize(Sizes.medium);
        playerCharacter.setSpeed(30);
        playerCharacter.setDarkvision(false);
        playerCharacter.getAbilities().setCharisma(playerCharacter.getAbilities().getCharisma() + 2);
        playerCharacter.addToResistances(DamageTypes.fire);
        ArrayList<Languages> languages = new ArrayList<Languages>(Arrays.asList(Languages.common, Languages.infernal));
        PlayerCharacter.addMultipleLanguages(playerCharacter, languages);
        if (subrace == Subraces.asmodeus) {
            playerCharacter.getAbilities().setIntelligence(playerCharacter.getAbilities().getIntelligence() + 1);
        }
    }
}
