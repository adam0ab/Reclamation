package controllers;


import entities.preference;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TextField;
import services.ServicePreference;

import java.io.IOException;
import java.sql.SQLException;


public class AjouterPreferenceController {




        ServicePreference sp = new ServicePreference();

        @FXML
        private TextField tftaille;
        @FXML
        private TextField tfstyle;
        @FXML
        private TextField tfmarque;
        @FXML
        private TextField tfcouleur;

        @FXML
        void afficherBtnn(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/AfficherPreference.fxml"));
        try {
            Parent root = loader.load();
            AfficherPreferenceController afficherController = loader.getController();
            afficherController.setLabeltaille(tftaille.getText());
            afficherController.setLabelstyle(tfstyle.getText());
            afficherController.setLabelmarque(tfmarque.getText());
            afficherController.setLabelcouleur(tfcouleur.getText());


            tfmarque.getScene().setRoot(root);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
}

        @FXML
        void ajouterBtnn (ActionEvent event) {
            try { if (tftaille.getText().isEmpty() ||
                    tfstyle.getText().isEmpty() ||
                    tfmarque.getText().isEmpty() ||
                    tfcouleur.getText().isEmpty()) {
                System.out.println("Veuillez remplir tous les champs");
                return;
            }
                sp.ajouter(new preference(tftaille.getText(), tfstyle.getText(),
                        tfmarque.getText(), tfcouleur.getText()));
            } catch (SQLException e) {
                System.out.println(e.getMessage());

            }


        }

    }