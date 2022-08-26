package CharacterClass;

import Dice.Dice;
import Items.ArmorTypes;
import Items.Items;
import Items.WeaponTypes;
import PlayerCharacter.abilityEnum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Barbarian extends CharacterClass {
    private static final int staringHP = 12;
    private static final String hitDie = "1d12";
    private static final HashSet<ArmorTypes> armorProficiencies = new HashSet<ArmorTypes>(Arrays.asList(
            ArmorTypes.lightArmor, ArmorTypes.mediumArmor, ArmorTypes.shield
    ));

    public Barbarian(HashSet<WeaponTypes> weaponProficiencies, HashSet<Items> toolProficiencies,
                     HashSet<abilityEnum> savingThrows, HashSet<abilityEnum> skillsProficiencies) {
        super(staringHP, hitDie, armorProficiencies, weaponProficiencies, toolProficiencies, savingThrows,
                skillsProficiencies);
    }

}
