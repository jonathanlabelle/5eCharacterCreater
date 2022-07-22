import javax.swing.*;
import java.util.ArrayList;

public class Character {
    String name;
    Races race;
    Subraces subrace;
    Classes classes;
    Sizes size;
    Alignment alignment;
    ArrayList <Items> equippedItems;
    ArrayList <Items> inventory;
    ArrayList <Languages> languages;
    ArrayList <DamageTypes> resistances;
    ArrayList <Object> proficiencies;
    ArrayList <Object> advantageAgainst;
    ArrayList <Object> otherAbilities;
    Abilities abilities;
    ArrayList<Spells> spells;
    int level;
    int hp;
    int currentHp;
    int speed;
    boolean darkvision;
    boolean inspired;

    public Character() {
        equippedItems = new ArrayList<>();
        inventory = new ArrayList<>();
        languages = new ArrayList<>();
        resistances = new ArrayList<>();
        proficiencies = new ArrayList<>();
        advantageAgainst = new ArrayList<>();
        otherAbilities = new ArrayList<>();
        spells = new ArrayList<>();
        inspired = false;
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
}
