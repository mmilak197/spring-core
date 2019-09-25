package com.dev.mmilak.pizzeria;

import com.dev.mmilak.api.IOrder;
import com.dev.mmilak.config.AutoConfig;
import com.dev.mmilak.config.Config;
import com.dev.mmilak.implementation.Order;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoConfig.class);
        IOrder order = (IOrder) context.getBean(IOrder.class);
        order.printOrder();

        IOrder order2 = context.getBean(Order.class);
        order2.printOrder();
    }
}
