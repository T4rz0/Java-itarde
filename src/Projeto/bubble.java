package Projeto;

import java.util.Scanner;

public class bubble {

			public static void main(String[] args) {
				//inicia o scanner e a variável a ser utilizada para controle
				
				Scanner a = new Scanner(System.in);
				int c=1;
				
				System.out.println("Digite quantas demandas deseja inserir: ");
				int t = a.nextInt();
				
			
				//if para tratamento dos dados. Se for válido realiza ordenação
				int [] ctt = new int [t];
				for (int i=0;i<t;i++){	
					System.out.println("Digite a "+c+"° demanda");
					System.out.println("Insira o tipo");
					int tip = a.nextInt();
					System.out.println("Digite a distância da sede");
					int dised = a.nextInt();
					System.out.println("Digite a distância da equipe");
					int diseq = a.nextInt();
					System.out.println("Digite o custo do reparo");
					int custr = a.nextInt();
					System.out.println("Digite o custo do impácto");
					int custim = a.nextInt();
					System.out.println("Digite a préprioridade");
					int prepr = a.nextInt();
					System.out.println("Digite o regulamento");
					int regula = a.nextInt();
					System.out.println("Digite o prejuiso fiscal");
					int prejfisc = a.nextInt();
					System.out.println("Digite o tempo de espera");
					int tempesp = a.nextInt();
				
					ctt [i] =  tip+dised+diseq+custr+custim+prepr+regula+prejfisc+tempesp;
					c++;
				}
				
						 for(int i=0;i<t-1;i++) {
							 for (int j=0;j<t-i-1; j++) {
								 if (ctt[j] < ctt[j+1]) {
									 int aux = ctt[j];
					                    ctt[j] = ctt[j+1];
					                    ctt[j+1] = aux;
								 }
							 }
							 }
						 for (int i=0;i<=t-1;i++) {
							 System.out.print(ctt[i]+", ");
						 }
					}
			
}
