package Items;

import PlayerCharacter.Races;
import PlayerCharacter.Subraces;

enum Type { martial, simple}
enum Range {melee, ranged}

public enum WeaponTypes {
    club(Type.simple, Range.melee){
        final Type type = Type.simple;
        final Range range = Range.melee;
        @Override
        public String toString() {
            return "Club";
        }
    },
    dagger(Type.simple, Range.melee){
        final Type type = Type.simple;
        final Range range = Range.melee;
        @Override
        public String toString() {
            return "Dagger";
        }
    },
    greatClub(Type.simple, Range.melee){
        final Type type = Type.simple;
        final Range range = Range.melee;
        @Override
        public String toString() {
            return "Great Club";
        }
    },
    handAxe(Type.simple, Range.melee){
        final Type type = Type.simple;
        final Range range = Range.melee;
        @Override
        public String toString() {
            return "Hand Axe";
        }
    },
    javelin(Type.simple, Range.melee){
        final Type type = Type.simple;
        final Range range = Range.melee;
        @Override
        public String toString() {
            return "Javelin";
        }
    },
    lightHammer(Type.simple, Range.melee){
        final Type type = Type.simple;
        final Range range = Range.melee;
        @Override
        public String toString() {
            return "Light Hammer";
        }
    },
    mace(Type.simple, Range.melee){
        final Type type = Type.simple;
        final Range range = Range.melee;
        @Override
        public String toString() {
            return "Mace";
        }
    },
    quarterstaff(Type.simple, Range.melee){
        final Type type = Type.simple;
        final Range range = Range.melee;
        @Override
        public String toString() {
            return "Quarterstaff";
        }
    },
    sickle(Type.simple, Range.melee){
        final Type type = Type.simple;
        final Range range = Range.melee;
        @Override
        public String toString() {
            return "Sickle";
        }
    },
    spear(Type.simple, Range.melee){
        final Type type = Type.simple;
        final Range range = Range.melee;
        @Override
        public String toString() {
            return "Spear";
        }
    },
    lightCrossbow(Type.simple, Range.ranged){
        final Type type = Type.simple;
        final Range range = Range.ranged;
        @Override
        public String toString() {
            return "Light Crossbow";
        }
    },
    dart(Type.simple, Range.ranged){
        final Type type = Type.simple;
        final Range range = Range.ranged;
        @Override
        public String toString() {
            return "dart";
        }
    ;},
    shortBow(Type.simple, Range.ranged) {
        final Type type = Type.simple;
        final Range range = Range.ranged;

        @Override
        public String toString() {
            return "Shortbow";
        }
    },
    sling(Type.simple, Range.ranged) {
        final Type type = Type.simple;
        final Range range = Range.ranged;

        @Override
        public String toString() {
            return "Sling";
        }
    },
    battleaxe(Type.martial, Range.melee) {
        final Type type = Type.martial;
        final Range range = Range.melee;

        @Override
        public String toString() {
            return "Battleaxe";
        }
    },
    flail(Type.martial, Range.melee) {
        final Type type = Type.martial;
        final Range range = Range.melee;

        @Override
        public String toString() {
            return "Battleaxe";
        }
    },
    glaive(Type.martial, Range.melee) {
        final Type type = Type.martial;
        final Range range = Range.melee;

        @Override
        public String toString() {
            return "Glaive";
        }
    },
    greatSword(Type.martial, Range.melee) {
        final Type type = Type.martial;
        final Range range = Range.melee;

        @Override
        public String toString() {
            return "Great-Sword";
        }
    },
    Halberd(Type.martial, Range.melee) {
        final Type type = Type.martial;
        final Range range = Range.melee;

        @Override
        public String toString() {
            return "Halberd";
        }
    },
    lance(Type.martial, Range.melee) {
        final Type type = Type.martial;
        final Range range = Range.melee;

        @Override
        public String toString() {
            return "Lance";
        }
    },
    longSword(Type.martial, Range.melee) {
        final Type type = Type.martial;
        final Range range = Range.melee;

        @Override
        public String toString() {
            return "Long-Sword";
        }
    },
    maul(Type.martial, Range.melee) {
        final Type type = Type.martial;
        final Range range = Range.melee;

        @Override
        public String toString() {
            return "Maul";
        }
    },
    morningStar(Type.martial, Range.melee) {
        final Type type = Type.martial;
        final Range range = Range.melee;

        @Override
        public String toString() {
            return "Morning-Star";
        }
    },
    pike(Type.martial, Range.melee) {
        final Type type = Type.martial;
        final Range range = Range.melee;

        @Override
        public String toString() {
            return "Pike";
        }
    },
    rapier(Type.martial, Range.melee) {
        final Type type = Type.martial;
        final Range range = Range.melee;

        @Override
        public String toString() {
            return "Rapier";
        }
    },
    scimitar(Type.martial, Range.melee) {
        final Type type = Type.martial;
        final Range range = Range.melee;

        @Override
        public String toString() {
            return "Scimitar";
        }
    },
    shortSword(Type.martial, Range.melee) {
        final Type type = Type.martial;
        final Range range = Range.melee;

        @Override
        public String toString() {
            return "Short-Sword";
        }
    },
    trident(Type.martial, Range.melee) {
        final Type type = Type.martial;
        final Range range = Range.melee;

        @Override
        public String toString() {
            return "Trident";
        }
    },
    warPick(Type.martial, Range.melee) {
        final Type type = Type.martial;
        final Range range = Range.melee;

        @Override
        public String toString() {
            return "War pick";
        }
    },
    warHammer(Type.martial, Range.melee) {
        final Type type = Type.martial;
        final Range range = Range.melee;

        @Override
        public String toString() {
            return "War-Hammer";
        }
    },
    whip(Type.martial, Range.melee) {
        final Type type = Type.martial;
        final Range range = Range.melee;

        @Override
        public String toString() {
            return "Whip";
        }
    },
    blowgun(Type.martial, Range.ranged) {
        final Type type = Type.martial;
        final Range range = Range.ranged;

        @Override
        public String toString() {
            return "Blow Gun";
        }
    },
    handCrossBow(Type.martial, Range.ranged) {
        final Type type = Type.martial;
        final Range range = Range.ranged;

        @Override
        public String toString() {
            return "Hand crossbow";
        }
    },
    heavyCrossbow(Type.martial, Range.ranged) {
        final Type type = Type.martial;
        final Range range = Range.ranged;

        @Override
        public String toString() {
            return "Heavy crossbow";
        }
    },
    longbow(Type.martial, Range.ranged) {
        final Type type = Type.martial;
        final Range range = Range.ranged;

        @Override
        public String toString() {
            return "Longbow";
        }
    },
    net(Type.martial, Range.ranged) {
        final Type type = Type.martial;
        final Range range = Range.ranged;

        @Override
        public String toString() {
            return "Net";
        }
    },
    ;
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
