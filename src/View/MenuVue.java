package View;

import Controller.AjouterController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuVue extends JPanel {

    JList<String> listeTache;

    private static MenuVue instance;

    private MenuVue(JFrame fenetre) {
        JButton boutonAjouter = new JButton("Ajouter une tache");
        boutonAjouter.addActionListener((ActionListener) e -> {
                    AjouterController ajout = new AjouterController();
                    ajout.afficherAjouter(fenetre);
                });
           JButton boutonModifier = new JButton("Modifier une tache");
        JButton boutonSupprimer = new JButton("Supprimer une tache");


        add(boutonAjouter);
        add(boutonModifier);
        add(boutonSupprimer);
    }

    public void visualiserTaches(String[] taches){
        if (listeTache!=null) remove(listeTache);
        listeTache =  new JList<String>(taches);
        add(listeTache);
    }

    public static MenuVue getInstance(JFrame fenetre) {
        if (instance==null) instance = new MenuVue(fenetre);
        return instance;
    }
}
