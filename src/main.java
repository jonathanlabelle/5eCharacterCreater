import Currency.Currency;
import Items.*;
import Character.Character;
import Currency.CurrencyTypes;
import Character.InventoryItem;
import Character.CreateBackground;
import Character.Backgrounds;
import Character.Languages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;


public class main {
    public static void main(String[] args) {
        Character character = new Character();
        CreateBackground.createBackground(character, Backgrounds.charlatan, new ArrayList<Object>(Arrays.asList(Languages.infernal, Languages.halfling,
                AdventuringGear.getAdventuringGear(AdventuringGearEnum.stopperedBottle))));
        System.out.println(character.getLanguages());

        for(Map.Entry<Items, Integer> item : character.inventory.getItems().entrySet()) {
            System.out.print(item.getValue());
            System.out.println(item.getKey().itemName);
        }
    }
}
