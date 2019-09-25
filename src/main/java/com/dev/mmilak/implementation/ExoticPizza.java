package com.dev.mmilak.implementation;

import com.dev.mmilak.api.GoodPizza;
import com.dev.mmilak.api.IPizza;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@GoodPizza
public class ExoticPizza implements IPizza {

    private int price;
    private String name;
    @Value("#{goodPizza.price matches '[1-9][1-9]'}")
    boolean bool;

    public ExoticPizza(@Value("#{T(java.lang.Math).random()*10}") int price, @Value("#{goodPizza.getName()?.toUpperCase()}") String name) {
        super();
        this.price = price;
        this.name = name;
    }


    public int getPrice() {
        System.out.println(bool);
        return price;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }
}
