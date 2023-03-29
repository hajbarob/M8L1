package inter;

public class CapuchinoMachine implements AddingTopingMachine {

    int amountOfToping;

    @Override
    public void addToping(int amountOfToping) {
        this.amountOfToping = amountOfToping;
    }


    @Override
    public void makeCoffee(int amountOfCoffeine) {
        System.out.println("Making americano interface with " + amountOfToping + " gramm of sugar");
    }

    @Override
    public void addWater() {

    }
}
