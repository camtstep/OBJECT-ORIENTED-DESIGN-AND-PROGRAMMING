package com.company;

public class PizzaQueue {

    private Pizza head;
    private Pizza tail;

    void enqueue(Pizza thisPizza) {
        if(head == null) {
            head = thisPizza;
        } else {
            tail.next = thisPizza;
        }
        tail = thisPizza;
    }

    Pizza dequeue() {

        Pizza pizzaToDeliver = null;

        if(head != null) {
            pizzaToDeliver = head;
            head = head.next;
            //return null;
        } else {
            tail = null;
        }
        return pizzaToDeliver;
    }

    void deliver() {
        Pizza thisPizza = dequeue();

        if(thisPizza == null) {
            System.out.println("No deliveries pending");
            } else {
                System.out.println("Deliver a pizza with " + thisPizza.ingredients
                        + " to " + thisPizza.address);
        }
    }
}
