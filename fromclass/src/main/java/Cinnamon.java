
public class Cinnamon extends CoffeeDecorator{

    private double cost = .40;

    Cinnamon(Coffee specialCoffee){
        super(specialCoffee);
    }

    public double makeCoffee() {
        return specialCoffee.makeCoffee()+ addCinnamon();
    }

    private double addCinnamon() {

        System.out.println(" + cinnamon: $.40");

        return cost;
    }
}