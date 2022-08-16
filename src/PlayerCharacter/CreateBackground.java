package PlayerCharacter;

import Currency.*;
import Items.*;

import java.util.ArrayList;
import java.util.Arrays;

import static Items.AdventuringGear.*;
import static Items.Mounts.*;
import static Items.Tools.*;
import static Items.VehicleItems.*;
import static Items.Weapons.getWeapon;

public class CreateBackground {

    public static void createBackground(PlayerCharacter playerCharacter, Backgrounds background, ArrayList<Object> playerChoices) {
        playerCharacter.setBackground(background);
        for (Object playerChoice : playerChoices) {
            if (playerChoice instanceof Languages) {
                playerCharacter.addToLanguages((Languages) playerChoice);
            } else if (playerChoice instanceof Items) {
                if (playerChoice == AdventuringGear.getAdventuringGear(AdventuringGearEnum.stopperedBottle)) {
                    /*
                    for charlatans
                     */
                    InventoryItem.changeInventory(playerCharacter.inventory, (Items) playerChoice, 10);
                } else {
                    InventoryItem.changeInventory(playerCharacter.inventory, (Items) playerChoice, 1);
                }
            } else {
                playerCharacter.addToProficiencies(playerChoice);
            }
        }
        switch (background) {
            case acolyte -> createAcolyte(playerCharacter);
            case charlatan -> createCharlatan(playerCharacter);
            case criminal, spy -> createCriminalSpy(playerCharacter);
            case entertainer, gladiator -> createEntertainerGladiator(playerCharacter);
            case folkHero -> createFolkHero(playerCharacter);
            case guildArtisan, guildMerchant -> createGuildArtisanMerchant(playerCharacter);
            case hermit -> createHermit(playerCharacter);
            case noble, knight -> createNobleKnight(playerCharacter);
            case outlander -> createOutlander(playerCharacter);
            case sage -> createSage(playerCharacter);
            case sailor -> createSailor(playerCharacter);
            case soldier -> createSoldier(playerCharacter);
        }
    }

    private static void createAcolyte(PlayerCharacter playerCharacter) {
        playerCharacter.addToProficiencies(abilityEnum.insight);
        playerCharacter.addToProficiencies(abilityEnum.religion);
        InventoryItem.changeInventoryAdd1Multiple(playerCharacter.inventory, new ArrayList<Items>(Arrays.asList(
                getAdventuringGear(AdventuringGearEnum.prayerBook),
                getAdventuringGear(AdventuringGearEnum.vestments),
                getAdventuringGear(AdventuringGearEnum.commonClothes)
                )));
        InventoryItem.changeInventory(playerCharacter.inventory, getAdventuringGear(AdventuringGearEnum.stickOfEssence), 5);
        Currency.changeCurrency(playerCharacter.currency, CurrencyTypes.gp, 15);
    }

    private static void createCharlatan(PlayerCharacter playerCharacter) {
        playerCharacter.addToProficiencies(abilityEnum.deception);
        playerCharacter.addToProficiencies(abilityEnum.sleightOfHand);
        playerCharacter.addToProficiencies(ToolsEnum.disguiseKit);
        playerCharacter.addToProficiencies(ToolsEnum.forgeryKit);
        InventoryItem.changeInventoryAdd1Multiple(playerCharacter.inventory, new ArrayList<Items>(Arrays.asList(
                getAdventuringGear(AdventuringGearEnum.fineClothes),
                getTool(ToolsEnum.disguiseKit
                ))));
        Currency.changeCurrency(playerCharacter.currency, CurrencyTypes.gp, 15);
    }

    private static void createCriminalSpy(PlayerCharacter playerCharacter) {
        playerCharacter.addToProficiencies(abilityEnum.deception);
        playerCharacter.addToProficiencies(abilityEnum.stealth);
        playerCharacter.addToProficiencies(ToolsEnum.thievesTool);
        InventoryItem.changeInventoryAdd1Multiple(playerCharacter.inventory, new ArrayList<>(Arrays.asList(
                getAdventuringGear(AdventuringGearEnum.crowbar),
                getAdventuringGear(AdventuringGearEnum.commonClothes)
                )));
        Currency.changeCurrency(playerCharacter.currency, CurrencyTypes.gp, 25);
    }

    private static void createEntertainerGladiator(PlayerCharacter playerCharacter) {
        playerCharacter.addToProficiencies(abilityEnum.acrobatics);
        playerCharacter.addToProficiencies(abilityEnum.performance);
        playerCharacter.addToProficiencies(ToolsEnum.disguiseKit);
        InventoryItem.changeInventoryAdd1Multiple(playerCharacter.inventory, new ArrayList<>(Arrays.asList(
                getAdventuringGear(AdventuringGearEnum.costume),
                getAdventuringGear(AdventuringGearEnum.favorOfAnAdmirer)
                )));
        Currency.changeCurrency(playerCharacter.currency, CurrencyTypes.gp, 15);
    }

    private static void createFolkHero(PlayerCharacter playerCharacter) {
        playerCharacter.addToProficiencies(abilityEnum.animalHandling);
        playerCharacter.addToProficiencies(abilityEnum.survival);
        playerCharacter.addToProficiencies("Land vehicles");
        InventoryItem.changeInventoryAdd1Multiple(playerCharacter.inventory, new ArrayList<>(Arrays.asList(
                getAdventuringGear(AdventuringGearEnum.ironPot),
                getAdventuringGear(AdventuringGearEnum.shovel),
                getAdventuringGear(AdventuringGearEnum.commonClothes)
        )));
        Currency.changeCurrency(playerCharacter.currency, CurrencyTypes.gp, 10);
    }

    private static void createGuildArtisanMerchant(PlayerCharacter playerCharacter) {
        playerCharacter.addToProficiencies(abilityEnum.insight);
        playerCharacter.addToProficiencies(abilityEnum.persuasion);
        InventoryItem.changeInventoryAdd1Multiple(playerCharacter.inventory, new ArrayList<>(Arrays.asList(
                getAdventuringGear(AdventuringGearEnum.letterOfIntroductionToGuild),
                getAdventuringGear(AdventuringGearEnum.travelersClothes)
        )));
        if (playerCharacter.getBackground() == Backgrounds.guildMerchant) {
            InventoryItem.changeInventoryAdd1Multiple(playerCharacter.inventory, new ArrayList<>(Arrays.asList(
                    getMount(MountEnum.mule),
                    getVehicleItem(VehicleItemsEnum.cart)
            )));
        }
        Currency.changeCurrency(playerCharacter.currency, CurrencyTypes.gp, 15);
    }

    private static void createHermit(PlayerCharacter playerCharacter) {
        playerCharacter.addToProficiencies(abilityEnum.medecine);
        playerCharacter.addToProficiencies(abilityEnum.religion);
        playerCharacter.addToProficiencies(ToolsEnum.herbalismKit);
        InventoryItem.changeInventoryAdd1Multiple(playerCharacter.inventory, new ArrayList<>(Arrays.asList(
                getAdventuringGear(AdventuringGearEnum.scrollCase),
                getAdventuringGear(AdventuringGearEnum.blanket),
                getAdventuringGear(AdventuringGearEnum.commonClothes),
                getTool(ToolsEnum.herbalismKit)
        )));
        Currency.changeCurrency(playerCharacter.currency, CurrencyTypes.gp, 5);
    }

    private static void createNobleKnight(PlayerCharacter playerCharacter) {
        playerCharacter.addToProficiencies(abilityEnum.history);
        playerCharacter.addToProficiencies(abilityEnum.persuasion);
        InventoryItem.changeInventoryAdd1Multiple(playerCharacter.inventory, new ArrayList<>(Arrays.asList(
                getAdventuringGear(AdventuringGearEnum.fineClothes),
                getAdventuringGear(AdventuringGearEnum.signetRing),
                getAdventuringGear(AdventuringGearEnum.scrollOfPedigree)
        )));
        Currency.changeCurrency(playerCharacter.currency, CurrencyTypes.gp, 25);
    }

    private static void createOutlander(PlayerCharacter playerCharacter) {
        playerCharacter.addToProficiencies(abilityEnum.athletics);
        playerCharacter.addToProficiencies(abilityEnum.survival);
        InventoryItem.changeInventoryAdd1Multiple(playerCharacter.inventory, new ArrayList<>(Arrays.asList(
                getAdventuringGear(AdventuringGearEnum.staff),
                getAdventuringGear(AdventuringGearEnum.huntingTrap),
                getAdventuringGear(AdventuringGearEnum.animalTrophy),
                getAdventuringGear(AdventuringGearEnum.travelersClothes)
        )));
        Currency.changeCurrency(playerCharacter.currency, CurrencyTypes.gp, 10);
    }

    private static void createSage(PlayerCharacter playerCharacter) {
        playerCharacter.addToProficiencies(abilityEnum.arcana);
        playerCharacter.addToProficiencies(abilityEnum.history);
        InventoryItem.changeInventoryAdd1Multiple(playerCharacter.inventory, new ArrayList<>(Arrays.asList(
                getAdventuringGear(AdventuringGearEnum.ink),
                getAdventuringGear(AdventuringGearEnum.quill),
                getAdventuringGear(AdventuringGearEnum.commonClothes)
        )));
        Currency.changeCurrency(playerCharacter.currency, CurrencyTypes.gp, 10);
    }

    private static void createSailor(PlayerCharacter playerCharacter) {
        playerCharacter.addToProficiencies(abilityEnum.athletics);
        playerCharacter.addToProficiencies(abilityEnum.perception);
        playerCharacter.addToProficiencies(ToolsEnum.navigatorsTools);
        InventoryItem.changeInventoryAdd1Multiple(playerCharacter.inventory, new ArrayList<>(Arrays.asList(
                getWeapon(WeaponsEnum.club),
                getAdventuringGear(AdventuringGearEnum.silkRope),
                getAdventuringGear(AdventuringGearEnum.commonClothes)
        )));
        Currency.changeCurrency(playerCharacter.currency, CurrencyTypes.gp, 10);
    }

    private static void createSoldier(PlayerCharacter playerCharacter) {
        playerCharacter.addToProficiencies(abilityEnum.athletics);
        playerCharacter.addToProficiencies(abilityEnum.intimidation);
        InventoryItem.changeInventoryAdd1Multiple(playerCharacter.inventory, new ArrayList<>(Arrays.asList(
                getAdventuringGear(AdventuringGearEnum.commonClothes)
        )));
        Currency.changeCurrency(playerCharacter.currency, CurrencyTypes.gp, 10);
    }

    private static void createUrchin(PlayerCharacter playerCharacter) {
        playerCharacter.addToProficiencies(abilityEnum.sleightOfHand);
        playerCharacter.addToProficiencies(abilityEnum.stealth);
        playerCharacter.addToProficiencies(ToolsEnum.disguiseKit);
        playerCharacter.addToProficiencies(ToolsEnum.thievesTool);
        InventoryItem.changeInventoryAdd1Multiple(playerCharacter.inventory, new ArrayList<>(Arrays.asList(
                getAdventuringGear(AdventuringGearEnum.smallKnife),
                getAdventuringGear(AdventuringGearEnum.petMouse),
                getAdventuringGear(AdventuringGearEnum.commonClothes)
        )));
        Currency.changeCurrency(playerCharacter.currency, CurrencyTypes.gp, 10);
    }
}
