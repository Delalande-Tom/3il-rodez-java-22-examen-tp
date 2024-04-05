package View;

import javax.swing.*;
import java.awt.*;

public class VuePrincipale extends JFrame {

    public VuePrincipale() throws HeadlessException {
        super("Gestionnaire de tâches");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        JPanel menuVue = MenuVue.getInstance(this);
        setContentPane(menuVue);

        setSize(800,500);
        setVisible(true);

    }
}
