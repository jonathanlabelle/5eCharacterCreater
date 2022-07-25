package Currency;

public enum CurrencyTypes {
    cp {
        @Override
        public String toString() {
            return "Copper";
        }
    },
    sp {
        @Override
        public String toString() {
            return "Silver";
        }
    },
    ep {
        @Override
        public String toString() {
            return "Electrum";
        }
    },
    gp {
        @Override
        public String toString() {
            return "Gold";
        }
    },
    pc {
        @Override
        public String toString() {
            return "Platinum";
        }
    }
}
