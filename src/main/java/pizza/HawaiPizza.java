package pizza;

import java.util.Arrays;

public class HawaiPizza extends Pizza{

    private String name = "Hawai";

    public HawaiPizza() {
        super(28.00, Arrays.asList("Cheese", "Ham", "Pineapple"));
    }

    @Override
    public String toString() {
        return name + super.toString();
    }

//    public HawaiPizza() {
//        components = Arrays.asList("Cheese", "Ham", "Pineapple");
//        cost = 28.00;
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
//        return "HawaiPizza{" +
//                "cost=" + cost +
//                ", components=" + components +
//                '}';
//    }
}
