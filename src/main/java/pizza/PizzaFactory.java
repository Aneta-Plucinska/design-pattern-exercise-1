package pizza;

public class PizzaFactory {

    public Pizza create(TypePizza typePizza) {
        if (TypePizza.CAPRICIOSA.equals(typePizza)) {

            return new CapriciosaPizza();

        } else if (TypePizza.FOURCHEESE.equals(typePizza)) {

            return new FourCheesePizza();

        } else if (TypePizza.HAWAI.equals(typePizza)) {

            return new HawaiPizza();

        } else if (TypePizza.MARGHERITA.equals(typePizza)) {

            return new MargheritaPizza();

        }
        return null;
    }
}
