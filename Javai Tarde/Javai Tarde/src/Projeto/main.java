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
				demanda.add_demanda();
				break;

			default:
				break;
		}

		// if para tratamento dos dados. Se for válido realiza ordenação

	}



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
	}
}
