package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import services.ServiceReclamation;

import java.sql.SQLException;

public class AfficherReclamationController {
    @FXML
    private Label labeltype;

    @FXML
    private Label labeldescription;
    @FXML
    private Label labelstatut ;
    @FXML
    private Label labeldate ;
    @FXML
    private Label labelfromdb ;
    public Label getLabeltype() {
        return getLabeltype() ;
    }

    public void setLabeltype(String labeltype) {
        this.labeltype.setText(labeltype);
    }

    public Label getLabeldescription() {
        return labeldescription;
    }

    public void setLabeldescription(String labeldescription) {
        this.labeldescription.setText(labeldescription);
    }

    public Label getLabelstatut() {
        return labelstatut ;
    }

    public void setLabelstatut(String labelstatut) {this.labelstatut.setText(labelstatut);}

    public Label getLabeldate() {
        return labeldate ;
    }

    public void setLabeldate(String labeldate) {
        this.labeldate.setText(labeldate);
    }



    public Label getLabelfromdb() {
        return labelfromdb;
    }

    public void setLabelfromdb(String labelfromdb) {
        this.labelfromdb.setText(labelfromdb);
    }


    ServiceReclamation sr =new ServiceReclamation();


    @FXML
    void afficherDB(ActionEvent event) {

        try {
            labelfromdb.setText(sr.afficher().toString());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
