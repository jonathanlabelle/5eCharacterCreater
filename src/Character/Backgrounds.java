package Character;

public enum Backgrounds {

    acolyte (
            "Skill proficiencies: Insight and Religion.\n" +
            "Character.Languages: 2 of your choice.\n" +
            "Equipment: 1 Holy symbol, 1 payer book, 5 sticks of incense vestments, common clothes, pouch with 15 gp"
    ) {
        @Override
        public String toString() {
            return "Acolyte";
        }
    },
    charlatan (
            "Skill proficiencies: Deception, Sleight of Hand.\n" +
            "Tool proficiencies: Disguise kit, forgery kit.\n" +
            "Equipment: Fine clothes, 1 disguise kit, 1 of (Ten stoppered bottles filled with colored liquid, " +
            "1 set of weighted dice, 1 deck of marked cards, 1 signet ring of an imaginary duke), 15 gp"
    ) {
        @Override
        public String toString() {
            return "Charlatan";
        }
    },
    criminal (
            "Skill proficiencies: Deception, Stealth.\n" +
            "Tools proficiencies: 1 of (Dice.Dice set or Playing card set), Thieves tools.\n" +
            "Equipment: 1 crowbar, common clothes, 15gp"
    ) {
        @Override
        public String toString() {
            return "Criminal";
        }
    },
    entertainer (
            "Skill proficiencies: Acrobatics, Performance.\n" +
            "Tool proficiencies: Disguise kit, one musical instrument.\n" +
            "Equipment: 1 musical instrument, 1 favor of an admirer(love letter, lock of hair or trinket), 15gp"
    ) {
        @Override
        public String toString() {
            return "Entertainer";
        }
    },
    folkHero (
            "Skill proficiencies: Animal Handling, Survival.\n" +
            "Tool proficiencies: 1 of artisan tool, vehicles.\n" +
            "Equipment: 1 artisan's tools of your choice, 1 shove, 1 iron pot, common clothes, 10gp"
    ) {
        @Override
        public String toString() {
            return "Folk Hero";
        }
    },
    gladiator (
            "Skill proficiencies: Acrobatics, Performance.\n" +
            "Tool proficiencies: Disguise kit, one musical instrument.\n" +
            "Equipment: 1 inexpensive but unusual weapon, 1 favor of an admirer(love letter, lock of hair or trinket), 15gp"
    ) {
        @Override
        public String toString() {
            return "Gladiator";
        }
    },
    guildArtisan (
            "Skill proficiencies: Insight, Persuasion.\n" +
            "Tool proficiencies: One type of artisan's tools.\n" +
            "Equipment: One set of artisan's tools, 1 letter of introduction from our guild, traveler's clothes, 15gp"
    ) {
        @Override
        public String toString() {
            return "Guild Artisan";
        }
    },
    guildMerchant (
            "Skill proficiencies: Insight, Persuasion.\n" +
            "Language: One of your choice.\n" +
            "Equipment: 1 of (mule or cart), 1 letter of introduction from our guild, traveler's clothes, 15gp"
    ) {
        @Override
        public String toString() {
            return "Guild Merchant";
        }
    },
    hermit (
            "Skill proficiencies: Medecine, Religion.\n" +
            "Tool proficiencies: Herbalism kit.\n" +
            "Language: One of your choice.\n" +
            "Equipment: Scroll case, 1 winter blanket, common clothes, herbalism kit, 5gp"
    ) {
        @Override
        public String toString() {
            return "Hermit";
        }
    },
    knight (
            "Skill proficiencies: History, Persuasion.\n" +
            "Tool proficiencies: 1 of (dice set, playing card set).\n" +
            "Language: 1 of your choice.\n" +
            "Equipment: Fine clothes, signet ring, scroll of pedigree, 25gp"
    ) {
        @Override
        public String toString() {
            return "Knight";
        }
    },
    noble (
            "Skill proficiencies: History, Persuasion.\n" +
            "Tool proficiencies: 1 of (dice set, playing card set).\n" +
            "Language: 1 of your choice.\n" +
            "Equipment: Fine clothes, signet ring, scroll of pedigree, 25gp"
    ) {
        @Override
        public String toString() {
            return "Noble";
        }
    },
    outlander (
            "Skill proficiencies: Atheltics, Survival.\n" +
            "Tool proficiencies: 1 type of musical instruments.\n" +
            "Language: 1 of your choice.\n" +
            "Equipment: 1 staff, 1 hunting trap, 1 trophy of an animal, traveler's clothes, 10gp"
    ) {
        @Override
        public String toString() {
            return "Outlander";
        }
    },
    sage (
            "Skill proficiencies: Arcana, History.\n" +
            "Language: 2 of your choice.\n" +
            "Equipment: 1 bottle of ink, 1 quill, 1 small knife, common clothes, 1 letter from a dead colleague with a" +
            " question you have not yet been able to answer, 10gp"
    ) {
        @Override
        public String toString() {
            return "Sage";
        }
    },
    sailor (
            "Skill proficiencies: Athletics, Perception.\n" +
            "Tool proficiencies: Navigator's tools, vehicles.\n" +
            "Equipment: 1 club, 1 silk rope (50 feet), 1 lucky charm, common clothes, 10gp."
    ) {
        @Override
        public String toString() {
            return "Sailor";
        }
    },
    soldier (
            "Skill proficiencies: Athletics, Intimidation.\n" +
            "Tool proficiencies: 1 of (dice set, playing card set), vehicles.\"" +
            "Equipment: Isignia of your rank, trophy from a fallen enemy (1 dagger, 1 broken blade or 1 piece of" +
            " banner), 1 of (set of bone dice or deck of cards), common clothes, 10gp."
    ) {
        @Override
        public String toString() {
            return "Soldier";
        }
    },
    spy (
            "Skill proficiencies: Deception, Stealth.\n" +
            "Tools proficiencies: 1 of (Dice.Dice set or Playing card set), Thieves tools.\n" +
            "Equipment: 1 crowbar, common clothes, 15gp"
    ) {
        @Override
        public String toString() {
            return "Spy";
        }
    },
    urchin (
            "Skill proficiencies: Sleight of hand, Stealth.\n" +
            "Tool proficiencies: Disguise kit, thieve's tools.\n" +
            "Equipment: 1 small knife, map of city you grew in, 1x pet mouse, 1 token from your parent, common clothes," +
            " 10gp"
    ) {
        @Override
        public String toString() {
            return "Urchin";
        }
    }
    ;

    private final String description;
    Backgrounds(String description) {  this.description = description; }
    public String getBackgroundDescription() {
        return description;
    }
}
