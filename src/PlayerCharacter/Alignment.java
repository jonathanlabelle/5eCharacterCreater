package PlayerCharacter;

public enum Alignment {
    lawfulGood {
        @Override
        public String toString() {
            return "Lawful Good";
        }
    },
    neutralGood {
        @Override
        public String toString() {
            return "Neutral Good";
        }
    },
    chaoticGood {
        @Override
        public String toString() {
            return "Chaotic Good";
        }
    },
    lawfulNeutral {
        @Override
        public String toString() {
            return "Lawful Neutral";
        }
    },
    neutral {
        @Override
        public String toString() {
            return "Neutral";
        }
    },
    chaoticNeutral {
        @Override
        public String toString() {
            return "Chaotic Neutral";
        }
    },
    LawfulEvil {
        @Override
        public String toString() {
            return "Lawfful Evil";
        }
    },
    neutralEvil {
        @Override
        public String toString() {
            return "Neutral Evil";
        }
    },
    chaoticEvil {
        @Override
        public String toString() {
            return "Chaotic Evil";
        }
    }

}
