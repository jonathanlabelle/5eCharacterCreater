package PlayerCharacter;

public enum Subraces {
    mountainDwarf (Races.dwarf){
        @Override
        public String toString() {
            return "Mountain dwarf";
        }
    },
    hillDwarf (Races.dwarf){
        @Override
        public String toString() {
            return "Hill dwarf";
        }
    },
    highElf (Races.elf) {
        @Override
        public String toString() {
            return "High elf";
        }
    },
    woodElf (Races.elf) {
        @Override
        public String toString() {
            return "Wood elf";
        }
    },
    drow (Races.elf) {
        @Override
        public String toString() {
            return "Drow";
        }
    },
    rockGnome (Races.gnome) {
        @Override
        public String toString() {
            return "Rock gnome";
        }
    },
    forestGnome (Races.gnome) {
        @Override
        public String toString() {
            return "Forest Gnome";
        }
    },
    lightfoot (Races.halfling) {
        @Override
        public String toString() { return "Lightfoot"; }
    },
    stout (Races.halfling) {
        @Override
        public String toString() { return "Stout" ; }
    },
    asmodeus (Races.tiefling){
        @Override
        public String toString() { return "Bloodline of Asmodeus"; }
    }
    ;
    Races race;
    Subraces(Races race) {
        this.race = race;
    }
    public static Races getRace(Subraces subrace) {
        Subraces[] constants = Subraces.values();
        return constants[subrace.ordinal()].race;
    }
}
