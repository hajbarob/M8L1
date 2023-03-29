package abstrClass;

public class AmericanoMachine extends CoffeeMachine{
    @Override
    public void makeCoffee() {
        System.out.println("Making americano abstr class");
    }

    @Override
    public void addSugar() {

    }

    @Override
    public void addToping(int amountOfToping) {
        //System.out.println("no toping for americ coffee");
    }

}
