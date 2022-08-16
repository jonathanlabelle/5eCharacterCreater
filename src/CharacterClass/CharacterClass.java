package CharacterClass;

import Dice.Dice;
import Items.ArmorTypes;
import Items.Items;
import Items.WeaponTypes;
import PlayerCharacter.*;
import java.util.HashSet;

public abstract class CharacterClass {
    private int staringHP;
    private static String hitDie;
    private HashSet <ArmorTypes> armorProficiencies;
    private HashSet <WeaponTypes> weaponProficiencies;
    private HashSet <Items> toolProficiencies;
    private HashSet <abilityEnum> savingThrows;
    private HashSet <abilityEnum> skillsProficiencies;

    public CharacterClass(int staringHP, String hitDie, HashSet<ArmorTypes> armorProficiencies,
                          HashSet<WeaponTypes> weaponProficiencies, HashSet<Items> toolProficiencies,
                          HashSet<abilityEnum> savingThrows, HashSet<abilityEnum> skillsProficiencies) {
        this.staringHP = staringHP;
        this.hitDie = hitDie;
        this.armorProficiencies = armorProficiencies;
        this.weaponProficiencies = weaponProficiencies;
        this.toolProficiencies = toolProficiencies;
        this.savingThrows = savingThrows;
        this.skillsProficiencies = skillsProficiencies;
    }

    public void levelUp(PlayerCharacter playerCharacter) {

    }


    public int getStaringHP() {
        return staringHP;
    }

    public void setStaringHP(int staringHP) {
        this.staringHP = staringHP;
    }

    public HashSet<ArmorTypes> getArmorProficiencies() {
        return armorProficiencies;
    }

    public void setArmorProficiencies(HashSet<ArmorTypes> armorProficiencies) {
        this.armorProficiencies = armorProficiencies;
    }

    public HashSet<WeaponTypes> getWeaponProficiencies() {
        return weaponProficiencies;
    }

    public void setWeaponProficiencies(HashSet<WeaponTypes> weaponProficiencies) {
        this.weaponProficiencies = weaponProficiencies;
    }

    public HashSet<Items> getToolProficiencies() {
        return toolProficiencies;
    }

    public void setToolProficiencies(HashSet<Items> toolProficiencies) {
        this.toolProficiencies = toolProficiencies;
    }

    public HashSet<abilityEnum> getSavingThrows() {
        return savingThrows;
    }

    public void setSavingThrows(HashSet<abilityEnum> savingThrows) {
        this.savingThrows = savingThrows;
    }

    public HashSet<abilityEnum> getSkillsProficiencies() {
        return skillsProficiencies;
    }

    public void setSkillsProficiencies(HashSet<abilityEnum> skillsProficiencies) {
        this.skillsProficiencies = skillsProficiencies;
    }
}
