package com.asgh.javasandbox.InterfaceWorld;

//Implements both interfaces + with same named default method to avoid compile error
public class TestClass3 implements MyInterface1, MyInterface2 {
    @Override
    public void defineMe() {
        System.out.println("defineMe() implemented in TestClass3");
    }

    @Override
    public void sameDefaultMethod() {
        //Need to implements this else will not compile as `myDefaultMethod` is on both interfaces
        System.out.println("Same default method in TestClass3");
    }
}
