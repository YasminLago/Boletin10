package boletin10_2;
//Yasmin

import javax.swing.JOptionPane;

public class Aleatorio {

    int numero1, numero2;

    public void adivinaNum() {
        numero1 = (int) (Math.random() * 51 + 1);
        if (numero1 >= 1 && numero1 <= 50) {
            for (int i = 0; i < 5; i++) {

                numero2 = Integer.parseInt(JOptionPane.showInputDialog("Adivina el número"));
                if (numero2 > 50) {
                    numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entre el 1 y el 50"));
                }

                if (Math.abs(numero1 - numero2) > 20) {
                    JOptionPane.showMessageDialog(null, "Moi lonxe ");
                }

                if (10 <= Math.abs(numero1 - numero2) && Math.abs(numero1 - numero2) <= 20) {
                    JOptionPane.showMessageDialog(null, "Lonxe ");
                }
                if (10 < Math.abs(numero1 - numero2) && Math.abs(numero1 - numero2) < 5) {
                    JOptionPane.showMessageDialog(null, "Preto ");
                }
                if (Math.abs(numero1 - numero2) <= 5 && Math.abs(numero1 - numero2) != 0) {
                    JOptionPane.showMessageDialog(null, "Moi preto ");
                }

                if (numero1 == numero2) {
                    JOptionPane.showMessageDialog(null, "Resposta correcta");
                    break;
                }

            }
        }
    }
}
