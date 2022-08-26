package PlayerCharacter;

import CharacterClass.CharacterClassesEnum;
import Currency.Currency;
import Items.Items;
import Rules.DamageTypes;
import Spells.Spells;

import java.util.ArrayList;
import java.util.HashSet;

public class PlayerCharacter {
    private String name;
    private Races race;
    private Subraces subrace;
    private Backgrounds background;
    private CharacterClassesEnum charClass;
    private Sizes size;
    private int AC;
    private Alignment alignment;
    private ArrayList <Items> equippedItems;
    public InventoryItem inventory;
    private HashSet <Languages> languages;
    private HashSet <DamageTypes> resistances;
    public static HashSet <Object> proficiencies;
    private HashSet <Object> advantageAgainst;
    private HashSet <Object> otherAbilities;
    private Abilities abilities;
    private HashSet <Spells> spells;
    public Currency currency;
    private int level;
    private int hp;
    private int currentHp;
    private int speed;
    private boolean darkvision;
    private boolean inspired;

    public PlayerCharacter() {
        equippedItems = new ArrayList<>();
        inventory = new InventoryItem();
        languages = new HashSet<>();
        resistances = new HashSet<>();
        proficiencies = new HashSet<>();
        advantageAgainst = new HashSet<>();
        otherAbilities = new HashSet<>();
        spells = new HashSet<>();
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

    public CharacterClassesEnum getCharClass() {
        return charClass;
    }

    public void setCharClass(CharacterClassesEnum charClass) {
        this.charClass = charClass;
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

    public static void addMultipleEquippedItems(PlayerCharacter playerCharacter, ArrayList<Items> items) {
        playerCharacter.equippedItems.addAll(items);
    }

    public static void addMultipleLanguages(PlayerCharacter playerCharacter, ArrayList<Languages> language) {
        playerCharacter.languages.addAll(language);
    }

    public static void addMultipleResistances(PlayerCharacter playerCharacter, ArrayList<DamageTypes> resistances) {
        playerCharacter.resistances.addAll(resistances);
    }

    public static void addMultipleProficiencies(PlayerCharacter playerCharacter, ArrayList<Object> proficiencies) {
        playerCharacter.proficiencies.addAll(proficiencies);
    }

    public static void addMultipleAdvantageAgainst(PlayerCharacter playerCharacter, ArrayList<Object> advantages) {
        playerCharacter.advantageAgainst.addAll(advantages);
    }

    public static void addMultipleOtherAbilities(PlayerCharacter playerCharacter, ArrayList<Object> abilities) {
        playerCharacter.otherAbilities.addAll(abilities);
    }

    public static void addMultipleSpells(PlayerCharacter playerCharacter, ArrayList<Spells> spells) {
        playerCharacter.spells.addAll(spells);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAC() { return AC; }

    public ArrayList<Items> getEquippedItems() {
        return equippedItems;
    }

    public void setEquippedItems(ArrayList<Items> equippedItems) {
        this.equippedItems = equippedItems;
    }

    public Alignment getAlignment() {
        return alignment;
    }

    public void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public HashSet <Languages> getLanguages() {
        return languages;
    }

    public void setLanguages(HashSet <Languages> languages) {
        this.languages = languages;
    }

    public HashSet<DamageTypes> getResistances() {
        return resistances;
    }

    public void setResistances(HashSet<DamageTypes> resistances) {
        this.resistances = resistances;
    }

    public HashSet<Object> getProficiencies() {
        return proficiencies;
    }

    public void setProficiencies(HashSet<Object> proficiencies) {
        this.proficiencies = proficiencies;
    }

    public HashSet<Object> getAdvantageAgainst() {
        return advantageAgainst;
    }

    public void setAdvantageAgainst(HashSet<Object> advantageAgainst) {
        this.advantageAgainst = advantageAgainst;
    }

    public HashSet<Object> getOtherAbilities() {
        return otherAbilities;
    }

    public void setOtherAbilities(HashSet<Object> otherAbilities) {
        this.otherAbilities = otherAbilities;
    }

    public HashSet<Spells> getSpells() {
        return spells;
    }

    public void setSpells(HashSet<Spells> spells) {
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

    public InventoryItem getInventory() {
        return inventory;
    }

    public void setInventory(InventoryItem inventory) {
        this.inventory = inventory;
    }

    public void setBackground(Backgrounds background) { this.background = background; }

    public String toString() {
        return "" +
                "Name : " + getName() +
                "\nRace : " + getRace() +
                "\nSubrace : " + getSubrace() +
                "\nBackground : " + getBackground() +
                "\nClass : " + getCharClass() +
                "\nHP : " + getHp() +
                "\nSize : " + getSize() +
                "\nAC : " + getAC() +
                "\nAbilities: Strength : " + getAbilities().getStrength() + " Dexterity : " + getAbilities().getDexterity() +
                " Constitution : " + getAbilities().getConstitution() + " Intelligence : " + getAbilities().getIntelligence() +
                " Wisdom : " + getAbilities().getWisdom() + " Charisma : " + getAbilities().getCharisma() +
                "\nAlignment : " + getAlignment() +
                "\nEquipped items : " + getEquippedItems() +
                "\nInventory : \n" + InventoryItem.printInventory(getInventory());
    }
}
