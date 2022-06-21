package Exercicios_LP;
import java.io.IOException;
import java.util.Scanner;
public class Questao2 {
	
	/*public static double calcularMatrizDeterminante(int matriz[][], int ordem) {
		if (ordem == 1)
			return (matriz[0][0]);
		if (ordem == 2)
			return (matriz[0][0] * matriz[1][1] - matriz[1][0] * matriz[0][1]);
		else {
			int[][] matrizAuxiliar = new int[ordem - 1][ordem - 1];
			int colunaAuxiliar = 0;
			for (int controle = 0; controle < ordem; controle++) {
				for (int linha = 1; linha < ordem; linha++) {
					for (int coluna = 0; coluna < ordem; coluna++)
						if (controle != coluna)
							matrizAuxiliar[linha - 1][colunaAuxiliar++] = (int) matriz[linha][coluna];
					colunaAuxiliar = 0;
				}
				if (matriz[0][controle] != 0)
					DET += (int) Math.pow((-1), controle) * matriz[0][controle] * calcularMatrizDeterminante(matrizAuxiliar, ordem - 1);
			}
		}
			return (DET);
		}

	private static int DET;*/
	
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int inversa[][] = new int[2][2];
		Scanner sc = new Scanner(System.in); // Preparando o console para leitura
		int mat1[][] = new int[2][2]; // Declarando e alocando matriz
		for (int i = 0; i < mat1.length; i++) {
			for (int c = 0; c < mat1[i].length; c++) {
				System.out.printf("Informe %do valor da %da linha : ", c + 1, i + 1);
				mat1[i][c] = sc.nextInt();
			}
		}
		int mat2[][] = new int[2][2]; // Declarando e alocando matriz
		for (int i = 0; i < mat2.length; i++) {
			for (int c = 0; c < mat2[i].length; c++) {
				System.out.printf("Informe %do valor da %da linha : ", c + 1, i + 1);
				mat2[i][c] = sc.nextInt();
			}
		}
		sc.close();
		
		double determinante = (mat2[0][1] * mat2[1][1])- (mat2[0][1]*mat2[1][0]);	

			if(determinante!=0)
				{
					System.out.println("Determinante: " + determinante);
				}
			else {
				System.out.println("O determinante não pode ser 0");
			
			}
			
			
		inversa[0][0] = mat2[1][1];
		inversa[0][1] = mat2[0][1] * -1;
		inversa[1][0] = mat2[1][0] * -1;
		inversa[1][1] = mat2[0][0];

		double calc=0;
		calc=(1/determinante);
		double auxiliar[][] = new double[2][2];
		
		auxiliar[0][0]=inversa[0][0] * calc;
		auxiliar[0][1]=inversa[0][1] * calc;
		auxiliar[1][0]=inversa[1][0] * calc;
		auxiliar[1][1]=inversa[1][1] * calc;
		
		/*System.out.println("Exibindo matriz inversa");
		
		for (int l = 0; l < inversa.length; l++)  {  
		       for (int c = 0; c < inversa[0].length; c++)     { 
		           System.out.print(inversa[l][c] + " "); //imprime caracter a caracter
		       }  
		       System.out.println(" "); //muda de linha*/
		     
		
		double matFinal[][] = new double[2][2];
	
		
		for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                    
                for(int k=0;k<2;k++){
                	matFinal[j]=(mat1[k] * auxiliar[k][j]);
                    }
                    }    
                }
                for(int i=0;i<2;i++){
                    for(int j=0;j<2;j++){
                        System.out.print(matFinal[j]+ " | ");    
                    }    
                        System.out.println();
                    }    
                    }
                }
	

