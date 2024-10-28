/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package coe318.lab7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Eddy Perez Macias
 */
public class UserMainTest {
    
    public UserMainTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addRes method, of class UserMain.
     */
    @Test
    public void testAddRes() {
        System.out.println("addRes");
        Resistor res = new Resistor(1, 2, 2, 2.0);
        UserMain instance = new UserMain();
        instance.addRes(res);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of addDC method, of class UserMain.
     */
    @Test
    public void testAddDC() {
        System.out.println("addDC");
        DC d = new DC(1, 2, 2, 2.0);
        UserMain instance = new UserMain();
        instance.addDC(d);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class UserMain.
     */
    @Test
    public void testMain() {
        //System.out.println("main");
        //String[] args = null;
        //UserMain.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
