package Exercicios_LP;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Questao1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		Scanner ler = new Scanner(System.in);
		String marca, modelo;
		int opcao=0, ano=0, contAno=0, mediaAno=0, i=0;
		double valor=0, contValor=0;
		
		ArrayList<String> fipe = new ArrayList<String>();
		
		System.out.println("<1> Cadastrar carro\n<2> Listagem Geral\n<3> Mostrar resultados");
		opcao = ler.nextInt();
		
		do {	
			switch(opcao) {
			
			case 1:
				
					System.out.print("Informe o ano: \n");
					ano = ler.nextInt();
					if(ano<=2022) 
					{				
					
						System.out.printf("Informe a marca: \n");
						marca = ler.next();
						System.out.printf("Informe o modelo: \n");
						modelo = ler.next();
						
						
						System.out.print("Informe o valor: \n");
						valor = ler.nextDouble();
						
						contAno+=ano;
						
						fipe.add(marca + ";" + modelo + ";" + Integer.toString(ano) + ";" + Double.toString(valor));
						
						if(valor>=50000) {contValor++;	break;}
						else 
						{
							System.out.println("Insira um ano válido!");
						}
						
					}
			
			case 2:
				
				for (String carros: fipe) {
				System.out.printf(carros+"\n");
				i++;
				}
				break;
			
			case 3:
					System.out.printf("Carros com valor acima ou igual a R$ 50.000,00: " + contValor + "\n");
					mediaAno=(contAno/fipe.size());
					System.out.printf("Média dos anos de todos os veículos cadastrados: " + mediaAno + "\n");
				break;
			case 4:
				break;
			default: 
				System.out.println("Insira um valor válido!"); 
		}
			if(opcao!=4) {
			System.out.println("<1> Cadastrar carro\n<2> Listagem Geral\n<3> Mostrar resultados");
			opcao = ler.nextInt();} else {break;}

	}while(opcao!=4);

}}
