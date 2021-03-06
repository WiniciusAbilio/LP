package main;

import java.util.Scanner;

/**
 *
 * @author Fragnaut
 */
public class Entrada {

    Scanner teclado = new Scanner(System.in);
    
    public Double lerNumeroDouble(String msg) {
        while (true) {
            try {
                System.out.print(msg + ": ");
                double x = teclado.nextDouble();
                return x;
            } catch (Exception e) {
                System.out.println("Erro,digite um double....");
                teclado = new Scanner(System.in);
            }
        }
    }

    public double[][] lerMatriz(String msg, int l, int c) {
        double[][] matriz = new double[l][c];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < c; j++) {
                while (true) {
                    try {
                        System.out.print(msg + ": ");
                        matriz[i][j] = teclado.nextDouble();
                        break;
                    } catch (Exception e) {
                        System.out.println("Erro, digite um numero....");
                        teclado = new Scanner(System.in);
                    }
                }
            }
        }
        return matriz;

    }

    public double[] lerVetor(String msg, int tamanho) {
        double[] vetor = new double[tamanho];
        for (int i = 0; i < tamanho; i++) {
            while (true) {
                try {
                    System.out.print(msg + ": ");
                    vetor[i] = teclado.nextDouble();
                    break;
                } catch (Exception e) {
                    System.out.println("Erro, digite um numero....");
                    teclado = new Scanner(System.in);
                }
            }
        }
        return vetor;
    }
    
    public String lerCaracter(String msg) {
        //evita que o usuário deixe a string vazia e digite mais de um caracter
        while (true) {
            try {
                System.out.print(msg + ": ");
                String x = teclado.nextLine();
                if (x.length() != 1) {
                    int a = 3 / 0;//propositalmente provoca um erro para ir para o catch
                }
                if (x.trim().isEmpty()) {
                    int k = 3 / 0; //propositalmente provoca um erro para ir para o catch
                }
                return x;
            } catch (Exception e) {
                System.out.println("Erro, digite apenas um caracter....");
                teclado = new Scanner(System.in);
            }
        }

    }

    public String lerString(String msg) {
        //evita que o usuário deixe a string vazia
        while (true) {
            try {
                System.out.print(msg + ": ");
                String x = teclado.nextLine();
                if (x.trim().isEmpty()) {
                    int k = 3 / 0; //propositalmente provoca um erro para ir para o catch
                }
                return x;
            } catch (Exception e) {
                System.out.println("Erro, a string não pode ser vazia....");
                teclado = new Scanner(System.in);
            }
        }
    }
    
    public int lerLinhaeColunaDeUmaMatriz(String msg) {
        while (true) {
            try {
                System.out.print(msg + ": ");
                int x = teclado.nextInt();
                if (x < 1) {
                    int a = 3 / 0;
                }
                return x;
            } catch (Exception e) {
                System.out.println("Erro, digite um inteiro maior que 0....");
                teclado = new Scanner(System.in);
            }
        }
    }
    
    public int lerNumero(String msg) {
        while (true) {
            try {
                System.out.print(msg + ": ");
                int x = teclado.nextInt();
                return x;
            } catch (Exception e) {
                System.out.println("Erro, digite um inteiro....");
                teclado = new Scanner(System.in);
            }
        }
    }
}