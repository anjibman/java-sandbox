// Unpublished Work (c) 2021 Deere & Company

package com.asgh.javasandbox.InterfaceWorld;

public interface MyInterface2 {
    //Same method name in different interface
    default void sameDefaultMethod() {
        System.out.println("Same named default method in MyInterface2");
    }
}
