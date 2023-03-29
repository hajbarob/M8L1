package abstrClass;

public class CapuchinoWithToping extends CoffeeMachine{

    private int amountOfToping = 0;

    @Override
    public void makeCoffee() {
        System.out.println("Making americano abstr class with " + amountOfToping + " ml of toping");
        amountOfToping = 0;
    }

    @Override
    public void addSugar() {

    }

    public void addToping(int amountOfToping) {
        this.amountOfToping = amountOfToping;
    }
}
