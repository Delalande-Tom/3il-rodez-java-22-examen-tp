package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class AjouterVue extends JPanel {

    public AjouterVue(JFrame fenetre) {
        super(new FlowLayout());
        JTextField titreTache = new JTextField();
        JTextField descriptionTache = new JTextField();
        DateFormat Date_Format = new SimpleDateFormat("dd MMM YYYY");
        JFormattedTextField date = new JFormattedTextField(Date_Format);
        JButton ajouter =new JButton("Ajouter");
        JButton boutonAccueil = new JButton("Retourner à l'accueil");
        boutonAccueil.addActionListener((ActionListener) e -> {
            fenetre.setContentPane(MenuVue.getInstance(fenetre));
        });
        
        ajouter.addActionListener((ActionListener) e -> {
            String[] textes = {"bla"};
            MenuVue.getInstance(fenetre).visualiserTaches(textes);
        });


        add(titreTache);
        add(descriptionTache);
        add(date);
        add(ajouter);
        add(boutonAccueil);
    }
}
