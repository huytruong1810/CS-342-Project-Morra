
public class SeaSalt extends CoffeeDecorator{

    private double cost = .70;

    SeaSalt(Coffee specialCoffee){
        super(specialCoffee);
    }

    public double makeCoffee() {
        return specialCoffee.makeCoffee()+ addSeaSalt();
    }

    private double addSeaSalt() {

        System.out.println(" + sea salt: $.70");

        return cost;
    }
}