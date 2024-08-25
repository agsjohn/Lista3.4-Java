package lista3_4;

import javax.swing.JOptionPane;

public class Lista3_4 {
    public static void main(String[] args) {
        int dias = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite seus dias de vida: "));
        int ano = dias / 365;
        dias = dias - (ano * 365);
        int mes = dias / 30;
        dias = dias - (mes * 30);
        JOptionPane.showMessageDialog(null, "Você tem " + ano + " anos "+ mes + " meses e " + dias + " dias de vida");
    }    
}
