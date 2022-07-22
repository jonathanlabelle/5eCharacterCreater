public enum Conditions {
    blinded { @Override
        public String toString() { return "Blinded"; }
    },
    charmed {
        @Override
        public String toString() { return "Charmed"; }
    },
    deafened {
        @Override
        public String toString() { return "Deafened"; }
    },
    frightened {
        @Override
        public String toString() { return  "Frightened" ; }
    },
    grappled {
        @Override
        public String toString() { return "Grappled"; }
    },
    incapacitated {
        @Override
        public String toString() { return "Incapacitated"; }
    },
    invisible {
        @Override
        public String toString() { return "Invisible"; }
    },
    paralyzed {
        @Override
        public String toString() { return "Paralyzed"; }
    },
    petrified {
        @Override
        public String toString() { return "Petrified"; }
    },
    poisoned {
        @Override
        public String toString() { return "Poisoned"; }
    },
    prone {
        @Override
        public String toString() { return "Prone"; }
    },
    restrained {
        @Override
        public String toString() { return "Restrained"; }
    },
    stunned {
        @Override
        public String toString() { return "Stunned"; }
    },
    unconscious {
        @Override
        public String toString() { return "Unconscious"; }
    };
}
