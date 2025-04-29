package de.nordakademie.mariokartturinier_remake;

import java.util.*;

/**
 * The type Game.
 */
public class Game {
   public SpielerListe GlobalspielerListe  = new SpielerListe();
   public List<SpielerListe> stageList = new ArrayList<SpielerListe>();
   private int StagePlayerCount;


   public Game(int StagesCount, int StagePlayerCount){
       this.StagePlayerCount = StagePlayerCount;
       createStage(StagesCount);
   }

   public void createStage(int StagesCount){
       for (int i = 0; i < StagesCount; i++) {
           SpielerListe spielerListe = new SpielerListe();
           spielerListe.setName("Stage " + (i + 1));
           stageList.add(spielerListe);
       }

   }


   public void spreadPlayers (){
       Iterator<Player> playerIterator = GlobalspielerListe.getPlayer().iterator();



            }




}
