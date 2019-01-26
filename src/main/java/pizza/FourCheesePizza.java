package pizza;

import java.util.Arrays;

public class FourCheesePizza extends Pizza {

    private String name = "FourCheese";

    public FourCheesePizza() {
        super(32.00, Arrays.asList("Cheese 1", "Cheese 2", "Cheese 3", "Cheese 4"));
    }

    @Override
    public String toString() {
        return name + super.toString();
    }


//    public FourCheesePizza() {
//        components = Arrays.asList("Cheese", "Ham", "Champignons");
//        cost = 29.00;
//    }
//
//    public double getCost() {
//        return cost;
//    }
//
//    public void setCost(double cost) {
//        this.cost = cost;
//    }
//
//    public List<String> getComponents() {
//        return components;
//    }
//
//    public void setComponents(List<String> components) {
//        this.components = components;
//    }
//
//    public void showPizzaInfo(){
//        System.out.println(this.toString());
//    }
//
//    @Override
//    public String toString() {
//        return "FourCheesePizza{" +
//                "cost=" + cost +
//                ", components=" + components +
//                '}';
//    }
}
