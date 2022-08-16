package Items;

import PlayerCharacter.Races;
import PlayerCharacter.Subraces;

enum Type { martial, simple}
enum Range {melee, ranged}

public enum WeaponTypes {
    club (Type.simple, Range.melee){
        final Type type = Type.simple;
        final Range range = Range.melee;
        @Override
        public String toString() {
            return "Club";
        }
    };

    Type type;
    Range range;
    WeaponTypes(Type type, Range range) {
        this.type = type;
        this.range = range;
    }
    public static Type getType(WeaponTypes weaponTypes) {
        WeaponTypes[] constants = WeaponTypes.values();
        return constants[weaponTypes.ordinal()].type;
    }

}
