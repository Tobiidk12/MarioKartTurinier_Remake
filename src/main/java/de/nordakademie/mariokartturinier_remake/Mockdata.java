package de.nordakademie.mariokartturinier_remake;

import java.util.HashMap;
import java.util.List;

public class Mockdata {

    public static void mockdata() {
        Game spiel = new Game(2,4);
        SpielerListe gamePlayers = spiel.GlobalspielerListe;

        gamePlayers.addPlayer("Mario");
        gamePlayers.addPlayer("Alice");
        gamePlayers.addPlayer("Bob");
        gamePlayers.addPlayer("Carol");
        gamePlayers.addPlayer("David");
        gamePlayers.addPlayer("Jack");
        gamePlayers.addPlayer("John");
        gamePlayers.addPlayer("Mary");

        gamePlayers.spielerListe.get(1).increasePoints(10);
        gamePlayers.spielerListe.get(0).increasePoints(5);
//        gamePlayers.spielerListe.get(1).setInactive();
        gamePlayers.setPlaces();
        spiel.spreadPlayers();


        for (SpielerListe stage : spiel.stageList){
            System.out.println(stage.name);
            for(Player player : stage.getPlayer()){
                System.out.println(player.toString());
            }

        }

        spiel.nextRound();

        System.out.println("Global List");
        for (Player player : gamePlayers.getPlayer()){
            System.out.println(player.toString());
        }


    }

}
