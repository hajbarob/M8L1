package inter;

public class EspressoMachine extends AbstractCoffeeMachine{


    @Override
    public void makeCoffee(int amountOfCoffeine) {

    }

    public static class Test{
        public static void main(String[] args) {
            EspressoMachine em = new EspressoMachine();
            em.addWater();
            em.makeCoffee();
        }
    }
}


