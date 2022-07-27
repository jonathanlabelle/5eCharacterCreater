package Items;

import java.util.HashMap;

public class Tools extends Items {
    public Tools(String itemName, String cost, int weight) {
        super(itemName, cost, weight);
    }

    private static final HashMap<ToolsEnum, Tools> items = new HashMap<ToolsEnum, Tools>() {
        {
            put(ToolsEnum.alchemistsSupplies, new Tools("Alchemist's supplies", "50gp", 8));
            put(ToolsEnum.bagpipes, new Tools("Bagpipes", "30gp", 6));
            put(ToolsEnum.brewersSupplies, new Tools("Brewer's supplies", "20gp", 9));
            put(ToolsEnum.calligraphersSupplies, new Tools("Calligrapher's supplies", "10gp", 5));
            put(ToolsEnum.carpentersTools, new Tools("Carpenter's tools", "8gp", 6));
            put(ToolsEnum.cartographersTools, new Tools("Cartographer's tools", "15gp", 6));
            put(ToolsEnum.cobblersTools, new Tools("Cobbler's tools", "5gp", 5));
            put(ToolsEnum.cooksUtensils, new Tools("Cook's utensils", "5gp", 5));
            put(ToolsEnum.disguiseKit, new Tools("Disguise kit", "25gp", 3));
            put(ToolsEnum.drum, new Tools("Drum", "6gp", 3));
            put(ToolsEnum.dulcimer, new Tools("Dulcimer", "25gp", 10));
            put(ToolsEnum.flute, new Tools("Flute", "2gp", 1));
            put(ToolsEnum.forgeryKit, new Tools("Forgery kit", "15gp", 5));
            put(ToolsEnum.glassblowersTools, new Tools("Glassblower's tools", "30gp", 5));
            put(ToolsEnum.herbalismKit, new Tools("Herbalism kit", "5gp", 3));
            put(ToolsEnum.horn, new Tools("Horn", "3gp", 2));
            put(ToolsEnum.jewelersTools, new Tools("Jeweler's tools", "25gp", 2));
            put(ToolsEnum.leatherworkersTools, new Tools("Leatherworker's tools", "5gp", 5));
            put(ToolsEnum.lute, new Tools("Lute", "35gp", 2));
            put(ToolsEnum.lyre, new Tools("Lyre", "30gp", 2));
            put(ToolsEnum.masonTools, new Tools("Mason's tools", "10gp", 8));
            put(ToolsEnum.masonTools, new Tools("Navigator's tools", "25gp", 2));
            put(ToolsEnum.paintersSupplies, new Tools("Painter's supplies", "10gp", 5));
            put(ToolsEnum.panFlute, new Tools("Pan Flute", "12gp", 2));
            put(ToolsEnum.pottersTools, new Tools("Potter's tools", "10gp", 3));
            put(ToolsEnum.shawn, new Tools("Bagpipes", "2gp", 1));
            put(ToolsEnum.smithsTools, new Tools("Smith's tools", "20gp", 8));
            put(ToolsEnum.thievesTool, new Tools("Thieves' tool", "25", 1));
            put(ToolsEnum.thinkersTools, new Tools("Smith's tools", "50gp", 10));
            put(ToolsEnum.viol, new Tools("Viol", "30gp", 1));
            put(ToolsEnum.weaversTools, new Tools("Weaver's tools", "1gp", 5));
            put(ToolsEnum.woodcarversTools, new Tools("Woodcarver's tools", "1gp", 5));
        }
    };
    public static Tools getTool(ToolsEnum item) {
        return items.get(item);
    }
}
