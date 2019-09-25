package com.dev.mmilak.implementation;

import com.dev.mmilak.api.GoodPizza;
import com.dev.mmilak.api.IOrder;
import com.dev.mmilak.api.IPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ExclusiveOrder implements IOrder {

    private IPizza pizza;

    public ExclusiveOrder(IPizza pizza) {
        super();
        this.pizza = pizza;
    }

    public void printOrder() {
        System.out.println("Zamowienie exclusive: " + pizza.getName() + " cena: " + pizza.getPrice());
    }

    //@Autowired
    //@GoodPizza
    @Value("#{exoticPizza}")
    public void setPizza(IPizza pizza) {
        this.pizza = pizza;
    }
}
