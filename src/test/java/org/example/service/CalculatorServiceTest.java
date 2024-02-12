//package org.example.service;
//
//import org.junit.*;
//
//public class CalculatorServiceTest {
//    @BeforeClass//run before all the test case
//    public static void init()
//    {
//        System.out.println("Before all test cases");
//        System.out.println("Test cases started ");
//    }
//    @Before//run before each testcase
//    public void beforeEach()
//    {
//        System.out.println("Before each test case");
//    }
//    @Test(timeout = 2000)
//    public void addTwoNumbersTest() throws java.lang.InterruptedException
//    {
//        System.out.println("Testcases for addTwoNumbersTest");
//        Thread.sleep(300);
//        int result=CalculatorService.addTwoNumbers(12,45);
//        int expected=57;
//        Assert.assertEquals(expected,result);
//    }
//    @Test
//    public void sumAnyNumbersTest(){
//        System.out.println("Testcases for sumAnyNumbersTest");
//        int result=CalculatorService.sumAnyNumbers(2,3,4,5);
//        int expected=14;
//        Assert.assertEquals(expected,result);
//    }
//    @AfterClass//run after all the test case
//    public static void cleanup()
//    {
//        System.out.println("After all test cases");
//    }
//}
