import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

enum Ancestries { black, blue, brass, bronze, copper, gold, green, red, silver, white }
/*
Constructor for dwarves, high elves, gnomes
 */
public class createRace {
    /*
    Constructor for the races with no subraces: Half-elf
     */

    public static void createRace(Character character, Races race) {
        switch (race) {
            case halfElf -> createHalfElf(character);
        }
    }

    public static void createRace(Character character, Subraces subrace) {
        switch (subrace) {
            case mountainDwarf, hillDwarf -> createDwarf(character, subrace);
            case highElf, woodElf, drow -> createElf(character, subrace);
            case rockGnome, forestGnome -> createGnome(character, subrace);
        }
    }
    /*
    Constructor for creation of a Dragonborn
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
        character.spells.add("breath-weapon");
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
        character.abilities.setConstitution(character.abilities.getConstitution() + 2);
        character.setSize(Sizes.medium);
        character.setSpeed(25);
        character.setDarkvision(true);
        character.resistances.add(DamageTypes.poison);
        character.advantageAgainst.add(DamageTypes.poison);
        character.otherAbilities.add("Stonecuning");
        ArrayList<Languages> languages = new ArrayList<Languages>(Arrays.asList(Languages.common, Languages.dwarvish));
        addLanguages(character, languages);
        ArrayList<Object> proficiencies = new ArrayList<Object>(Arrays.asList(WeaponTypes.battleaxe, WeaponTypes.handaxe,
                WeaponTypes.handaxe, WeaponTypes.warharmmer));
        addProficiencies(character, proficiencies);
        if (subrace == Subraces.mountainDwarf) {
            character.setSubrace(Subraces.mountainDwarf);
            character.abilities.setStrength(character.abilities.getStrength() + 2);
            proficiencies = new ArrayList<Object>(Arrays.asList(ArmorTypes.lightArrmor, ArmorTypes.mediumArmor));
            addProficiencies(character, proficiencies);
        } else {
            character.setSubrace(Subraces.hillDwarf);
            character.abilities.setWisdom(character.abilities.getWisdom() + 1);
            character.setHp(character.getHp() + 1);
        }
    }

    private static void createGnome(Character character, Subraces subrace) {
        character.setRace(Races.gnome);
        character.setSize(Sizes.small);
        character.setSpeed(25);
        character.setDarkvision(true);
        character.otherAbilities.add("Gnome cunning");
        ArrayList<Languages> languages = new ArrayList<Languages>(Arrays.asList(Languages.common, Languages.gnomish));
        addLanguages(character, languages);
        if (subrace == Subraces.forestGnome) {
            character.abilities.setDexterity(character.abilities.getDexterity() + 1);
            character.otherAbilities.add("Speak with animals");
        } else {
            character.abilities.setConstitution(character.abilities.getConstitution() + 1);
            character.otherAbilities.add("Artificer's lore");
            character.otherAbilities.add("Tinker");
        }
    }
    private static void addLanguages (Character character, ArrayList<Languages> languages) {
        character.languages.addAll(languages);
    }

    private static void addProficiencies (Character character, ArrayList<Object> proficiencies) {
        character.proficiencies.addAll(proficiencies);
    }

    private static void createElf(Character character, Subraces subrace) {
        character.setRace(Races.elf);
        character.abilities.setDexterity(character.abilities.getDexterity() + 2);
        character.setSize(Sizes.medium);
        character.setSpeed(30);
        character.setDarkvision(true);
        ArrayList<Languages> languages = new ArrayList<Languages>(Arrays.asList(Languages.common, Languages.elvish));
        addLanguages(character, languages);
        ArrayList<Object> proficiencies = new ArrayList<Object>(Collections.singletonList("Perception"));
        addProficiencies(character, proficiencies);
        if (subrace == Subraces.highElf) {
            character.abilities.setIntelligence(character.abilities.getIntelligence() + 1);
            proficiencies = new ArrayList<Object>(Arrays.asList(WeaponTypes.longsword, WeaponTypes.shortsword,
                    WeaponTypes.shortbow, WeaponTypes.longbow));
            addProficiencies(character, proficiencies);
        } else if (subrace == Subraces.woodElf) {
            character.abilities.setWisdom(character.abilities.getWisdom() + 1);
            character.setSpeed(35);
            proficiencies = new ArrayList<Object>(Arrays.asList(WeaponTypes.longsword, WeaponTypes.shortsword,
                    WeaponTypes.shortbow, WeaponTypes.longbow));
            addProficiencies(character, proficiencies);
            character.otherAbilities.add("Mask of the wild");
        } else {
            character.otherAbilities.add("Superior darkvision");
            proficiencies = new ArrayList<Object>(Arrays.asList(WeaponTypes.rapier, WeaponTypes.shortsword,
                    WeaponTypes.handCrossbow));
            addProficiencies(character, proficiencies);
            character.abilities.setCharisma(character.abilities.getCharisma() + 1);
        }
    }

    private static void createHalfElf(Character character) {
        character.abilities.setCharisma(character.abilities.getCharisma() + 2);
        character.setSize(Sizes.medium);
        character.setSpeed(30);
        character.setDarkvision(true);
        ArrayList<Languages> languages = new ArrayList<Languages>(Arrays.asList(Languages.common, Languages.elvish));
    }
}
