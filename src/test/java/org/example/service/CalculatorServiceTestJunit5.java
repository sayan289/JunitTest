package org.example.service;

import org.junit.jupiter.api.*;

public class CalculatorServiceTestJunit5 {
    @BeforeAll
    public static void init()
    {
        System.out.println("Before all test cases");
    }
    @BeforeEach
    public void beforeEach()
    {
        System.out.println("Before each test case");
    }
    @AfterEach
    public void afterTestCase()
    {
        System.out.println("After each test case");
    }
    @Test
    public void addTwoNumbersTest()
    {
        System.out.println("addTwoNumbers test cases");
        int result=CalculatorService.addTwoNumbers(12,45);
         int expected=57;
        Assertions.assertEquals(expected,result);
    }
    @Test
    public void sumAnyNumbersTest(){
        System.out.println("Testcases for sumAnyNumbersTest");
        int result=CalculatorService.sumAnyNumbers(2,3,4,5);
        int expected=14;
        Assertions.assertEquals(expected,result);
    }
    @AfterAll
    public static void cleanup()
    {
        System.out.println("After all test cases");
    }
}
