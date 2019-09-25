package com.dev.mmilak.implementation;

import com.dev.mmilak.api.IOrder;
import com.dev.mmilak.api.IPizza;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Order implements IOrder {


    private IPizza pizza;

    //public Order(@Qualifier("goodPizza") IPizza pizza) {
    public Order(@Value("#{goodPizza}") IPizza pizza) {
        super();
        this.pizza = pizza;
    }

    public void printOrder() {
        System.out.println("Zamowienie : " + pizza.getName() + " cena: " + pizza.getPrice());
    }
}
