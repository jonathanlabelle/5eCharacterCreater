package PlayerCharacter;

import Items.Items;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class InventoryItem {
    private static HashMap<Items, Integer> items = new HashMap<Items, Integer>();

    public static void changeInventory(InventoryItem inventory, Items item, Integer number) {
        if (!inventory.getItems().containsKey(item)) {
            inventory.getItems().put(item, number);
        } else {
            inventory.getItems().put(item, items.get(item) + number);
        } if (inventory.getItems().get(item) < 1) {
            inventory.getItems().remove(item);
        }
    }

    public static void changeInventoryAdd1Multiple(InventoryItem inventory,ArrayList<Items> items) {
        for (Items item : items) {
            changeInventory(inventory, item, 1);
        }
    }

    public static StringBuilder printInventory(InventoryItem inventory) {
        StringBuilder s = new StringBuilder();
        for (Map.Entry<Items, Integer> item : inventory.getItems().entrySet()) {
            s.append(item.getValue()).append(" - ").append(item.getKey().itemName).append("\n");
        }
        return s;
    }
    public HashMap<Items, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<Items, Integer> items) {
        this.items = items;
    }
}
