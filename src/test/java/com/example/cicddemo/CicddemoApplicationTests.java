package com.example.cicddemo;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CicddemoApplicationTests {

    public final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void contextLoads() {
        try {
            testCalculatorAdd(1,2,3);
            testCalculatorMinus(5, 1, 3);
        } catch (AssertionError e) {
            fail("Loi: " + e.getMessage());
        }
    }

    public void testCalculatorAdd(int x, int y, int sum) {
        try {
            assertEquals(x + y, sum);
            System.out.println("SUCCESS");
        } catch (AssertionError e) {
            throw new AssertionError("Error: " + x + " + " + y + "=" + sum);
        }
    }

    public void testCalculatorMinus(int x, int y, int minus) {
        try {
            assertEquals(x - y, minus);
            System.out.println("SUCCESS");
        } catch (AssertionError e) {
            throw new AssertionError("Error: " + x + " - " + y + "=" + minus);
        }
    }

    @After()
    public void cleanUpStreams() {
        System.setOut(null);
    }

}
