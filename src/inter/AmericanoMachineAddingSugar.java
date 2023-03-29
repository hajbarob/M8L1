package inter;

public class AmericanoMachineAddingSugar implements AddingSugarMachine {

    int amountOfSugar;

    @Override
    public void makeCoffee() {
        System.out.println("Making americano interface with " + amountOfSugar + " gramm of sugar");
    }

    @Override
    public void makeCoffee(int amountOfCoffeine) {

    }

    @Override
    public void addWater() {

    }


    @Override
    public void addSugar(int amountOfSugar) {
        this.amountOfSugar = amountOfSugar;
    }
}
