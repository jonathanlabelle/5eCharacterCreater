import CharacterClass.Barbarian;
import CharacterClass.CharacterClassesEnum;
import CharacterClass.CreateClass;
import Items.*;
import PlayerCharacter.*;
import PlayerCharacter.CreateBackground;
import PlayerCharacter.Backgrounds;
import PlayerCharacter.Languages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;


public class main {

    public PlayerCharacter createCharacter() {
        PlayerCharacter pc = new PlayerCharacter();

        return pc;
    }

    public static void main(String[] args) {
        for (Subraces subrace : Subraces.values()) {
            if (Subraces.getRace(subrace)==Races.dwarf) {
                System.out.println(subrace);
            }
        }
        PlayerCharacter pc = ConsoleCharacterCreater.consoleCreateCharacter();
        System.out.println(pc);
        for (Object prof : PlayerCharacter.proficiencies) {
            System.out.println(prof);
        }
    }
}
