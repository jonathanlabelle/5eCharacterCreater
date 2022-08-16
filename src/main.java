import CharacterClass.Barbarian;
import CharacterClass.CharacterClassesEnum;
import CharacterClass.CreateClass;
import Items.*;
import PlayerCharacter.PlayerCharacter;
import PlayerCharacter.CreateBackground;
import PlayerCharacter.Backgrounds;
import PlayerCharacter.Languages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;


public class main {
    public static void main(String[] args) {
        PlayerCharacter playerCharacter = new PlayerCharacter();
        CreateBackground.createBackground(playerCharacter, Backgrounds.charlatan, new ArrayList<Object>(Arrays.asList(Languages.infernal, Languages.halfling,
                AdventuringGear.getAdventuringGear(AdventuringGearEnum.stopperedBottle))));
        System.out.println(playerCharacter.getLanguages());

        for(Map.Entry<Items, Integer> item : playerCharacter.inventory.getItems().entrySet()) {
            System.out.print(item.getValue());
            System.out.println(item.getKey().itemName);
        }
        CreateClass.CreateClass(playerCharacter, CharacterClassesEnum.barbarian);
        System.out.println(playerCharacter.getHp());
        System.out.println(WeaponTypes.getType(WeaponTypes.club));
    }
}
