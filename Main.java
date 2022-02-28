package com.company;

public class Main {
    public static void main(String[] args) {
        PizzaQueue queue = new PizzaQueue();

        queue.enqueue(new Pizza("pepperoni", "1234 Bobcat Trail"));
        queue.enqueue(new Pizza("sausage", "2345 University Drive"));
        queue.deliver();
        queue.enqueue(new Pizza("extra cheese", "3456 Rickster Road"));
        queue.enqueue(new Pizza("everything", "4567 King Court"));
        queue.enqueue(new Pizza("coffee beans", "5678 Java Circle"));
        queue.deliver();
        queue.deliver();
        queue.deliver();
        queue.deliver();
        queue.deliver();
    }
}
