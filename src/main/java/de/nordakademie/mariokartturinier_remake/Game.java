package de.nordakademie.mariokartturinier_remake;

import java.util.HashMap;

public class Game
{
public HashMap<Integer , Player> spielerListe = new HashMap<Integer , Player>();

public void addPlayer(String name) {
    Player playerToAdd = new Player(name);
    int index = Utils.getFreeIndex(spielerListe);
    spielerListe.put(index, playerToAdd);
}

public void removePlayer(String name) {
    Integer indexToRemove = null;
    for (int i = 0; i < spielerListe.size(); i++) {
        if(spielerListe.get(i).getName() == name){
            indexToRemove = i;
        }
    }
if (indexToRemove != null){
    spielerListe.remove(indexToRemove);
}

}



}
