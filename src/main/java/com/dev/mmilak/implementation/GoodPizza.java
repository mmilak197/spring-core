package com.dev.mmilak.implementation;

import com.dev.mmilak.api.IPizza;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@PropertySource("classpath:price.properties")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class GoodPizza implements IPizza {

    private int price;
    private String name;

    //public GoodPizza(@Value("1") int price, @Value("Dobra") String name) {
    public GoodPizza(@Value("${price_dobrej}") int price, @Value("${nazwa}") String name) {
        super();
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
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
