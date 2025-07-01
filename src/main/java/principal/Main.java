package principal;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de vezes que é para repetir: "));
        for (int i = 0; i < n; i++) {

            double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
            double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do denominador "));
            double diferenca = a / b;
            JOptionPane.showMessageDialog(null, "O resultado é: " + diferenca);
            if (b == 0) {
                JOptionPane.showMessageDialog(null, "Divisão impossivel");
            }


        }

    }
}