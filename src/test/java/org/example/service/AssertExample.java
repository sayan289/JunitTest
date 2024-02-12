package org.example.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.*;

public class AssertExample {
    @Test
    public void test1()
    {
//        int actual[]={1,2,3,4};
//        int expected[]={1,2,3,4};
//        Assertions.assertArrayEquals(expected,actual);
//        String actual=new String("sayan");
//        String expected=new String("sayan");
//        Assertions.assertEquals(expected,actual);
//        String actual="sayan";
//        String expected="sayan";
//        Assertions.assertSame(expected,actual);
//        boolean value=true;
//        Assertions.assertTrue(value);
//          List<Integer> list1=Arrays.asList(1,2,3,4,5);
//          List<Integer> list2=Arrays.asList(1,2,3,4,5);
//          Assertions.assertIterableEquals(list1,list2);
//        List<Integer> list1=Arrays.asList(1,2,3,4,5);
//        List<Integer> list2=Arrays.asList(1,2,3,5,4);
//        Assertions.assertIterableEquals(list1,list2);does not passed
        Assertions.assertThrows(RuntimeException.class,()->{
            throw new RuntimeException("this is testing");
        });
    }
}
