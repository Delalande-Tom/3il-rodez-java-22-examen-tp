package Model;

import java.util.Comparator;
import java.util.Date;

public class Task {

    private int id;
    private String titre;

    private String description;

    private Date dateEchance;

    private Priorite priorite;

    public Task(int id, String titre, String description, Date dateEchance, Priorite priorite) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.dateEchance = dateEchance;
        this.priorite = priorite;
    }


    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateEchance() {
        return dateEchance;
    }

    public void setDateEchance(Date dateEchance) {
        this.dateEchance = dateEchance;
    }

    public Priorite getPriorite() {
        return priorite;
    }

    public void setPriorite(Priorite priorite) {
        this.priorite = priorite;
    }
}
