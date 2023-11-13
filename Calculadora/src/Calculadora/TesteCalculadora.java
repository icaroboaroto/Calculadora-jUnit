package Calculadora;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;



class TesteCalculadora {

	public TesteCalculadora(){
	}
	
	@Test
    public void testSoma1(){
        Calcular calc = new Calcular();
        int somar = calc.somar(3, 7);
        assertEquals(10,somar);
        }
	
    @Test
     public void testSoma2(){
    	Calcular calc = new Calcular();
        int somar = calc.somar(10, 4);
        assertEquals(14,somar);
    }
     @Test
      public void testSoma3(){
    	 Calcular calc = new Calcular();
        int somar = calc.somar(11, 35);
        assertEquals(46,somar);
    }
      @Test
       public void testSoma4(){
    	  Calcular calc = new Calcular();
        int somar = calc.somar(-2, 4);
        assertEquals(2,somar);
        
    }
     @Test  
     public void testSub1(){
    	 Calcular calc = new Calcular();
        int sub = calc.sub(19, 3);
        assertEquals(16,sub);
    }
     
     @Test  
     public void testSub2(){
    	 Calcular calc = new Calcular();
        int sub = calc.sub(109, 58);
        assertEquals(51,sub);
    }
     
     @Test  
     public void testSub3(){
    	 Calcular calc = new Calcular();
        int sub = calc.sub(79, 63);
        assertEquals(16,sub);
    }
     
     @Test  
     public void testSub4(){
    	 Calcular calc = new Calcular();
        int sub = calc.sub(8, 16);
        assertEquals(-8,sub);
    }
     
      @Test  
     public void testMult1(){
    	  Calcular calc = new Calcular();
        int mult = calc.mult(3, 4);
        assertEquals(12,mult);
    }
     
     @Test  
     public void testMult2(){
    	 Calcular calc = new Calcular();
        int mult = calc.mult(87, 4);
        assertEquals(348,mult);
    }
     
     @Test  
     public void testMult3(){
    	 Calcular calc = new Calcular();
        int mult = calc.mult(0, 4);
        assertEquals(0,mult);
    }
     
     @Test  
     public void testMult4(){
    	 Calcular calc = new Calcular();
        int mult = calc.mult(7, 12);
        assertEquals(84,mult);
    }
     
     
     @Test  
     public void testDiv1(){
    	 Calcular calc = new Calcular();
        int div = calc.div(8, 2);
        assertEquals(4,div);
    }
     
     @Test  
     public void testDiv2(){
    	 Calcular calc = new Calcular();
        int div = calc.div(10, 5);
        assertEquals(2,div);
    }
     
     @Test  
     public void testDiv3(){
    	 Calcular calc = new Calcular();
        int div = calc.div(100, 2);
        assertEquals(50,div);
    }
     
     @Test  
     public void testDiv4(){
    	 Calcular calc = new Calcular();
        int div = calc.div(27, 9);
        assertEquals(3,div);
    }
	
}
