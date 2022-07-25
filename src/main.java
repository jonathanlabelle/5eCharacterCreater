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


public class main {
    public static void main(String[] args) {
        Character character = new Character();
        CreateBackground.createBackground(character, Backgrounds.acolyte, new ArrayList<Languages>(Arrays.asList(Languages.infernal, Languages.halfling)),
                AdventuringGear.getAdventuringGear(AdventuringGearEnum.holySymbolEmblem));
        System.out.println(character.getLanguages());
    }
}
