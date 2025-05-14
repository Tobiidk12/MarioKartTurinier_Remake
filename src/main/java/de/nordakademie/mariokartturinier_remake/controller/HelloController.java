package de.nordakademie.mariokartturinier_remake.controller;

import de.nordakademie.mariokartturinier_remake.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * The type Hello controller.
 */
public class HelloController {
    @FXML
    private Label label;
    //private TableView tableView;

    //tableView.setColumnResizePolicy((param) -> true);

    /**
     * On hello button click.
     */
    @FXML
    protected void onHelloButtonClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("/de/nordakademie/mariokartturinier_remake/Overview.fxml"));
        Scene scene ;
            scene = new Scene(fxmlLoader.load(), 1000, 750);

        Stage currentStage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        currentStage.setScene(scene);




        label.setText("Welcome to JavaFX Application!");
    }
}