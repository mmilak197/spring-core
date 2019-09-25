package com.dev.mmilak.config;

import com.dev.mmilak.api.IOrder;
import com.dev.mmilak.api.IPizza;
import com.dev.mmilak.implementation.GoodPizza;
import com.dev.mmilak.implementation.Order;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class Config { //Configuracja ręczna za pomoca klas javy

    //aby polaczyc configuracje reczna i automatyczna musimy zastosować adnotacje @Import

    /*@Bean
    public IPizza pizza() {  //recznie musimy obsluzyc jakie Beany maja zostac stworzone
        return new GoodPizza(15, "Dobra");
    }*/

    /*@Bean
    public IOrder order(IPizza pizza) {
        return new Order(pizza);
    }*/
}
