package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import services.ServicePreference;

import java.sql.SQLException;

public class AfficherPreferenceController {
    @FXML
    private Label labelmarque;

    @FXML
    private Label labelfromdb;
    @FXML
    private Label labelstyle ;
    @FXML
    private Label labeltaille ;
    @FXML
    private Label labelcouleur ;
    public Label getLabeltaille() {
        return getLabeltaille() ;
    }

    public void setLabeltaille(String labeltaille) {
        this.labeltaille.setText(labeltaille);
    }

    public Label getLabelstyle() {
        return labelstyle;
    }

    public void setLabelstyle(String labelstyle) {
        this.labelstyle.setText(labelstyle);
    }

    public Label getLabelmarque() {
        return labelmarque ;
    }

    public void setLabelmarque(String labelmarque) {
        this.labelmarque.setText(labelmarque);
    }

    public Label getLabelcouleur() {
        return labelcouleur ;
    }

    public void setLabelcouleur(String labelcouleur) {
        this.labelcouleur.setText(labelcouleur);
    }



    public Label getLabelfromdb() {
        return labelfromdb;
    }

    public void setLabelfromdb(String labelfromdb) {
        this.labelfromdb.setText(labelfromdb);
    }


    ServicePreference sp =new ServicePreference();


    @FXML
    void afficherDB(ActionEvent event) {

        try {
            labelfromdb.setText(sp.afficher().toString());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
