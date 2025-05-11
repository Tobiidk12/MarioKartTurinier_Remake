package de.nordakademie.mariokartturinier_remake;

import java.util.*;

/**
 * The type Spieler liste.
 */
public class SpielerListe {

    /**
     * The Spieler liste.
     */
    public HashMap<Integer, Player> spielerListe = new HashMap<Integer, Player>();
    /**
     * The Name.
     */
    public String name;



    public void clear(){
        spielerListe.clear();
    }

    /**
     * Get player collection.
     *
     * @return the collection
     */
    public  Collection<Player> getPlayer(){
        return spielerListe.values();
    }


    public void nextRound(){
        for(Player p : getPlayer()){
            p.nextRound();
        }
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Add player with Player object
     *
     * @param player the player
     */
    public void addPlayer(Player player){
        int index = Utils.getFreeHashIndex(spielerListe);
        spielerListe.put(index, player);
    }

    /**
     * Create and Add player with Name
     *
     * @param name the name
     */
    public void addPlayer(String name) {
        Player playerToAdd = new Player(name);
        int index = Utils.getFreeHashIndex(spielerListe);
        spielerListe.put(index, playerToAdd);
    }

    /**
     * Remove player.
     *
     * @param name the name
     */
    public void removePlayer(String name) {
        Integer indexToRemove = null;
        for (int i = 0; i < spielerListe.size(); i++) {
            Player player = spielerListe.get(i);
            if (player.getName() == name) {
                indexToRemove = i;
            }
        }
        if (indexToRemove != null) {
            spielerListe.remove(indexToRemove);
        }
    }

    /**
     * Disable player.
     *
     * @param name the name
     */
    public void disablePlayer(String name) {
        Integer indexToRemove = null;
        for (int i = 0; i < spielerListe.size(); i++) {
            Player player = spielerListe.get(i);
            if (player.getName() == name) {
                player.setInactive();
            }
        }

    }


    /**
     * Enable player.
     *
     * @param name the name
     */
    public void enablePlayer(String name) {
        Integer indexToRemove = null;
        for (int i = 0; i < spielerListe.size(); i++) {
            Player player = spielerListe.get(i);
            if (player.getName() == name) {
                player.setActive();
            }
        }
    }



    public void setPlaces() {
        ArrayList<Player> playerList= Utils.getPointSorted(spielerListe);

        int aktuellePlatzierung = 0;
        int letztePunkte = -1;

        for (int i = 0; i < playerList.size(); i++) {
            Player spieler = playerList.get(i);

            if (!spieler.isActive()) {
                spieler.setPlace(playerList.size());
                continue;
            }

            if (spieler.getPoints() != letztePunkte) {
                aktuellePlatzierung++;
            }

            spieler.setPlace(aktuellePlatzierung);
            letztePunkte = spieler.getPoints();
        }


    }
    public ArrayList<Player> getSortedArray() {
        ArrayList<Player> sortedSpielerListe = Utils.getPointSorted(spielerListe);
        return sortedSpielerListe;
    }

}
