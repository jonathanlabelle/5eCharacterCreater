import java.util.ArrayList;
import java.util.Arrays;

enum Ancestries { black, blue, brass, bronze, copper, gold, green, red, silver, white }

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
        character.abilities.setStrength(character.abilities.getStrength() + 2);
        character.abilities.setCharisma(character.abilities.getCharisma() + 1);
        character.languages.add(Languages.draconic);
        character.setSize(Sizes.medium);
        character.setSpeed(30);
        character.otherAbilities.add("breath-weapon");
        switch (ancestry) {
            case black, copper -> character.resistances.add(DamageTypes.acid);
            case blue, bronze -> character.resistances.add(DamageTypes.lightning);
            case brass, gold, red -> character.resistances.add(DamageTypes.fire);
            case green -> character.resistances.add(DamageTypes.poison);
            case silver, white -> character.resistances.add(DamageTypes.cold);
        }
        character.setDarkvision(false);

    }

    private static void createDwarf(Character character, Subraces subrace) {
        character.setRace(Races.dwarf);
        character.setSubrace(subrace);
        character.setSize(Sizes.medium);
        character.setSpeed(25);
        character.setDarkvision(true);
        character.abilities.setConstitution(character.abilities.getConstitution() + 2);
        character.resistances.add(DamageTypes.poison);
        character.advantageAgainst.add(DamageTypes.poison);
        character.otherAbilities.add("Stonecuning");
        ArrayList<Languages> languages = new ArrayList<Languages>(Arrays.asList(Languages.common, Languages.dwarvish));
        addLanguages(character, languages);
        ArrayList<Object> proficiencies = new ArrayList<Object>(Arrays.asList(WeaponTypes.battleaxe, WeaponTypes.handaxe,
                WeaponTypes.handaxe, WeaponTypes.warharmmer));
        addProficiencies(character, proficiencies);
        if (subrace == Subraces.mountainDwarf) {
            character.abilities.setStrength(character.abilities.getStrength() + 2);
            proficiencies = new ArrayList<Object>(Arrays.asList(ArmorTypes.lightArrmor, ArmorTypes.mediumArmor));
            addProficiencies(character, proficiencies);
        } else {
            character.abilities.setWisdom(character.abilities.getWisdom() + 1);
            character.setHp(character.getHp() + 1);
        }
    }

    private static void createGnome(Character character, Subraces subrace) {
        character.setRace(Races.gnome);
        character.setSubrace(subrace);
        character.setSize(Sizes.small);
        character.setSpeed(25);
        character.setDarkvision(true);
        character.otherAbilities.add("Gnome cunning");
        ArrayList<Languages> languages = new ArrayList<Languages>(Arrays.asList(Languages.common, Languages.gnomish));
        addLanguages(character, languages);
        if (subrace == Subraces.forestGnome) {
            character.abilities.setDexterity(character.abilities.getDexterity() + 1);
            character.otherAbilities.add("Speak with animals");
            character.spells.add(Spells.minorIllusion);
        } else {
            character.abilities.setConstitution(character.abilities.getConstitution() + 1);
            character.proficiencies.add(Items.thinkersTool);
            character.otherAbilities.add("Artificer's lore");
            character.otherAbilities.add("Tinker");
        }
    }

    /*
    Creates a wood elf or a drow
     */
    private static void createElf(Character character, Subraces subrace) {
        character.setRace(Races.elf);
        character.setSubrace(subrace);
        character.abilities.setDexterity(character.abilities.getDexterity() + 2);
        character.setSize(Sizes.medium);
        character.setSpeed(30);
        character.setDarkvision(true);
        ArrayList<Languages> languages = new ArrayList<Languages>(Arrays.asList(Languages.common, Languages.elvish));
        addLanguages(character, languages);
        ArrayList<Object> proficiencies = new ArrayList<Object>(Arrays.asList(abilityEnum.perception));
        addProficiencies(character, proficiencies);
        character.advantageAgainst.add(Conditions.charmed);
        character.otherAbilities.add("Can't be put asleep by magic");
        if (subrace == Subraces.woodElf) {
            character.abilities.setWisdom(character.abilities.getWisdom() + 1);
            character.setSpeed(35);
            proficiencies = new ArrayList<Object>(Arrays.asList(WeaponTypes.longsword, WeaponTypes.shortsword,
                    WeaponTypes.shortbow, WeaponTypes.longbow));
            addProficiencies(character, proficiencies);
            character.otherAbilities.add("Mask of the wild");
        } else {
            character.otherAbilities.add("Superior darkvision");
            character.otherAbilities.add("Drow magic");
            proficiencies = new ArrayList<Object>(Arrays.asList(WeaponTypes.rapier, WeaponTypes.shortsword,
                    WeaponTypes.handCrossbow));
            addProficiencies(character, proficiencies);
            character.abilities.setCharisma(character.abilities.getCharisma() + 1);
        }
    }

    /*
    overloaded createElf method to create a High elf with an extre language
     */
    private static void createElf(Character character, Races race, Languages extraLanguage) {
        character.setRace(race);
        character.setSubrace(Subraces.highElf);
        character.abilities.setDexterity(character.abilities.getDexterity() + 2);
        character.setSize(Sizes.medium);
        character.setSpeed(30);
        character.setDarkvision(true);
        ArrayList<Languages> languages = new ArrayList<Languages>(Arrays.asList(Languages.common, Languages.elvish,
                extraLanguage));
        addLanguages(character, languages);
        ArrayList<Object> proficiencies = new ArrayList<Object>(Arrays.asList(abilityEnum.perception));
        addProficiencies(character, proficiencies);
        character.advantageAgainst.add(Conditions.charmed);
        character.otherAbilities.add("Can't be put asleep by magic");
        character.abilities.setIntelligence(character.abilities.getIntelligence() + 1);
        proficiencies = new ArrayList<Object>(Arrays.asList(WeaponTypes.longsword, WeaponTypes.shortsword,
                WeaponTypes.shortbow, WeaponTypes.longbow));
        addProficiencies(character, proficiencies);
    }

    private static void createHalfElf(Character character, Languages extraLanguage, abilityEnum ability1,
                                      abilityEnum ability2, abilityEnum extraProficiency1,
                                      abilityEnum extraProficiency2) {
        character.abilities.setCharisma(character.abilities.getCharisma() + 2);
        character.setSize(Sizes.medium);
        character.setSpeed(30);
        character.setDarkvision(true);
        character.proficiencies.add(extraProficiency1);
        character.proficiencies.add(extraProficiency2);
        ArrayList<Languages> languages = new ArrayList<Languages>(Arrays.asList(Languages.common, Languages.elvish,
                extraLanguage));
        addLanguages(character, languages);
        abilityEnum[] abilities = new abilityEnum[]{ability1, ability2};
        Utils.updateUnknownAbilities(character, abilities);
        character.advantageAgainst.add(Conditions.charmed);
        character.otherAbilities.add("Magic can't put you to sleep");
    }

    private static void createHalfOrc(Character character) {
        character.setRace(Races.halfOrc);
        character.setSize(Sizes.medium);
        character.setSpeed(30);
        character.setDarkvision(true);
        character.proficiencies.add(abilityEnum.intimidation);
        character.otherAbilities.add("Relentless endurance");
        character.otherAbilities.add("Savage Attacks");
        ArrayList<Languages> languages = new ArrayList<Languages>(Arrays.asList(Languages.common, Languages.orc));
        addLanguages(character, languages);
    }

    private static void createHalfling(Character character, Subraces subrace) {
        character.setRace(Races.halfling);
        character.setSubrace(subrace);
        character.setSize(Sizes.small);
        character.setSpeed(25);
        character.setDarkvision(false);
        character.abilities.setDexterity(character.abilities.getDexterity() + 2);
        character.otherAbilities.add("Lucky");
        character.otherAbilities.add("Brave");
        character.otherAbilities.add("Nimble");
        ArrayList<Languages> languages = new ArrayList<Languages>(Arrays.asList(Languages.common, Languages.halfling));
        addLanguages(character, languages);
        if (subrace == Subraces.lightfoot) {
            character.abilities.setCharisma(character.abilities.getCharisma() + 1);
            character.otherAbilities.add("Naturaly Stealthy");
        } else {
            character.abilities.setConstitution(character.abilities.getConstitution() + 1);
            character.resistances.add(DamageTypes.poison);
            character.advantageAgainst.add(DamageTypes.poison);
        }
    }

    private static void createHuman(Character character, Races race, Languages extraLanguage) {
        character.setRace(race);
        character.setSize(Sizes.medium);
        character.setSpeed(30);
        character.setDarkvision(false);
        ArrayList<Languages> languages = new ArrayList<Languages>(Arrays.asList(Languages.common, extraLanguage));
        addLanguages(character, languages);
        character.abilities.setConstitution(character.abilities.getConstitution() + 1);
        character.abilities.setStrength(character.abilities.getStrength() + 1);
        character.abilities.setDexterity(character.abilities.getDexterity() + 1);
        character.abilities.setIntelligence(character.abilities.getIntelligence() + 1);
        character.abilities.setWisdom(character.abilities.getWisdom() + 1);
        character.abilities.setCharisma(character.abilities.getCharisma() + 1);
    }

    private static void createTiefling(Character character, Subraces subrace) {
        character.setRace(Races.tiefling);
        character.setSubrace(subrace);
        character.setSize(Sizes.medium);
        character.setSpeed(30);
        character.setDarkvision(false);
        character.abilities.setCharisma(character.abilities.getCharisma() + 2);
        character.resistances.add(DamageTypes.fire);
        ArrayList<Languages> languages = new ArrayList<Languages>(Arrays.asList(Languages.common, Languages.infernal));
        addLanguages(character, languages);
        if (subrace == Subraces.asmodeus) {
            character.abilities.setIntelligence(character.abilities.getIntelligence() + 1);
        }
    }

    private static void addLanguages (Character character, ArrayList<Languages> languages) {
        character.languages.addAll(languages);
    }

    private static void addProficiencies (Character character, ArrayList<Object> proficiencies) {
        character.proficiencies.addAll(proficiencies);
    }
}
