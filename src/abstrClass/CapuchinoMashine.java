package abstrClass;

public class CapuchinoMashine extends CoffeeMachine{
    @Override
    public void makeCoffee() {
        System.out.println("Making capuchino abstr class");
    }

    @Override
    public void addSugar() {

    }

    @Override
    public void addToping(int amountOfToping) {
        //System.out.println("no toping for capuch without toping coffee");
    }

}
