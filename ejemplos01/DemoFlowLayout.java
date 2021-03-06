package graficos;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ejemplo01_flowlayout extends JFrame {
    
    public Ejemplo01_flowlayout(String title, int x, int y, int w, int h){
        super(title);
        //posicionamiento de la ventana
        this.setBounds(x,y,w,h);
        //Gestor de organización
        this.getContentPane().setLayout(new FlowLayout());
        //Añadir los componentes al contenedor
        this.getContentPane().add(new JLabel("Nombre"));
        this.getContentPane().add(new JTextField(10));
        this.getContentPane().add(new JLabel("Apellidos"));
        this.getContentPane().add(new JTextField(10));
        this.getContentPane().add(new JButton("boton"));
        this.getContentPane().add(new JTextArea("Area de texto"));
        this.getContentPane().add(new JButton("Tercer boton"));
        this.getContentPane().add(new JButton("Cuarto boton"));
        //Hacer la ventana visible
        this.setVisible(true);
	//Cierre de la ventana
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args){
        new Ejemplo01_flowlayout("Gestor FlowLayout", 500, 500, 300, 200);
    }
}
