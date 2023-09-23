
package com.mycompany.calculadoraa;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author icaro
 */
public class TesteCalcTest {
    
    public TesteCalcTest() {
    }

    @Test
    public void testSoma1(){
        Calculadora calc = new Calculadora();
        int somar = calc.somar(3, 7);
        assertEquals(10,somar);
    }
    @Test
     public void testSoma2(){
        Calculadora calc = new Calculadora();
        int somar = calc.somar(10, 4);
        assertEquals(14,somar);
    }
     @Test
      public void testSoma3(){
        Calculadora calc = new Calculadora();
        int somar = calc.somar(11, 35);
        assertEquals(46,somar);
    }
      @Test
       public void testSoma4(){
        Calculadora calc = new Calculadora();
        int somar = calc.somar(-2, 4);
        assertEquals(2,somar);
        
    }
     @Test  
     public void testSub1(){
        Calculadora calc = new Calculadora();
        int sub = calc.sub(19, 3);
        assertEquals(16,sub);
    }
     
     @Test  
     public void testSub2(){
        Calculadora calc = new Calculadora();
        int sub = calc.sub(109, 58);
        assertEquals(51,sub);
    }
     
     @Test  
     public void testSub3(){
        Calculadora calc = new Calculadora();
        int sub = calc.sub(79, 63);
        assertEquals(16,sub);
    }
     
     @Test  
     public void testSub4(){
        Calculadora calc = new Calculadora();
        int sub = calc.sub(8, 16);
        assertEquals(-8,sub);
    }
     
      @Test  
     public void testMult1(){
        Calculadora calc = new Calculadora();
        int mult = calc.mult(3, 4);
        assertEquals(12,mult);
    }
     
     @Test  
     public void testMult2(){
        Calculadora calc = new Calculadora();
        int mult = calc.mult(87, 4);
        assertEquals(348,mult);
    }
     
     @Test  
     public void testMult3(){
        Calculadora calc = new Calculadora();
        int mult = calc.mult(0, 4);
        assertEquals(0,mult);
    }
     
     @Test  
     public void testMult4(){
        Calculadora calc = new Calculadora();
        int mult = calc.mult(7, 12);
        assertEquals(84,mult);
    }
     
     
     @Test  
     public void testDiv1(){
        Calculadora calc = new Calculadora();
        int div = calc.div(8, 2);
        assertEquals(4,div);
    }
     
     @Test  
     public void testDiv2(){
        Calculadora calc = new Calculadora();
        int div = calc.div(10, 5);
        assertEquals(2,div);
    }
     
     @Test  
     public void testDiv3(){
        Calculadora calc = new Calculadora();
        int div = calc.div(100, 2);
        assertEquals(50,div);
    }
     
     @Test  
     public void testDiv4(){
        Calculadora calc = new Calculadora();
        int div = calc.div(27, 9);
        assertEquals(3,div);
    }
     
     
}
