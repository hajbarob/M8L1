package abstrClass;

public class Main {
    public static void main(String[] args) {
        AmericanoMachine am = new AmericanoMachine();
        CapuchinoMashine cm = new CapuchinoMashine();
        CapuchinoWithToping cwt = new CapuchinoWithToping();
//        cwt.addToping(6);
//        cwt.makeCoffee();

        CoffeeMachine[] cmArray = {am, cm, cwt};

        for (CoffeeMachine currentCM : cmArray) {
            currentCM.addToping(7);
            currentCM.makeCoffee();
        }


    }
}
