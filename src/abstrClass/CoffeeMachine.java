package abstrClass;

public abstract class CoffeeMachine {

    public void makeCoffee(){
        System.out.println("making some coffee");
    }

    public abstract void addSugar();

    public abstract void addToping(int amountOfToping);

}
