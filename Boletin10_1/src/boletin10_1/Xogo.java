package boletin10_1;
//Yasmin

import javax.swing.JOptionPane;

public class Xogo {

    int numero1, numero2;

    public void adiviñar() {
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entre el 1 y el 50"));
        if (numero1 >= 1 && numero1 <= 50) {
            for (int i = 0; i < 5; i++) {
                numero2 = Integer.parseInt(JOptionPane.showInputDialog("Adivina el número"));

                if (numero1 > numero2) {
                    JOptionPane.showMessageDialog(null, "El número es mayor que " + numero2);
                }

                if (numero1 < numero2) {
                    JOptionPane.showMessageDialog(null, "El número es menor que " + numero2);
                }

                if (numero1 == numero2) {
                    JOptionPane.showMessageDialog(null, "Resposta correcta");
                    break;
                }

            }
        }
    }
}