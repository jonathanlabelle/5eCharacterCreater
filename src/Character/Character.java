package Character;

import Currency.Currency;
import Items.Items;
import Rules.DamageTypes;
import Spells.Spells;

import java.util.ArrayList;

public class Character {
    private String name;
    private Races race;
    private Subraces subrace;
    private Backgrounds background;
    private Classes classes;
    private Sizes size;
    private Alignment alignment;
    private ArrayList <Items> equippedItems;
    public InventoryItem inventory;
    private ArrayList <Languages> languages;
    private ArrayList <DamageTypes> resistances;
    private ArrayList <Object> proficiencies;
    private ArrayList <Object> advantageAgainst;
    private ArrayList <Object> otherAbilities;
    private Abilities abilities;
    private ArrayList<Spells> spells;
    public Currency currency;
    private int level;
    private int hp;
    private int currentHp;
    private int speed;
    private boolean darkvision;
    private boolean inspired;

    public Character() {
        equippedItems = new ArrayList<>();
        inventory = new InventoryItem();
        languages = new ArrayList<>();
        resistances = new ArrayList<>();
        proficiencies = new ArrayList<>();
        advantageAgainst = new ArrayList<>();
        otherAbilities = new ArrayList<>();
        spells = new ArrayList<>();
        currency = new Currency();
        inspired = false;
    }

    public void addToEquippedItems(Items item) { equippedItems.add(item);}


    public void addToLanguages(Languages language) {
        languages.add(language);
    }

    public void addToResistances(DamageTypes damageType) {
        resistances.add(damageType);
    }

    public void addToProficiencies(Object proficiency) {
        proficiencies.add(proficiency);
    }

    public void addToAdvantageAgainst(Object advantage) {
        advantageAgainst.add(advantage);
    }

    public void addToOtherAbilities(Object ability) {
        otherAbilities.add(ability);
    }

    public void addToSpells(Spells spell) {
        spells.add(spell);
    }

    public static void addMultipleEquippedItems(Character character, ArrayList<Items> items) {
        character.equippedItems.addAll(items);
    }

    public static void addMultipleLanguages(Character character, ArrayList<Languages> language) {
        character.languages.addAll(language);
    }

    public static void addMultipleResistances(Character character, ArrayList<DamageTypes> resistances) {
        character.resistances.addAll(resistances);
    }

    public static void addMultipleProficiencies(Character character, ArrayList<Object> proficiencies) {
        character.proficiencies.addAll(proficiencies);
    }

    public static void addMultipleAdvantageAgainst(Character character, ArrayList<Object> advantages) {
        character.advantageAgainst.addAll(advantages);
    }

    public static void addMultipleOtherAbilities(Character character, ArrayList<Object> abilities) {
        character.otherAbilities.addAll(abilities);
    }

    public static void addMultipleSpells(Character character, ArrayList<Spells> spells) {
        character.spells.addAll(spells);
    }


    public ArrayList<Items> getEquippedItems() {
        return equippedItems;
    }

    public void setEquippedItems(ArrayList<Items> equippedItems) {
        this.equippedItems = equippedItems;
    }

    public ArrayList<Languages> getLanguages() {
        return languages;
    }

    public void setLanguages(ArrayList<Languages> languages) {
        this.languages = languages;
    }

    public ArrayList<DamageTypes> getResistances() {
        return resistances;
    }

    public void setResistances(ArrayList<DamageTypes> resistances) {
        this.resistances = resistances;
    }

    public ArrayList<Object> getProficiencies() {
        return proficiencies;
    }

    public void setProficiencies(ArrayList<Object> proficiencies) {
        this.proficiencies = proficiencies;
    }

    public ArrayList<Object> getAdvantageAgainst() {
        return advantageAgainst;
    }

    public void setAdvantageAgainst(ArrayList<Object> advantageAgainst) {
        this.advantageAgainst = advantageAgainst;
    }

    public ArrayList<Object> getOtherAbilities() {
        return otherAbilities;
    }

    public void setOtherAbilities(ArrayList<Object> otherAbilities) {
        this.otherAbilities = otherAbilities;
    }

    public ArrayList<Spells> getSpells() {
        return spells;
    }

    public void setSpells(ArrayList<Spells> spells) {
        this.spells = spells;
    }

    public Abilities getAbilities() {
        return abilities;
    }

    public void setAbilities(Abilities abilities) {
        this.abilities = abilities;
    }

    public Races getRace() {
        return race;
    }

    public void setRace(Races race) {
        this.race = race;
    }

    public Subraces getSubrace() {
        return subrace;
    }

    public void setSubrace(Subraces subrace) {
        this.subrace = subrace;
    }

    public int getLevel() {
        return level;
    }

    public Sizes getSize() {
        return size;
    }

    public void setSize(Sizes size) {
        this.size = size;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean asDarkvision() {
        return darkvision;
    }

    public void setDarkvision(boolean darkvision) {
        this.darkvision = darkvision;
    }

    public Backgrounds getBackground() { return background; }

    public void setBackground(Backgrounds background) { this.background = background; }
}
