import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//INICIO EXERCICIO 1
		/*
		Scanner sc =  new Scanner(System.in);
		int numeroUm = sc.nextInt();
		int numeroDois =  sc.nextInt();
		int soma = numeroUm + numeroDois;
		
		System.out.println("Soma = " + soma);
		
		sc.close();
		*/	
		//FIM EXERCICIO 1 
		//INCIO EXERCICIO 2
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		double raio = sc.nextDouble();
		double area = pi * (Math.pow(raio, 2));
		System.out.printf("Raio = %.4f%n", area);
		sc.close();
		*/
		
		//FIM EXERCICIO 2
		//INICIO EXERCICIO 3 
		/*
		Scanner sc = new Scanner(System.in);
		int A,B,C,D, diferenca;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		diferenca  = ((A*B)-(C*D));
		System.out.println("A diferença dos produtos é "+ diferenca);
		sc.close();
		*/
		// FIM EXERCICIO 3
		//INICIO EXERCICIO 4
		/*
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		int numeroFuncionario = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		double valorHora = sc.nextDouble();
		double salario = (double) horasTrabalhadas *valorHora;
		
		System.out.println("Number ="+numeroFuncionario);
		System.out.printf("Salary  = U$ %.2f%n",salario);
		
		sc.close();
		*/
		// FIM EXERCICIO 4 
		//INICIO EXERCICIO 5
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int cod1, cod2, qtd1,qtd2;
		double preco1, preco2, total;
		
		
		cod1 =  sc.nextInt();
		qtd1 = sc.nextInt();
		preco1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		qtd2 = sc.nextInt();
		preco2 = sc.nextDouble();
		
		total = preco1*qtd1 + preco2*qtd2;
		
		System.out.println("Valor a pagar é "+total);
		
		
		
			
		sc.close();
		*/
		// FIM EXERCICIO 5 
		//Exercicio calcular area terreno
		/*Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double largura  = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = metroQuadrado * area;
		
		System.out.printf("Area = %.2f%n", area);
		System.out.printf("Preco = %.2f%n", preco);
		
		sc.close();
		
		*/
		
		//INICIO EXERCICIO 6
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double pi = 3.14159;
		double triangulo = (A * C) / 2;
		double circulo = pi * (Math.pow(C, 2));
		double trapezio = ((A + B) *C )/2;
		double quadrado = Math.pow(B, 2);
		double retangulo = A * B;
		
		System.out.printf("Triangulo = %.2f%n", triangulo);
		System.out.printf("Circulo = %.2f%n", circulo);
		System.out.printf("Trapezio = %.2f%n", trapezio);
		System.out.printf("Quadrado = %.2f%n", quadrado);
		System.out.printf("Retangulo = %.2f%n", retangulo);
		sc.close();
		
		//FIM DE EXERCICIO 6
		
		
		// fim exercicio calculo area
		/*
		 *Exemplo de funções matematicas 
		 */
		//exemplo de função de matriz quadrada
		/*
		 * double x = 3.0;
		 
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		
		System.out.println("A raiz quadrada de " + x +" = " + A);
		System.out.println("A raiz quadrada de " + y +" = " + B);
		System.out.println("A raiz quadrada de 25 é"+ C);
		//Exemplo de função de potenciação
		A = Math.pow(x, y);
		B = Math.pow(x, 2);
		C = Math.pow(5.0, 2.0);
		
		System.out.println(x +" elevado a "+y+" = "+ A);
		System.out.println(x +" elevado ao quadrado é = "+B);
		System.out.println("5 elevado  ao quadrado é = " +C);
		
		//Exemplo de função de numero absoluto
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("O valor absoluto de "+y+ " é "+A);
		System.out.println("O valor absoluto de "+z+ " é "+B);
		
		
		/*
		 * Exemplo de saida de dados
		 * int x = 5;
		double y = 3.5;
		double soma = x + y;
		System.out.println("Olá Mundo");
		System.out.println(x);
		System.out.println(y);
		System.out.println(soma);
	*/
	}

}
