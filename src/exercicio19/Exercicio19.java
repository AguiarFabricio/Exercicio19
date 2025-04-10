package exercicio19;

import javax.swing.JOptionPane;

public class Exercicio19 {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Escreva uma palavra e quantas vezes você quer que ela se repita");

        String nome = JOptionPane.showInputDialog("Digite uma palavra");

        String numeroStr = JOptionPane.showInputDialog("Digite quantas vezes você quer que essa palavra se repita");

        int numero = Integer.parseInt(numeroStr);

        for (int i = 1; i <= numero; i++) {
            JOptionPane.showMessageDialog(null, i + " - " + nome);
        }
    }
}
