package Patterns.Factory;

public class CoffeeMachine {

    private final CoffeeFactory coffeeFactory;

    public CoffeeMachine(CoffeeFactory coffeeFactory){
        this.coffeeFactory = coffeeFactory;
    }

    private void makeCoffee(){
        System.out.println("Готовим кофе");
    }

    private void pourIntoCup(){
        System.out.println("Наливаем в чашку");
    }

    public Coffee orderCoffee(CoffeeType coffeeType){
        Coffee coffee = coffeeFactory.createCoffee(coffeeType);

        makeCoffee();

        pourIntoCup();

        System.out.println("Возьмите ваше : " + coffeeType);

        return coffee;
    }
}
