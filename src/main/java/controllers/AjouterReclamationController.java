package controllers;
import entities.reclamation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import services.ServiceReclamation;

import java.io.IOException;
import java.sql.SQLException;


public class AjouterReclamationController {

    ServiceReclamation sr = new ServiceReclamation();

    @FXML
    private TextField tftype;
    @FXML
    private TextField tfdescription;
    @FXML
    private TextField tfstatut;
    @FXML
    private TextField tfdate;

    @FXML
    void afficherBtn (ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/AfficherReclamation.fxml"));
        try {
            Parent root = loader.load();
            AfficherReclamationController afficherController = loader.getController();
            afficherController.setLabeltype(tftype.getText());
            afficherController.setLabeldescription(tfdescription.getText());
            afficherController.setLabelstatut(tfstatut.getText());
            afficherController.setLabeldate(tfdate.getText());


            tftype.getScene().setRoot(root);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    void ajouterBtn (ActionEvent event) {
        try { if (tftype.getText().isEmpty() ||
                tfdescription.getText().isEmpty() ||
                tfstatut.getText().isEmpty() ||
                tfdate.getText().isEmpty()) {
            System.out.println("Veuillez remplir tous les champs");
            return;
        }
            sr.ajouter(new reclamation(tftype.getText(), tfdescription.getText(),
                    tfstatut.getText(), tfdate.getText()));
        } catch (SQLException e) {
            System.out.println(e.getMessage());

        }

    }

}