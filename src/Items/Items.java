package Items;

public abstract class Items {
    public String itemName;
    public String cost;
    public int weight;

    public Items(String itemName, String cost, int weight) {
        this.itemName = itemName;
        this.cost = cost;
        this.weight = weight;
    }

}
