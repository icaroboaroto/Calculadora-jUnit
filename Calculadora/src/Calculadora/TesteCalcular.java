package Calculadora;

public class TesteCalcular {

	 public static void main(String[] args) {
	        Calcular calc = new Calcular();
	        
	        //Primeiro teste de soma
	        int soma = calc.somar(3, 7);
	        System.out.println(soma);
	        
	        //Segundo teste de soma
	        soma = calc.somar(10, 4);
	        System.out.println(soma);
	        
	        //Terceiro teste de soma
	        soma = calc.somar(11, 35);
	        System.out.println(soma);
	        
	        //Quarto teste de soma
	        soma = calc.somar(-2, 4);
	        System.out.println(soma);
	        
	        //Primeiro teste de subtração
	        int subtrair = calc.sub(19, 3);
	        System.out.println(subtrair);
	        
	        //Segundo teste de subtração
	        subtrair = calc.sub(109 , 58);
	        System.out.println(subtrair);
	        
	        //Terceiro teste de subtração
	        subtrair = calc.sub(79 , 63);
	        System.out.println(subtrair);
	        
	        //Quarto teste de subtração
	        subtrair = calc.sub(8, 16);
	        System.out.println(subtrair);
	        
	        //Primeiro teste de multiplicação
	        int multiplicar = calc.mult(3, 4);
	        System.out.println(multiplicar);
	        
	        //Segundo teste de multiplicação
	        multiplicar = calc.mult(87, 4);
	        System.out.println(multiplicar);
	        
	        //Terceiro teste de multiplicação
	        multiplicar = calc.mult(0, 4);
	        System.out.println(multiplicar);
	        
	        //Quarto teste de multiplicação
	        multiplicar = calc.mult(7, 12);
	        System.out.println(multiplicar);
	        
	        //Primeiro teste de divisão
	        int divisao = calc.div(8, 2);
	        System.out.println(divisao);
	        
	        //Segundo teste de divisão
	        divisao = calc.div(10, 5);  
	        System.out.println(divisao);
	        
	        //Terceiro teste de divisão
	        divisao = calc.div(100, 2);
	        System.out.println(divisao);
	        
	        //Quarto teste de divisão
	        divisao = calc.div(27, 9);
	        System.out.println(divisao);
	        
	        
	    }
}
