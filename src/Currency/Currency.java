package Currency;

import java.util.HashMap;

public class Currency {
    private HashMap<CurrencyTypes, Integer> currency = new HashMap<CurrencyTypes, Integer>();

    public Currency() {
    }

    public static void changeCurrency(Currency currency, CurrencyTypes type, int total) {
        if (!currency.getCurrency().containsKey(type)) {
            currency.getCurrency().put(type, total);
        } else {
            currency.getCurrency().put(type, currency.getCurrency().get(type) + total);
            if (currency.getCurrency().get(type) < 1) {
                currency.getCurrency().remove(type);
            }
        }
    }

    public HashMap<CurrencyTypes, Integer> getCurrency() {
        return currency;
    }

    public void setCurrency(HashMap<CurrencyTypes, Integer> currency) {
        this.currency = currency;
    }
}
