package com.practiceMethods;

public interface PersonaA {

    public void caminar();

    default public void hablar(){
        System.out.println("You are talking -a");
    }
}
