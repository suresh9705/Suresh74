package com.nt;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class AppTest {

  
    @Test
    public void sumwithpositives()
    {
    	App a=new App();
    	int actual=30;
    	int expected=a.sum(10, 20);
    	assertEquals(expected,actual);
    }
    @Test
    public void sumwithNegatives()
    {
    	App a=new App();
    	int actual=-300;
    	int expected=a.sum(-100, -200);
    	assertEquals(expected, actual);
    }
}
