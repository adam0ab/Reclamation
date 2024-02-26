package entities;

public class reclamation {
    int id ;
    String type;
    String description;
    String statut;
    String date  ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) { this.date = date; }



    @Override
    public String toString() {
        return "reclamation{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", description='" + description + '\'' +
                ", statut='" + statut + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public reclamation() {
    }

    public reclamation(int id, String type, String description, String statut, String date) {
        this.id = id;
        this.type = type;
        this.description = description;
        this.statut = statut;
        this.date = date;
    }

    public reclamation(String type, String description, String statut, String date) {
        this.type = type;
        this.description = description;
        this.statut = statut;
        this.date=date ;
    }


}
