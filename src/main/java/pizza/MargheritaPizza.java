package pizza;

import java.util.Arrays;

public class MargheritaPizza extends Pizza{

    private String name = "Margherita";

    public MargheritaPizza() {
        super(24.00, Arrays.asList("Cheese", "Oregano"));
    }

    @Override
    public String toString() {
        return name + super.toString();
    }

    //    public MargheritaPizza() {
//        components = Arrays.asList("Cheese", "Oregano");
//        cost = 24.00;
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
//

}
