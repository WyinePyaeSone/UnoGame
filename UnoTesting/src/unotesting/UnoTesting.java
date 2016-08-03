/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unotesting;

import Model.Unodeck;
import Model.UnoCard;
import Model.Unogame;
import Model.Player;
import java.util.ArrayList;
/**
 *
 * @author wyinepye
 */
public class UnoTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        UnoTesting test = new UnoTesting();
        Unodeck testdeck =new Unodeck();
        Unogame game;
        
        Player p1 = new Player("id0001", "WyinePyae");
        Player p2 = new Player("id0002", "MayThin");
        Player p3 = new Player("id0003", "EiSandar");
        Player p4 = new Player("id0004", "CardMaster");
        Player p5 = new Player("id0005", "MyatHtet");
          ArrayList<Player> playerList = new ArrayList<Player>();
        playerList.add(p1);
        playerList.add(p2);
        playerList.add(p3);
        playerList.add(p4);
        playerList.add(p5);
        
        String gameId  = "A001";
        String status = "Playing";
        
         
         game=new Unogame(gameId, playerList, status, testdeck);
         game.startPlay();
         System.out.println(game);
        
    }
    
}
