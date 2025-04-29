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

    /**
     * Get player collection.
     *
     * @return the collection
     */
    public  Collection<Player> getPlayer(){
        return spielerListe.values();
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

    /**
     * Sets places.
     */
    public void setPlaces() {
        List<Map.Entry<Integer, Player>> eintraege = new ArrayList<>(spielerListe.entrySet());

        eintraege.sort(new Comparator<Map.Entry<Integer, Player>>() {
            @Override
            public int compare(Map.Entry<Integer, Player> e1, Map.Entry<Integer, Player> e2) {
                Player spieler1 = e1.getValue();
                Player spieler2 = e2.getValue();

                int punkte1 = spieler1.getPoints();
                int punkte2 = spieler2.getPoints();

                return Integer.compare(punkte2, punkte1);
            }
        });
        // 3. Schritt: Platzierungen setzen
        int aktuellePlatzierung = 0;
        int letztePunkte = -1;

        for (int i = 0; i < eintraege.size(); i++) {
            Player spieler = eintraege.get(i).getValue();
            if (!spieler.isActive()) {
                spieler.setPlace(eintraege.size());
                continue;
            }

            if (spieler.getPoints() != letztePunkte) {
                aktuellePlatzierung++;
            }
            spieler.setPlace(aktuellePlatzierung);
            letztePunkte = spieler.getPoints();
        }

    }


}
