package com.asgh.javasandbox.InterfaceWorld;

//Implements without default method
public class TestClass1 implements MyInterface1 {
    @Override
    public void defineMe() {
        System.out.println("defineMe() implemented in TestClass1");
    }
}
