import javax.swing.JFrame;

    import modelos.Fase;

public class Conteiner extends JFrame {
    public Conteiner(){
        add (new Fase());
        setTitle("Estoy louco");
        setSize(1200, 728);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setResizable(false);
        setVisible(true); 

    }
public static void main (String []args){
    new Conteiner();
}
}