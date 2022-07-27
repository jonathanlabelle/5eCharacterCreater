package Character;

import Currency.*;
import Items.*;

import javax.tools.Tool;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Items.AdventuringGear.*;
import static Items.Mounts.*;
import static Items.Tools.*;
import static Items.VehicleItems.*;
import static Items.Weapons.getWeapon;

public class CreateBackground {

    public static void createBackground(Character character, Backgrounds background, ArrayList<Object> playerChoices) {
        character.setBackground(background);
        for (Object playerChoice : playerChoices) {
            if (playerChoice instanceof Languages) {
                character.addToLanguages((Languages) playerChoice);
            } else if (playerChoice instanceof Items) {
                if (playerChoice == AdventuringGear.getAdventuringGear(AdventuringGearEnum.stopperedBottle)) {
                    /*
                    for charlatans
                     */
                    InventoryItem.changeInventory(character.inventory, (Items) playerChoice, 10);
                } else {
                    InventoryItem.changeInventory(character.inventory, (Items) playerChoice, 1);
                }
            } else {
                character.addToProficiencies(playerChoice);
            }
        }
        switch (background) {
            case acolyte -> createAcolyte(character);
            case charlatan -> createCharlatan(character);
            case criminal, spy -> createCriminalSpy(character);
            case entertainer, gladiator -> createEntertainerGladiator(character);
            case folkHero -> createFolkHero(character);
            case guildArtisan, guildMerchant -> createGuildArtisanMerchant(character);
            case hermit -> createHermit(character);
            case noble, knight -> createNobleKnight(character);
            case outlander -> createOutlander(character);
            case sage -> createSage(character);
            case sailor -> createSailor(character);
            case soldier -> createSoldier(character);
        }
    }

    private static void createAcolyte(Character character) {
        character.addToProficiencies(abilityEnum.insight);
        character.addToProficiencies(abilityEnum.religion);
        InventoryItem.changeInventoryAdd1Multiple(character.inventory, new ArrayList<Items>(Arrays.asList(
                getAdventuringGear(AdventuringGearEnum.prayerBook),
                getAdventuringGear(AdventuringGearEnum.vestments),
                getAdventuringGear(AdventuringGearEnum.commonClothes)
                )));
        InventoryItem.changeInventory(character.inventory, getAdventuringGear(AdventuringGearEnum.stickOfEssence), 5);
        Currency.changeCurrency(character.currency, CurrencyTypes.gp, 15);
    }

    private static void createCharlatan(Character character) {
        character.addToProficiencies(abilityEnum.deception);
        character.addToProficiencies(abilityEnum.sleightOfHand);
        character.addToProficiencies(ToolsEnum.disguiseKit);
        character.addToProficiencies(ToolsEnum.forgeryKit);
        InventoryItem.changeInventoryAdd1Multiple(character.inventory, new ArrayList<Items>(Arrays.asList(
                getAdventuringGear(AdventuringGearEnum.fineClothes),
                getTool(ToolsEnum.disguiseKit
                ))));
        Currency.changeCurrency(character.currency, CurrencyTypes.gp, 15);
    }

    private static void createCriminalSpy(Character character) {
        character.addToProficiencies(abilityEnum.deception);
        character.addToProficiencies(abilityEnum.stealth);
        character.addToProficiencies(ToolsEnum.thievesTool);
        InventoryItem.changeInventoryAdd1Multiple(character.inventory, new ArrayList<>(Arrays.asList(
                getAdventuringGear(AdventuringGearEnum.crowbar),
                getAdventuringGear(AdventuringGearEnum.commonClothes)
                )));
        Currency.changeCurrency(character.currency, CurrencyTypes.gp, 25);
    }

    private static void createEntertainerGladiator(Character character) {
        character.addToProficiencies(abilityEnum.acrobatics);
        character.addToProficiencies(abilityEnum.performance);
        character.addToProficiencies(ToolsEnum.disguiseKit);
        InventoryItem.changeInventoryAdd1Multiple(character.inventory, new ArrayList<>(Arrays.asList(
                getAdventuringGear(AdventuringGearEnum.costume),
                getAdventuringGear(AdventuringGearEnum.favorOfAnAdmirer)
                )));
        Currency.changeCurrency(character.currency, CurrencyTypes.gp, 15);
    }

    private static void createFolkHero(Character character) {
        character.addToProficiencies(abilityEnum.animalHandling);
        character.addToProficiencies(abilityEnum.survival);
        character.addToProficiencies("Land vehicles");
        InventoryItem.changeInventoryAdd1Multiple(character.inventory, new ArrayList<>(Arrays.asList(
                getAdventuringGear(AdventuringGearEnum.ironPot),
                getAdventuringGear(AdventuringGearEnum.shovel),
                getAdventuringGear(AdventuringGearEnum.commonClothes)
        )));
        Currency.changeCurrency(character.currency, CurrencyTypes.gp, 10);
    }

    private static void createGuildArtisanMerchant(Character character) {
        character.addToProficiencies(abilityEnum.insight);
        character.addToProficiencies(abilityEnum.persuasion);
        InventoryItem.changeInventoryAdd1Multiple(character.inventory, new ArrayList<>(Arrays.asList(
                getAdventuringGear(AdventuringGearEnum.letterOfIntroductionToGuild),
                getAdventuringGear(AdventuringGearEnum.travelersClothes)
        )));
        if (character.getBackground() == Backgrounds.guildMerchant) {
            InventoryItem.changeInventoryAdd1Multiple(character.inventory, new ArrayList<>(Arrays.asList(
                    getMount(MountEnum.mule),
                    getVehicleItem(VehicleItemsEnum.cart)
            )));
        }
        Currency.changeCurrency(character.currency, CurrencyTypes.gp, 15);
    }

    private static void createHermit(Character character) {
        character.addToProficiencies(abilityEnum.medecine);
        character.addToProficiencies(abilityEnum.religion);
        character.addToProficiencies(ToolsEnum.herbalismKit);
        InventoryItem.changeInventoryAdd1Multiple(character.inventory, new ArrayList<>(Arrays.asList(
                getAdventuringGear(AdventuringGearEnum.scrollCase),
                getAdventuringGear(AdventuringGearEnum.blanket),
                getAdventuringGear(AdventuringGearEnum.commonClothes),
                getTool(ToolsEnum.herbalismKit)
        )));
        Currency.changeCurrency(character.currency, CurrencyTypes.gp, 5);
    }

    private static void createNobleKnight(Character character) {
        character.addToProficiencies(abilityEnum.history);
        character.addToProficiencies(abilityEnum.persuasion);
        InventoryItem.changeInventoryAdd1Multiple(character.inventory, new ArrayList<>(Arrays.asList(
                getAdventuringGear(AdventuringGearEnum.fineClothes),
                getAdventuringGear(AdventuringGearEnum.signetRing),
                getAdventuringGear(AdventuringGearEnum.scrollOfPedigree)
        )));
        Currency.changeCurrency(character.currency, CurrencyTypes.gp, 25);
    }

    private static void createOutlander(Character character) {
        character.addToProficiencies(abilityEnum.athletics);
        character.addToProficiencies(abilityEnum.survival);
        InventoryItem.changeInventoryAdd1Multiple(character.inventory, new ArrayList<>(Arrays.asList(
                getAdventuringGear(AdventuringGearEnum.staff),
                getAdventuringGear(AdventuringGearEnum.huntingTrap),
                getAdventuringGear(AdventuringGearEnum.animalTrophy),
                getAdventuringGear(AdventuringGearEnum.travelersClothes)
        )));
        Currency.changeCurrency(character.currency, CurrencyTypes.gp, 10);
    }

    private static void createSage(Character character) {
        character.addToProficiencies(abilityEnum.arcana);
        character.addToProficiencies(abilityEnum.history);
        InventoryItem.changeInventoryAdd1Multiple(character.inventory, new ArrayList<>(Arrays.asList(
                getAdventuringGear(AdventuringGearEnum.ink),
                getAdventuringGear(AdventuringGearEnum.quill),
                getAdventuringGear(AdventuringGearEnum.commonClothes)
        )));
        Currency.changeCurrency(character.currency, CurrencyTypes.gp, 10);
    }

    private static void createSailor(Character character) {
        character.addToProficiencies(abilityEnum.athletics);
        character.addToProficiencies(abilityEnum.perception);
        character.addToProficiencies(ToolsEnum.navigatorsTools);
        InventoryItem.changeInventoryAdd1Multiple(character.inventory, new ArrayList<>(Arrays.asList(
                getWeapon(WeaponsEnum.club),
                getAdventuringGear(AdventuringGearEnum.silkRope),
                getAdventuringGear(AdventuringGearEnum.commonClothes)
        )));
        Currency.changeCurrency(character.currency, CurrencyTypes.gp, 10);
    }

    private static void createSoldier(Character character) {
        character.addToProficiencies(abilityEnum.athletics);
        character.addToProficiencies(abilityEnum.intimidation);
        InventoryItem.changeInventoryAdd1Multiple(character.inventory, new ArrayList<>(Arrays.asList(
                getAdventuringGear(AdventuringGearEnum.commonClothes)
        )));
        Currency.changeCurrency(character.currency, CurrencyTypes.gp, 10);
    }

    private static void createUrchin(Character character) {
        character.addToProficiencies(abilityEnum.sleightOfHand);
        character.addToProficiencies(abilityEnum.stealth);
        character.addToProficiencies(ToolsEnum.disguiseKit);
        character.addToProficiencies(ToolsEnum.thievesTool);
        InventoryItem.changeInventoryAdd1Multiple(character.inventory, new ArrayList<>(Arrays.asList(
                getAdventuringGear(AdventuringGearEnum.smallKnife),
                getAdventuringGear(AdventuringGearEnum.petMouse),
                getAdventuringGear(AdventuringGearEnum.commonClothes)
        )));
        Currency.changeCurrency(character.currency, CurrencyTypes.gp, 10);
    }
}
