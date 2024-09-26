package org.example.DecoratorDP.Decorators;

import org.example.DecoratorDP.BasePizza;

public class Onion extends Topping{
    BasePizza Pizza;

    Onion(BasePizza Pizza){
        this.Pizza = Pizza;
    }
    @Override
    public int cost() {
        return 5;
    }
}
