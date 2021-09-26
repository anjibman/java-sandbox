// Unpublished Work (c) 2021 Deere & Company

package com.asgh.javasandbox.InterfaceWorld;

public class RunClass {
    public static void main(String[] args) {
        System.out.println("myVar from MyInterface1: " + MyInterface1.myVar);
        MyInterface1.myStaticMethod();

        System.out.println("-------------------------");

        TestClass1 testClass1 = new TestClass1();
        System.out.println("myVar from TestClass1: " + TestClass1.myVar);
        testClass1.defineMe();
        testClass1.myDefaultMethod();
        testClass1.sameDefaultMethod();

        System.out.println("-------------------------");

        TestClass2 testClass2 = new TestClass2();
        System.out.println("myVar from TestClass2: " + TestClass2.myVar);
        testClass2.defineMe();
        testClass2.myDefaultMethod();
        testClass2.sameDefaultMethod();

        System.out.println("-------------------------");

        TestClass3 testClass3 = new TestClass3();
        System.out.println("myVar from TestClass3: " + TestClass3.myVar);
        testClass3.defineMe();
        testClass3.myDefaultMethod();
        testClass3.sameDefaultMethod();
    }
}
