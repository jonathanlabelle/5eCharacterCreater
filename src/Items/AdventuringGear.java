package Items;

import java.util.HashMap;

public class AdventuringGear extends Items {

    public AdventuringGear(String itemName, String cost, int weight) {
        super(itemName, cost, weight);
    }

    private static final HashMap<AdventuringGearEnum, AdventuringGear> items = new HashMap<AdventuringGearEnum, AdventuringGear>() {
        {
        put(AdventuringGearEnum.abacus, new AdventuringGear("Abacus", "2gp", 2));
        put(AdventuringGearEnum.animalTrophy, new AdventuringGear("Animal Trophy", "4gp", 5));
        put(AdventuringGearEnum.blanket, new AdventuringGear("Abacus", "5sp", 3));
        put(AdventuringGearEnum.commonClothes, new AdventuringGear("Common Clothes", "5sp", 3));
        put(AdventuringGearEnum.costume, new AdventuringGear("Costume", "5gp", 4));
        put(AdventuringGearEnum.crowbar, new AdventuringGear("Crowbar", "2gp", 5));
        put(AdventuringGearEnum.favorOfAnAdmirer, new AdventuringGear("Favor of an admirer", "0gp", 0));
        put(AdventuringGearEnum.fineClothes, new AdventuringGear("Fine clothes", "15gp", 6));
        put(AdventuringGearEnum.holySymbolAmulet, new AdventuringGear("Amulet", "5gp", 1));
        put(AdventuringGearEnum.holySymbolEmblem, new AdventuringGear("Emblem", "5gp", 0));
        put(AdventuringGearEnum.holySymbolReliquary, new AdventuringGear("Reliquary", "5gp", 2));
        put(AdventuringGearEnum.huntingTrap, new AdventuringGear("Hunting trap", "5gp", 25));
        put(AdventuringGearEnum.ink, new AdventuringGear("Ink 1oz", "10gp", 0));
        put(AdventuringGearEnum.ironPot, new AdventuringGear("Iron pot", "2gp", 10));
        put(AdventuringGearEnum.letterOfIntroductionToGuild, new AdventuringGear("Letter of introduction to guild", "0gp", 0));
        put(AdventuringGearEnum.markedCards, new AdventuringGear("Deck of marked cards", "1gp", 1));
        put(AdventuringGearEnum.petMouse, new AdventuringGear("Pet mouse", "0", 0));
        put(AdventuringGearEnum.prayerBook, new AdventuringGear("Prayer book", "0", 0));
        put(AdventuringGearEnum.quill, new AdventuringGear("Quill", "1sp", 0));
        put(AdventuringGearEnum.scrollCase, new AdventuringGear("Scroll case", "2gp", 4));
        put(AdventuringGearEnum.scrollOfPedigree, new AdventuringGear("Scroll of pedigree", "0", 0));
        put(AdventuringGearEnum.shovel, new AdventuringGear("Shovel", "1gp", 1));
        put(AdventuringGearEnum.silkRope, new AdventuringGear("Silk rope (50ft)", "10gp", 5));
        put(AdventuringGearEnum.signetRing, new AdventuringGear("Signet ring", "5gp", 0));
        put(AdventuringGearEnum.smallKnife, new AdventuringGear("Small knife", "0", 0));
        put(AdventuringGearEnum.staff, new AdventuringGear("Staff", "2sp", 4));
        put(AdventuringGearEnum.stickOfEssence, new AdventuringGear("Stick of essence", "1gp", 0));
        put(AdventuringGearEnum.stopperedBottle, new AdventuringGear("Stoppered bottle", "1sp", 0));
        put(AdventuringGearEnum.travelersClothes, new AdventuringGear("Traveler's clothes", "2gp", 4));
        put(AdventuringGearEnum.vestments, new AdventuringGear("Vestments", "0", 0));
        put(AdventuringGearEnum.weightedDice, new AdventuringGear("Set of weighted dice", "1gp", 0));
        }
    };
    public static AdventuringGear getAdventuringGear(AdventuringGearEnum item) {
        return items.get(item);
    }

}
