package CharacterClass;

import PlayerCharacter.PlayerCharacter;

public class CreateClass {

    public static void CreateClass(PlayerCharacter playerCharacter, CharacterClassesEnum charClass) {
        switch (charClass) {
            case barbarian -> createBarbarian(playerCharacter);
        }
    }

    private static void createBarbarian(PlayerCharacter playerCharacter) {
        playerCharacter.setCharClass(CharacterClassesEnum.barbarian);
        playerCharacter.setHp(12);
    }
}
