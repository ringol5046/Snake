
import javax.swing.JFrame;

public class GameFrame extends JFrame{
    
    public GameFrame() {
        super();
        setSize(800, 800);
        setResizable(false);
        setTitle("Snake");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new Snake());
    }
    
    public static void main(String[] args) {
        JFrame gf = new GameFrame();
        gf.setVisible(true);
    }
    
}
