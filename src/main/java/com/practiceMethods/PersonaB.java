package com.practiceMethods;

public interface PersonaB {
    default public void hablar(){
        System.out.println("You are talking -b");
    }
}
