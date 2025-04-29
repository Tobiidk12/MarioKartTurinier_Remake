package de.nordakademie.mariokartturinier_remake;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * The type Hello application.
 */
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        //stage.show();
        Game spiel = new Game(1,4);
        SpielerListe gamePlayers = spiel.GlobalspielerListe;
        gamePlayers.addPlayer("Mario");
        gamePlayers.addPlayer("Alice");
        gamePlayers.removePlayer("Mario");
        gamePlayers.addPlayer("Bob");
        gamePlayers.addPlayer("Carol");
        gamePlayers.spielerListe.get(1).increasePoints(10);
        gamePlayers.spielerListe.get(0).increasePoints(5);
        //gamePlayers.spielerListe.get(1).setActive(false);
        gamePlayers.setPlaces();

        for( Player p : gamePlayers.spielerListe.values() ) {
            p.tostring();
        }



    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        launch();
    }
}