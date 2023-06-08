package com.example.evalutaion_java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {

    @Test
    void getNom() {
        Pizza pizza = new Pizza();
        pizza.setNom("Pizza");
        assertEquals("Pizza", pizza.getNom());

    }

    @Test
    void setPrix( int prix) {
        Pizza pizza = new Pizza();
        pizza.setPrix(prix);
        assertEquals(prix, pizza.getPrix());
    }

}