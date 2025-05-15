package de.nordakademie.mariokartturinier_remake.UI;

import de.nordakademie.mariokartturinier_remake.Player;
import javafx.beans.property.*;

public class PlayerWrapperUI {
    private Player player;
    private StringProperty name;
    private IntegerProperty points;
    private IntegerProperty place;
    private BooleanProperty active;
    private IntegerProperty round;



    public PlayerWrapperUI(Player player) {
        this.player = player;
        updatePlayer();
    }

    public void updatePlayer(){
        this.name = new SimpleStringProperty(player.getName());
        this.points = new SimpleIntegerProperty(player.getPoints());
        this.place = new SimpleIntegerProperty(player.getPlace());
        this.active = new SimpleBooleanProperty(player.isActive());
        this.round = new SimpleIntegerProperty(player.getRound());
    }
}
