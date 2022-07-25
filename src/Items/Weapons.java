package Items;

import Rules.DamageTypes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Weapons extends Items {

    String damage;
    DamageTypes damageType;
    List<WeaponProperties> properties;

    public Weapons(String itemName, String  cost, int weight, String damage, DamageTypes damageType, List<WeaponProperties> properties) {
        super(itemName, cost, weight);
        this.damage = damage;
        this.damageType = damageType;
        this.properties = properties;
    }

    private static final HashMap<WeaponsEnum, Weapons> weapons = new HashMap<WeaponsEnum, Weapons>() {
        {
            put(WeaponsEnum.club, new Weapons("Club", "1gp", 4, "1d4", DamageTypes.bludgeoning, Arrays.asList(WeaponProperties.light)));
        }
    };

    public static Weapons getWeapon(WeaponsEnum weaponName) {
        return weapons.get(weaponName);
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public DamageTypes getDamageType() {
        return damageType;
    }

    public void setDamageType(DamageTypes damageType) {
        this.damageType = damageType;
    }

    public List<WeaponProperties> getProperties() {
        return properties;
    }

    public void setProperties(List<WeaponProperties> properties) {
        this.properties = properties;
    }
}
