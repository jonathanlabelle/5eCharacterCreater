package PlayerCharacter;

public enum Races {
    dragonborn {
        @Override
        public String toString() {
            return "Dragonborn";
        }
    },
    dwarf {
        @Override
        public String toString() {
            return "Dwarf";
        }
    },
    elf {
        @Override
        public String toString() {
            return "Elf";
        }
    },
    gnome {
        @Override
        public String toString() {
            return "Gnome";
        }
    },
    halfElf {
        @Override
        public String toString() {
            return "Half elf";
        }
    },
    halfOrc {
        @Override
        public String toString() { return "Half-orc"; }
    },
    halfling {
        @Override
        public String toString() { return "Halfling"; }
    },
    human {
        @Override
        public String toString() { return "Human"; }
    },
    tiefling {
        @Override
        public String toString() { return "Tiefling"; }
    }

}
