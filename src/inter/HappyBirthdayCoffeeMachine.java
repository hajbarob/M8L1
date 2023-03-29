package inter;

public class HappyBirthdayCoffeeMachine extends AbstractCoffeeMachine{

    @Override
    public void makeCoffee() {
        System.out.println("making some amazing espresso with song");
    }

    @Override
    public void makeCoffee(int amountOfCoffeine) {

    }

    static class Test {
        public static void main(String[] args) {
            HappyBirthdayCoffeeMachine hpcm = new HappyBirthdayCoffeeMachine();
            hpcm.addWater();
            hpcm.makeCoffee();
        }
    }

}
