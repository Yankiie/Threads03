package Main;

import javax.swing.JOptionPane;
import Controller.ThreadVetor;

public class Main {
    public static void main(String[] args) {
        int operador = 0;
        int[] vetor = new int[1000];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 101);
        }
        while (operador != 9) {
            operador = Integer.parseInt(JOptionPane.showInputDialog("insira 1 para percorrer com FOREACH \ninsira 2 para percoreer com For22\n 9 para finalizar"));
            if (operador != 9) {
                Thread tvet = new ThreadVetor(operador, vetor);
                tvet.start();
            }
        }
    }
}