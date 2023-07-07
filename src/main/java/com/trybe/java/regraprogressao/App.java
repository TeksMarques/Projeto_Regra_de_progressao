package com.trybe.java.regraprogressao;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * App.
 */

public class App {
  /**
   * Método Main.
   */

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a quantidade de atividades para cadastrar:");
    int atividades = Integer.parseInt(scanner.nextLine());

    int question = 1;
    ArrayList<String> listaAtividades = new ArrayList<String>();
    ArrayList<Integer> listaPesos = new ArrayList<Integer>();
    ArrayList<Integer> listaNotas = new ArrayList<Integer>();
    ArrayList<Integer> listaPesosNotas = new ArrayList<Integer>();

    for (question = 1; question <= atividades; question++) {
      System.out.println("Digite o nome da atividade " + question + ':');
      String nomeAtividade = scanner.nextLine();
      listaAtividades.add(nomeAtividade);

      System.out.println("Digite o peso da atividade " + question + ':');
      int peso = Integer.parseInt(scanner.nextLine());
      listaPesos.add(peso);

      System.out.println("Digite a nota obtida para " + nomeAtividade + ':');
      int nota = Integer.parseInt(scanner.nextLine());
      listaNotas.add(nota);

      listaPesosNotas.add(peso * nota);
    }

    scanner.close();

    int somaPesos = 0;
    int somaNotas = 0;

    for (int peso : listaPesos) {
      somaPesos += peso;
    }
    //
    // for (int pesoNota : listaPesosNotas) {
    // somaNotas += pesoNota;
    // }
    //
    // double mediaNotas = (double) somaNotas / somaPesos;
    //
    // if (mediaNotas >= 85) {
    // System.out.println("Parabéns! Você alcançou " + mediaNotas
    // + "%! E temos o prazer de informar que você obteve aprovação!");
    // } else {
    // System.out
    // .println("Lamentamos informar que, com base na sua pontuação alcançada neste período, "
    // + mediaNotas
    // + "%, você não atingiu a pontuação mínima necessária para sua aprovação.");
    // }
  }
}

