import java.lang.reflect.Array;
import java.util.ArrayList;

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
    }

}
