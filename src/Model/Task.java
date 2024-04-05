package Model;

import java.util.Comparator;
import java.util.Date;

public class Task {

    /**
     * id de la tache
     */
    private int id;
    /**
     * titre de la tache
     */
    private String titre;
    /**
     * description d'une tache
     */
    private String description;
    /**
     * date d'échéance de la tache
     */
    private Date dateEchance;
    /**
     * priorité de la tache
     */
    private Priorite priorite;

    /**
     * créer une tache
     * @param id son id
     * @param titre son titre
     * @param description sa description
     * @param dateEchance sa date d'échance
     * @param priorite sa priorite
     */
    public Task(int id, String titre, String description, Date dateEchance, Priorite priorite) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.dateEchance = dateEchance;
        this.priorite = priorite;
    }

    /**
     * retourne le titre de la tache
     * @return le titre de la tache
     */
    public String getTitre() {
        return titre;
    }

    /**
     * Ecris le titre de la tache
     * @param titre le titre de la tache
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }

    /**
     * retourne la description de la tache
     * @return la description de la tache
     */
    public String getDescription() {
        return description;
    }

    /**
     * écrit la description
     * @param description la description  à écrire
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * récupère la date d'échéance de la tache
     * @return la date d'échance
     */
    public Date getDateEchance() {
        return dateEchance;
    }

    /**
     * écrit la date d'échance de la tache
     * @param dateEchance la date d'échance
     */
    public void setDateEchance(Date dateEchance) {
        this.dateEchance = dateEchance;
    }

    /**
     * récupère la priorité de la tache
     * @return la priorité
     */
    public Priorite getPriorite() {
        return priorite;
    }

    /**
     * écrit la priorité de la tahce
     * @param priorite la priorité a écrire
     */
    public void setPriorite(Priorite priorite) {
        this.priorite = priorite;
    }
}
