package Items;

import java.util.HashMap;

public class Mounts extends Items {

    int speed;
    int capacity;

    public Mounts(String itemName, String cost, int weight, int speed, int capacity) {
        super(itemName, cost, weight);
        this.speed = speed;
        this.capacity = capacity;
    }

    private static final HashMap<MountEnum, Mounts> items = new HashMap<MountEnum, Mounts>() {
        {
            put(MountEnum.donkey, new Mounts("Donkey", "8gp", 0, 40, 420));
            put(MountEnum.mule, new Mounts("Donkey", "8gp", 0, 40, 420));
        }
    };

    public static Mounts getMount(MountEnum item) {
        return items.get(item);
    }
}
