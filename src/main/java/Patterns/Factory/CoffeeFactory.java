package Patterns.Factory;

public class CoffeeFactory {

    public Coffee createCoffee(CoffeeType coffeeType){
        Coffee coffee = switch (coffeeType) {
            case AMERICANO -> new Americano();
            case ESPRESSO -> new Espresso();
        };

        return coffee;
    }
}
