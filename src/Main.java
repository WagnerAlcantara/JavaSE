
public class Main {

	public static void main(String[] args) {
		/*
		 *Exemplo de fun��es matematicas 
		 */
		//exemplo de fun��o de matriz quadrada
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		
		System.out.println("A raiz quadrada de " + x +" = " + A);
		System.out.println("A raiz quadrada de " + y +" = " + B);
		System.out.println("A raiz quadrada de 25 �"+ C);
		//Exemplo de fun��o de potencia��o
		A = Math.pow(x, y);
		B = Math.pow(x, 2);
		C = Math.pow(5.0, 2.0);
		
		System.out.println(x +" elevado a "+y+" = "+ A);
		System.out.println(x +" elevado ao quadrado � = "+B);
		System.out.println("5 elevado  ao quadrado � = " +C);
		
		//Exemplo de fun��o de numero absoluto
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("O valor absoluto de "+y+ " � "+A);
		System.out.println("O valor absoluto de "+z+ " � "+B);
		
		/*
		 * Exemplo de saida de dados
		 * int x = 5;
		double y = 3.5;
		double soma = x + y;
		System.out.println("Ol� Mundo");
		System.out.println(x);
		System.out.println(y);
		System.out.println(soma);
	*/
	}

}
