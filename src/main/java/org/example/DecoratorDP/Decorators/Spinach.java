package org.example.DecoratorDP.Decorators;

import org.example.DecoratorDP.BasePizza;

public class Spinach extends Topping{
    BasePizza Pizza;

    Spinach(BasePizza Pizza){
        this.Pizza = Pizza;
    }
    public int cost(){
        return 10;
    }
}
