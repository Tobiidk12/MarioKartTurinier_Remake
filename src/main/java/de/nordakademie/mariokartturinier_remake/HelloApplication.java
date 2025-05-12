package de.nordakademie.mariokartturinier_remake;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * The type Hello application.
 */
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        /*
        Parent root = FXMLLoader.load(getClass().getResource("/HelloView.fxml"));
        stage.setTitle("Meine JavaFX App");
        stage.setScene(new Scene(root, 400, 300));
        stage.show();

        */
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("HelloView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 750);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();


        Mockdata.mockdata();
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}