package Model;

import java.util.List;

public interface GestionnaireTaskInterface {
    /**
     * Ajoute une tache
     * @param tache tache à ajouter
     */
    void ajouterTache(Task tache);

    /**
     * Modifie une tache
     * @param tache tache à modifier
     */
    void modifierTache(Task tache);

    /**
     * supprime une Tache
     * @param tache tache à supprimer
     */
    void supprimerTache(Task tache);

    /**
     * récupère la liste des taches
     * @return la liste des taches
     */
    List<Task> getTaches();
}
