package Projeto;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// inicia o scanner e a variável a ser utilizada para controle

		Scanner a = new Scanner(System.in);

		System.out.println("1- Criar demanda");
		System.out.println("2- Modificar demanda");
		System.out.println("3- Deletar demanda");

		System.out.println("Digite sua opção: ");
		int op = a.nextInt();

		switch (op) {
			case 1:
				add_demanda(a);
				break;

			default:
				break;
		}

		// if para tratamento dos dados. Se for válido realiza ordenação
		

	public void ordenacao(int ctt[], int t) {
		for (int i = 0; i < t - 1; i++) {
			for (int j = 0; j < t - i - 1; j++) {
				if (ctt[j] < ctt[j + 1]) {
					int aux = ctt[j];
					ctt[j] = ctt[j + 1];
					ctt[j + 1] = aux;
				}
			}
		}
		for (int i = 0; i <= t - 1; i++) {
			System.out.print(ctt[i] + ", ");
		}


public static void add_demanda(){
	System.out.println("Digite quantas demandas deseja inserir: ");
	int t = a.nextInt();
	int c = 1;
	for (int i = 0; i < t; i++) {
		demanda dem = new demanda();
		System.out.println("Insira o tipo");
		dem.tip = a.nextInt();
		System.out.println("Digite a distância da sede");
		dem.dised = a.nextInt();
		System.out.println("Digite a distância da equipe");
		dem.diseq = a.nextInt();
		System.out.println("Digite o custo do reparo");
		dem.custr = a.nextInt();
		System.out.println("Digite o custo do impácto");
		dem.custim = a.nextInt();
		System.out.println("Digite a pré-prioridade");
		dem.prepr = a.nextInt();
		System.out.println("Digite o regulamento");
		dem.regula = a.nextInt();
		System.out.println("Digite o prejuiso fiscal");
		dem.prejfisc = a.nextInt();
		System.out.println("Digite o tempo de espera");
		dem.tempesp = a.nextInt();

		dem.ctt[i] = dem.tip + dem.dised + dem.diseq + dem.custr + dem.custim + dem.prepr + dem.regula + dem.prejfisc + dem.tempesp;
		c++;
	}
}
}
}
}
