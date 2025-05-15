package de.nordakademie.mariokartturinier_remake.UI;

import de.nordakademie.mariokartturinier_remake.Player;
import de.nordakademie.mariokartturinier_remake.SpielerListe;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;

public class SpielerListWrapperUI {
    public SpielerListe spielerListe;
    public ObservableList<PlayerWrapperUI> spielerListeObservableMap;

    public SpielerListWrapperUI(SpielerListe spielerListe) {
        this.spielerListe = spielerListe;

    }

    public void updateSpielerListe() {
        spielerListeObservableMap.clear();
        for (Player player : spielerListe.getPlayer()){
            spielerListeObservableMap.add(new PlayerWrapperUI(player));
        }
    }




}
