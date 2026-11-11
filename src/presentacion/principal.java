
package presentacion;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import logica.Parcial;

public class principal extends JFrame implements ActionListener {

    private JTextField tA;
    private JTextField tB;
    private JTextField tC;
    private JButton bCalcular;
    private JLabel lResultado;
    private Parcial parcial;

    public principal() {
        this.parcial = new Parcial();

        this.setTitle("Examen Hector Florez");
        this.setSize(410, 250);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(4, 2));

        this.add(new JLabel("a:"));
        this.tA = new JTextField();
        this.add(this.tA);

        this.add(new JLabel("b:"));
        this.tB = new JTextField();
        this.add(this.tB);

        this.add(new JLabel("c:"));
        this.tC = new JTextField();
        this.add(this.tC);

        this.bCalcular = new JButton("Calcular");
        this.add(this.bCalcular);
        this.bCalcular.addActionListener(this);

        this.lResultado = new JLabel("Resultado");
        this.add(this.lResultado);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        new principal();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(this.tA.getText());
            double b = Double.parseDouble(this.tB.getText());
            double c = Double.parseDouble(this.tC.getText());

            String resultado = this.parcial.calcularRaices(a, b, c);

            this.lResultado.setText(resultado);

        }catch(Exception e1) {
            JOptionPane.showMessageDialog(this, e1.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

