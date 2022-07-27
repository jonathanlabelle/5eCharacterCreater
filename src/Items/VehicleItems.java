package Items;

import java.util.HashMap;

public class VehicleItems extends Items{

    public VehicleItems(String itemName, String cost, int weight) {
        super(itemName, cost, weight);

    }

    private static final HashMap<VehicleItemsEnum, VehicleItems> items = new HashMap<VehicleItemsEnum, VehicleItems>() {
        {
            put(VehicleItemsEnum.cart, new VehicleItems("Cart", "15gp", 200));
        }
    };

    public static VehicleItems getVehicleItem(VehicleItemsEnum item) {
        return items.get(item);
    }
}
