package com.practiceMethods;

public class DefaultMethod implements PersonaA, PersonaB{

    @Override
    public void caminar() {
        System.out.println("Hola, estoy walking");
    }

    @Override
    public void hablar() {
       // PersonaB.super.hablar();
        System.out.println("Yeah");
    }

    public static void main(String[] args) {
        DefaultMethod app = new DefaultMethod();
        app.hablar();
        app.caminar();
    }

}
