package inter;

public abstract class AbstractCoffeeMachine implements CoffeeMachine {

    @Override
    public void addWater() {
        System.out.println("adding water");
    }

    @Override
    public void makeCoffee() {
        System.out.println("making some espresso");
    }
}
