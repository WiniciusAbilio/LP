package main;

import java.text.DecimalFormat;

/**
 *
 * @author Fragnaut
 */
class Saida {

public void imprimirMatriz(String msg, int matriz[][]) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        System.out.println(msg + ": ");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    public void imprimirMatrizDouble(String msg, double matriz[][]) {
        DecimalFormat df = new DecimalFormat("###,##0.00");//classe para formatar o elemento da matriz com 2 casas decimais
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        System.out.println(msg + ": ");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(df.format(matriz[i][j]) + "  ");//printando o elemento da matriz com 2 casas decimais
            }
            System.out.println("");
        }
    }
    
    public void imprimirString(String msg, String resposta) {
        System.out.println(msg + ": " + resposta);
    }
    
     public void imprimirChar(String msg, char[] frase) {
    System.out.print(msg + ": ");
    for (int i = 0; i < frase.length; i++) {
        System.out.print(frase[i]);
    }
    System.out.println("");
    }
    
    public void imprimirInt(String msg, int resposta) {
        System.out.println(msg + ": " + resposta);
    }
    
    public void imprimirDouble(String msg, double resposta) {
        System.out.println(msg + ": " + resposta);
    }
}