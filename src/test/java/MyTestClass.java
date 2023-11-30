package org.example;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MyTestClass {
    private org.example.MyClass obj;

    @Before
    public void setUp() {
        obj = new org.example.MyClass();
    }

    @Test
    public void testMyMethod() {
        obj.myMethod(2, 3);
        assertEquals(15, obj.getResult());
    }

    @Test
    public void testAnotherMethod() {
        obj.anotherMethod(2.5, 3.5, "Hello, World!");
        assertEquals(6, obj.getResult());
    }

    @Test
    public void testWithInitialValue() {
        org.example.MyClass objWithInitialValue = new org.example.MyClass(5);
        objWithInitialValue.myMethod(1, 1);
        assertEquals(12, objWithInitialValue.getResult());
    }

    @Test
    public void testMultipleMethods() {
        obj.myMethod(2, 3);
        assertEquals(15, obj.getResult());

        obj.anotherMethod(1.5, 2.5, "JUnit Test");
        assertEquals(4, obj.getResult());
    }
}

