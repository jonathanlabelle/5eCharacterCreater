package Character;

import Currency.*;
import Items.*;

import javax.tools.Tool;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Items.AdventuringGear.*;
import static Items.Tools.*;

public class CreateBackground {
    /*
    for acolyte
     */
    public static void createBackground (Character character, Backgrounds background, ArrayList<Languages>
            languages, Items holySymbol) {
        character.setBackground(background);
        Character.addMultipleLanguages(character, languages);
        switch (background) {
            case acolyte -> createAcolyte(character, holySymbol);
        }
    }

    /*
  for charlatan
    */
    public static void createBackground(Character character, Backgrounds background, Items item) {
        character.setBackground(background);
        switch (background) {
            case charlatan -> createCharlatan(character, item);
        }
        character.addToProficiencies(ToolsEnum.disguiseKit);
    }

    private static void createAcolyte(Character character, Items holySymbol) {
        character.addToProficiencies(abilityEnum.insight);
        character.addToProficiencies(abilityEnum.religion);
        InventoryItem.changeInventoryAdd1Multiple(character.inventory, new ArrayList<Items>(Arrays.asList(
                getAdventuringGear(AdventuringGearEnum.prayerBook),
                getAdventuringGear(AdventuringGearEnum.vestments),
                getAdventuringGear(AdventuringGearEnum.commonClothes),
                holySymbol)));
        InventoryItem.changeInventory(character.inventory, getAdventuringGear(AdventuringGearEnum.stickOfEssence), 5);
        Currency.changeCurrency(character.currency, CurrencyTypes.gp, 15);
    }

    private static void createCharlatan(Character character, Items item) {
        character.addToProficiencies(ToolsEnum.disguiseKit);
        character.addToProficiencies(ToolsEnum.forgeryKit);
        InventoryItem.changeInventoryAdd1Multiple(character.inventory, new ArrayList<Items>(Arrays.asList(
                getAdventuringGear(AdventuringGearEnum.fineClothes),
                getTool(ToolsEnum.disguiseKit))));
        Currency.changeCurrency(character.currency, CurrencyTypes.gp, 15);
        if (item == getAdventuringGear(AdventuringGearEnum.stopperedBottle)) {
            InventoryItem.changeInventory(character.inventory, item, 10);
        } else if (item == getAdventuringGear(AdventuringGearEnum.weightedDice)) {
            InventoryItem.changeInventory(character.inventory, item, 1);
        } else if (item == getAdventuringGear(AdventuringGearEnum.markedCards)) {
            InventoryItem.changeInventory(character.inventory, item, 1);
        } else {
            InventoryItem.changeInventory(character.inventory, item, 1);
        }
    }
}
