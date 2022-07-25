package Items;

import java.util.HashMap;

public class Tools extends Items {
    public Tools(String itemName, String cost, int weight) {
        super(itemName, cost, weight);
    }

    private static final HashMap<ToolsEnum, Tools> items = new HashMap<ToolsEnum, Tools>() {
        {
            put(ToolsEnum.disguiseKit, new Tools("Disguise kit", "25gp", 3));
            put(ToolsEnum.forgeryKit, new Tools("Forgery kit", "15gp", 5));
        }
    };
    public static Tools getTool(ToolsEnum item) {
        return items.get(item);
    }
}
