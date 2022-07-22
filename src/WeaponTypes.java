enum Type { martial, simple}
enum Range {melee, ranged}

public enum WeaponTypes {
    club {
        final Type type = Type.simple;
        final Range range = Range.melee;
        @Override
        public String toString() {
            return "Club";
        }
    },
    dagger {
        final Type type = Type.simple;
        final Range range = Range.melee;
        @Override
        public String toString() {
            return "Dagger";
        }
    },
    greatclub {
        final Type type = Type.simple;
        final Range range = Range.melee;
        @Override
        public String toString() {
            return "Greatclub";
        }
    },
    handaxe {
        final Type type = Type.simple;
        final Range range = Range.melee;
        @Override
        public String toString() {
            return "Handaxe";
        }
    },
    javelin {
        final Type type = Type.simple;
        final Range range = Range.melee;
        @Override
        public String toString() {
            return "Javelin";
        }
    },
    lightHammer {
        final Type type = Type.simple;
        final Range range = Range.melee;
        @Override
        public String toString() {
            return "Light hammer";
        }
    },
    mace {
        final Type type = Type.simple;
        final Range range = Range.melee;
        @Override
        public String toString() {
            return "Mace";
        }
    },
    sickle {
        final Type type = Type.simple;
        final Range range = Range.melee;
        @Override
        public String toString() {
            return "Sickle";
        }
    },
    spear {
        final Type type = Type.simple;
        final Range range = Range.melee;
        @Override
        public String toString() {
            return "Spear";
        }
    },
    lightCrossbow {
        final Type type = Type.simple;
        final Range range = Range.ranged;
        @Override
        public String toString() {
            return "Light crossbow";
        }
    },
    dart {
        final Type type = Type.simple;
        final Range range = Range.ranged;
        @Override
        public String toString() {
            return "Dart";
        }
    },
    shortbow {
        final Type type = Type.simple;
        final Range range = Range.ranged;
        @Override
        public String toString() {
            return "Shortbow";
        }
    },
    sling {
        final Type type = Type.simple;
        final Range range = Range.ranged;
        @Override
        public String toString() {
            return "Sling";
        }
    },
    battleaxe {
        final Type type = Type.martial;
        final Range range = Range.melee;
        @Override
        public String toString() {
            return "Battleaxe";
        }
    },
    flail {
        final Type type = Type.martial;
        final Range range = Range.melee;
        @Override
        public String toString() {
            return "Flail";
        }
    },
    glaive {
        final Type type = Type.martial;
        final Range range = Range.melee;
        @Override
        public String toString() {
            return "Glaive";
        }
    },
    greataxe {
        final Type type = Type.martial;
        final Range range = Range.melee;
        @Override
        public String toString() {
            return "Greataxe";
        }
    },
    greatsword {
        final Type type = Type.martial;
        final Range range = Range.melee;
        @Override
        public String toString() {
            return "Greatsword";
        }
    },
    hallberd {
        final Type type = Type.martial;
        final Range range = Range.melee;
        @Override
        public String toString() {
            return "Hallberd";
        }
    },
    lance {
        final Type type = Type.martial;
        final Range range = Range.melee;
        @Override
        public String toString() {
            return "Lance";
        }
    },
    longsword {
        final Type type = Type.martial;
        final Range range = Range.melee;
        @Override
        public String toString() {
            return "Longsword";
        }
    },
    Maul {
        final Type type = Type.martial;
        final Range range = Range.melee;
        @Override
        public String toString() {
            return "Maul";
        }
    },
    morningstar {
        final Type type = Type.martial;
        final Range range = Range.melee;
        @Override
        public String toString() {
            return "Morningstar";
        }
    },
    pike {
        final Type type = Type.martial;
        final Range range = Range.melee;
        @Override
        public String toString() {
            return "Pyke";
        }
    },
    rapier {
        final Type type = Type.martial;
        final Range range = Range.melee;
        @Override
        public String toString() {
            return "Rapier";
        }
    },
    scimitar {
        final Type type = Type.martial;
        final Range range = Range.melee;
        @Override
        public String toString() {
            return "Scimitar";
        }
    },
    shortsword {
        final Type type = Type.martial;
        final Range range = Range.melee;
        @Override
        public String toString() {
            return "Shortsword";
        }
    },
    trident {
        final Type type = Type.martial;
        final Range range = Range.melee;
        @Override
        public String toString() {
            return "Trident";
        }
    },
    warPick {
        final Type type = Type.martial;
        final Range range = Range.melee;
        @Override
        public String toString() {
            return "War pick";
        }
    },
    warharmmer {
        final Type type = Type.martial;
        final Range range = Range.melee;
        @Override
        public String toString() {
            return "Warhammer";
        }
    },
    whip {
        final Type type = Type.martial;
        final Range range = Range.melee;
        @Override
        public String toString() {
            return "Whip";
        }
    },
    blowgun {
        final Type type = Type.martial;
        final Range range = Range.ranged;
        @Override
        public String toString() {
            return "Blowgun";
        }
    },
    handCrossbow {
        final Type type = Type.martial;
        final Range range = Range.ranged;
        @Override
        public String toString() {
            return "Hand crossbow";
        }
    },
    heavyCrossbow {
        final Type type = Type.martial;
        final Range range = Range.ranged;
        @Override
        public String toString() {
            return "Heavy crossbow";
        }
    },
    longbow {
        final Type type = Type.martial;
        final Range range = Range.ranged;
        @Override
        public String toString() {
            return "Longbow";
        }
    },
    net {
        final Type type = Type.martial;
        final Range range = Range.ranged;
        @Override
        public String toString() {
            return "Net";
        }
    }
}
