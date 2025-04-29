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
       Game game = new Game();
       game.addPlayer("Mario");
       game.addPlayer("Alice");
        game.removePlayer("Mario");
        game.addPlayer("Bob");
        game.addPlayer("Carol");
        game.spielerListe.get(1).setPoints(10);
        game.spielerListe.get(0).setPoints(5);
        //game.spielerListe.get(1).setActive(false);
        game.givePlaces();

        for( Player p : game.spielerListe.values() ) {
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