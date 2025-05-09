package Projeto;

import java.util.Scanner;

public class demanda {
    private int tip;
    private int dised;
    private int diseq;
    private int custr;
    private int custim;
    private int prepr;
    private int regula;
    private int prejfisc;
    private int tempesp;
    private int ctt[];


public static demanda setTipo(int tipo){
tipo = .tip;
return null;
}
public static void add_demanda() {
    Scanner a = new Scanner(System.in);
    System.out.println("Digite quantas demandas deseja inserir: ");
    int t = a.nextInt();
    int c = 1;
    for (int i = 0; i < t; i++) {
        demanda dem = new demanda();
        System.out.println("Insira o tipo");
        int tipo = a.nextInt();
        setTipo(tipo);
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

        dem.ctt[i] = dem.tip + dem.dised + dem.diseq + dem.custr + dem.custim + dem.prepr + dem.regula
                + dem.prejfisc + dem.tempesp;
        c++;
    }
}
}
