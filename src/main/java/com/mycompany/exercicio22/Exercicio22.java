package com.mycompany.exercicio22;

import javax.swing.JOptionPane;

public class Exercicio22 {

    public static void main(String[] args) {

        int soma = 0;
        int i = 1;
        while (i <= 1000) {
            soma = soma + i;
            i++;
        }
        JOptionPane.showMessageDialog(null, "A soma dos números de 1 a 1000 é: " + soma);

        int media;
        media = soma / 1000;

        JOptionPane.showMessageDialog(null, "A média aritmética dos números " + soma + " é " + media);

    }
}
