import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Navegador {
    private JPanel panel;
    private JTextField txtUrl;
    private JButton btningresar;
    private JTextArea txtListado;
    private JButton btnEliminar;
    private JButton btnCima;
    private JLabel lblCantidad;
    private int cont=1;
    private Pila pila=new Pila();

    public Navegador() {
        btningresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Url direccion=new Url(cont,txtUrl.getText());
                pila.push(direccion);
                cont ++;
                txtListado.setText(pila.elementos());
                lblCantidad.setText("Cantidad:" +pila.size());
            }
        });
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String eliminado=pila.pop().toString();
                    JOptionPane.showMessageDialog(null,eliminado);
                    txtListado.setText(pila.elementos());
                    cont--;
                    lblCantidad.setText("Cantidad: "+pila.size());
                } catch (Exception ex) {
                   JOptionPane.showMessageDialog(null,ex.getMessage());

                }


            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Navegador");
        frame.setContentPane(new Navegador().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
