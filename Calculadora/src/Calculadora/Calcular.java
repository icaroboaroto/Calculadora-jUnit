package Calculadora;

	/**
	 * @author Ícaro Fontanive Boaroto. 
	 * @version 4.29.0 
	 * @since Release 4.29.0 da aplicação.
	 * 
	 * Uma classe que realiza todas as 4 principais operações matemáticas 
	 * (adição, subtração, multiplicação e divisão).
	 */

	public class Calcular {
	    
		
		/**
		 * Método para somar os dois valores.
		 * @param a é o primeiro valor.
		 * @param b é o segundo valor.
		 * @return retorna a soma dos dois valores.
		 */
		public int somar(int a, int b){
	        return a + b;
	    }
	    
		/**
		 * Método para subtrair os dois valores.
		 * @param a é o primeiro valor.
		 * @param b é o segundo valor.
		 * @return retorna a subtração dos dois valores.
		 */
	    public int sub(int a, int b){
	        return a - b;
	    }
	    
	    /**
	     * Método para multiplicar os dois valores.
	     * @param a é o primeiro valor.
	     * @param b é o segundo valor.
	     * @return retorna a multiplicação dos dois valores.
	     */
	    public int mult(int a, int b){
	        return a * b;    
	    }
	    
	    /**
	     * Método para dividir os dois valores.
	     * @param a é o primeiro valor.
	     * @param b é o segundo valor.
	     * @return retorna a divisão dos dois valores.
	     */
	    public int div(int a, int b){
	        return a / b;
	    }
	}

