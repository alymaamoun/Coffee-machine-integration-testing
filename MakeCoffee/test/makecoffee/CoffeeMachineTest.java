/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package makecoffee;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;

/**
 *
 * @author user
 */
public class CoffeeMachineTest {
    
    public CoffeeMachineTest() {
    }

    /**
     * Test of start method, of class CoffeeMachine.
     */
    @Test
    public void testStart1() {
        //testing black coffee stub
        InputStream sysInBackup=System.in;
        ByteArrayInputStream newInStream=new ByteArrayInputStream("4 1".getBytes());
        System.setIn(newInStream);
        CoffeeMachine cm=new CoffeeMachine();
        cm.start();
        System.setIn(sysInBackup);
    }
    @Test
    public void testStart2() {
        //testing milk coffee stub
        InputStream sysInBackup=System.in;
        ByteArrayInputStream newInStream=new ByteArrayInputStream("4 2".getBytes());
        System.setIn(newInStream);
        CoffeeMachine cm=new CoffeeMachine();
        cm.start();
        System.setIn(sysInBackup);
    }

    /**
     * Test of startDriver method, of class CoffeeMachine.
     */
    @Test
    public void testStartDriver() {
        InputStream sysInBackup=System.in;
        ByteArrayInputStream newInStream=new ByteArrayInputStream("4 1".getBytes());
        System.setIn(newInStream);
        CoffeeMachine cm=new CoffeeMachine();
        cm.startDriver();
        System.setIn(sysInBackup);
    }
    
}
