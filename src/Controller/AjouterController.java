package Controller;

import View.AjouterVue;

import javax.swing.*;


public class AjouterController {
    AjouterVue ajout;

    public void afficherAjouter(JFrame fenetre){
        ajout = new AjouterVue(fenetre);
        fenetre.setContentPane(ajout);
        fenetre.setVisible(true);
    }

    public void afficherAccueil(JFrame fenetre){

    }

}
