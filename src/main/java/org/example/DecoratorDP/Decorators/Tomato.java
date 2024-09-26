package org.example.DecoratorDP.Decorators;

import org.example.DecoratorDP.BasePizza;

public class Tomato extends Topping{
    BasePizza Pizza;

    Tomato(BasePizza Pizza){
        this.Pizza = Pizza;
    }
    public int cost(){
        return 7;
    }
}
