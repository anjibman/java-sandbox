package com.asgh.javasandbox.InterfaceWorld;

public interface MyInterface1 {
    //public, static and final
    Integer myVar = 10;

    //public and abstract
    void defineMe();

    //Java 8: default method
    default void myDefaultMethod() {
        System.out.println("Default method in MyInterface1");
        myPrivateMethod();
    }

    default void sameDefaultMethod() {
        System.out.println("Same named default method in MyInterface1");
        myPrivateMethod();
    }

    //Java 8: static method
    static void myStaticMethod() {
        System.out.println("MyInterface1::Static Method");
        myPrivateStaticMethod();
    }

    //Java 9: private method
    private void myPrivateMethod() {
        System.out.println("MyInterface1::Private Method");
    }

    //Java 9: private static method
    private static void myPrivateStaticMethod() {
        System.out.println("MyInterface1::Private Static Method");
    }
}
