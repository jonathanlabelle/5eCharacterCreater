package Items;

public enum ArmorTypes {
    lightArmor {
        @Override
        public String toString() {
            return "Light armor";
        }
    },
    mediumArmor {
        @Override
        public String toString() {
            return "Medium armor";
        }
    },
    heavyArmor {
        @Override
        public String toString() {
            return "Heavy armor";
        }
    },
    shield {
        @Override
        public String toString() {
            return "Shield";
        }
    }
}