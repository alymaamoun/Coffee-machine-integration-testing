/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package makecoffee;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class MakeCoffeeTest {
    
    public MakeCoffeeTest() {
        
    }

    /**
     * Test of main method, of class MakeCoffee.
     */
    @Test
    public void testMain() {
                InputStream sysInBackup=System.in;
        ByteArrayInputStream newInStream=new ByteArrayInputStream("4 2".getBytes());
        System.setIn(newInStream);
        CoffeeMachine cm=new CoffeeMachine();
        cm.start();
        System.setIn(sysInBackup);
    }
    
}
