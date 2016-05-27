package com.toninocatapano.java8playground.examples;

/**
 * Created by tonnoz on 27/05/16.
 */
public interface DefaultMethod {

    default void methodWithDefaultImplementation(){
        System.out.println("Default implementation of the methodWithDefaultImplementation() method");
    }

}
