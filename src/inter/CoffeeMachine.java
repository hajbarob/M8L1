package inter;

public interface CoffeeMachine {

    public default void makeCoffee() {
        makeCoffee(10);
    };

    public void makeCoffee(int amountOfCoffeine);

    public void addWater();

    public default void playJingleBells() {
        System.out.println("Jingle Bells Jingle Bells");
    }

}
