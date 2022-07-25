package Items;

import java.util.HashMap;

public class AdventuringGear extends Items {

    public AdventuringGear(String itemName, String cost, int weight) {
        super(itemName, cost, weight);
    }

    private static final HashMap<AdventuringGearEnum, AdventuringGear> items = new HashMap<AdventuringGearEnum, AdventuringGear>() {
        {
        put(AdventuringGearEnum.abacus, new AdventuringGear("Abacus", "2gp", 2));
        put(AdventuringGearEnum.commonClothes, new AdventuringGear("Common Clothes", "5sp", 3));
        put(AdventuringGearEnum.fineClothes, new AdventuringGear("Fine clothes", "15gp", 6));
        put(AdventuringGearEnum.holySymbolAmulet, new AdventuringGear("Amulet", "5gp", 1));
        put(AdventuringGearEnum.holySymbolEmblem, new AdventuringGear("Emblem", "5gp", 0));
        put(AdventuringGearEnum.holySymbolReliquary, new AdventuringGear("Reliquary", "5gp", 2));
        put(AdventuringGearEnum.markedCards, new AdventuringGear("Deck of marked cards", "1gp", 1));
        put(AdventuringGearEnum.prayerBook, new AdventuringGear("Prayer book", "0", 0));
        put(AdventuringGearEnum.signetRing, new AdventuringGear("Signet ring", "5gp", 0));
        put(AdventuringGearEnum.stickOfEssence, new AdventuringGear("Stick of essence", "1gp", 0));
        put(AdventuringGearEnum.stopperedBottle, new AdventuringGear("Stoppered bottle", "1sp", 0));
        put(AdventuringGearEnum.vestments, new AdventuringGear("Vestments", "0", 0));
        put(AdventuringGearEnum.weightedDice, new AdventuringGear("Set of weighted dice", "1gp", 0));
        }
    };
    public static AdventuringGear getAdventuringGear(AdventuringGearEnum item) {
        return items.get(item);
    }

}
