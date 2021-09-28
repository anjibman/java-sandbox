package com.asgh.javasandbox.InterfaceWorld;

//Implements with only one default method to show not all default method need to be implemented
public class TestClass2 implements MyInterface1 {
    @Override
    public void defineMe() {
        System.out.println("defineMe() implemented in TestClass2");
    }

    @Override
    public void myDefaultMethod() {
        System.out.println("myDefaultMethod() implemented in TestClass2");
    }
}
