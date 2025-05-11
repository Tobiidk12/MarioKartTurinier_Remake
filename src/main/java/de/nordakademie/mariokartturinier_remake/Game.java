package de.nordakademie.mariokartturinier_remake;

import java.util.*;


/**
 * The type Game.
 */
public class Game {
   public SpielerListe GlobalspielerListe  = new SpielerListe();
   public List<SpielerListe> stageList = new ArrayList<SpielerListe>();
   private int stagePlayerCount;
   private int gameRound;
   private int elimitionRound = 2;


   public Game(int StagesCount, int StagePlayerCount){
       this.gameRound = 1;
       this.stagePlayerCount = StagePlayerCount;
       createStage(StagesCount);
   }

   public void createStage(int StagesCount){
       for (int i = 0; i < StagesCount; i++) {
           SpielerListe spielerListe = new SpielerListe();
           spielerListe.setName("Stage " + (i + 1));
           stageList.add(spielerListe);
       }

   }
   public void nextRound(){
       gameRound++;
       eliminatePlayersGlobal();
       for (SpielerListe spielerListe : stageList) {
           spielerListe.nextRound();
           spielerListe.clear();
       }
       GlobalspielerListe.setPlaces();
   }



   public void spreadPlayers () {
       Iterator<Player> playerIterator = GlobalspielerListe.getPlayer().iterator();
       Collection<Player> playerListe;

       // Check for players of current Round
       for (SpielerListe spielerListe : stageList) {
           playerListe = spielerListe.getPlayer();
           while (playerIterator.hasNext() && playerListe.size() < stagePlayerCount) {
               Player player = playerIterator.next();
               if (player.getRound() == gameRound && player.isActive()) {
                   spielerListe.addPlayer(player);
               }
           }
       }
   }


   public void eliminatePlayersStage() {
       if (gameRound < elimitionRound) {
           return;
       }
   float eleminationPercent = 50;
       eleminationPercent = eleminationPercent / 100;
    int eleminationNumber;

       ArrayList<Player> sortedPlayers;
       for (SpielerListe spielerListe : stageList) {
           sortedPlayers = spielerListe.getSortedArray();
           eleminationNumber = (int) (sortedPlayers.size() * eleminationPercent);
           for (int i = sortedPlayers.size() -1; i >= eleminationNumber ; i--) {
               Player player = sortedPlayers.get(i);
               player.setInactive();
           }
   }
   }

   public void eliminatePlayersGlobal(){
       if (gameRound < elimitionRound) {
           return;
       }
       float eleminationPercent = 50;
       eleminationPercent = eleminationPercent / 100;
       int eleminationNumber;
       ArrayList<Player> sortedPlayers;
       sortedPlayers = GlobalspielerListe.getSortedArray();
       eleminationNumber = (int) (sortedPlayers.size() * eleminationPercent);
       for (int i = sortedPlayers.size() -1; i >= eleminationNumber ; i--) {
           Player player = sortedPlayers.get(i);
           player.setInactive();
       }
   }



}
