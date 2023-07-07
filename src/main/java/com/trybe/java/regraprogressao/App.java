package com.trybe.java.regraprogressao;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * App.
 */
public class App {
  /**
   * Metodo main.
   */
  public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite a quantidade de atividades para cadastrar:");
    int atividades = Integer.parseInt(leitor.nextLine());

    int question;
    ArrayList<String> listaAtividades = new ArrayList<String>();
    ArrayList<Integer> listaPesos = new ArrayList<Integer>();

    for (question = 1; question <= atividades; question += 1) {
      System.out.println("Digite o nome da atividade " + question);
      String nomeAtividade = leitor.nextLine();
      listaAtividades.add(nomeAtividade);
      System.out.println("Digite o peso da atividade " + question);
      int peso = Integer.parseInt(leitor.nextLine());
      listaPesos.add(peso);
    }

    int somaPesos = 0;

    for (int peso : listaPesos) {
      somaPesos += peso;
    }
  }
}
