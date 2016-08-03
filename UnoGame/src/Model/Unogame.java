/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author wyinepyae
 */
public class Unogame {
    private String gameId;
     private ArrayList<Player> playerList ;
    private String gameStatus;
    private Unodeck deck;
    private UnoCard discardPile;

    public Unogame(String gameId, ArrayList<Player> playerList, String gameStatus, Unodeck deck) {
        this.gameId = gameId;
        this.playerList = playerList;
        this.gameStatus = gameStatus;
        this.deck = deck;
    }
    
   

   /**
     * @return the gameId
     */
    public String getGameId() {
        return gameId;
    }

    /**
     * @param gameId the gameId to set
     */
    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    /**
     * @return the playerList
     */
    public ArrayList<Player> getPlayerList() {
        return playerList;
    }

    /**
     * @param playerList the playerList to set
     */
    public void setPlayerList(ArrayList<Player> playerList) {
        this.playerList = playerList;
    }

    /**
     * @return the gameStatus
     */
    public String getGameStatus() {
        return gameStatus;
    }

    /**
     * @param gameStatus the gameStatus to set
     */
    public void setGameStatus(String gameStatus) {
        this.gameStatus = gameStatus;
    }

    /**
     * @return the deck
     */
    public Unodeck getDeck() {
        return deck;
    }

    /**
     * @param deck the deck to set
     */
    public void setDeck(Unodeck deck) {
        this.deck = deck;
    }

    /**
     * @return the discardPile
     */
    public UnoCard getDiscardPile() {
        return discardPile;
    }

    /**
     * @param discardPile the discardPile to set
     */
    public void setDiscardPile(UnoCard discardPile) {
        this.discardPile = discardPile;
    }
   public Unodeck ShuffleDeck(Unodeck d){
       Collections.shuffle(d.getDeck());
       return d;
   }
    public void startPlay(){
        deck = this.ShuffleDeck(deck.CreateDeck());
        
       int counter =1;
        while(counter <= 7){
            
            for (Player player : playerList) {
                UnoCard handCard = deck.getCardFromDeck();
                player.setCardToHand(handCard);
                
            }           
            counter++;
        }
        
        discardPile = deck.getCardFromDeck();
    }
       @Override
    public String toString() {
        return "Game id=" + gameId + "\nDiscard Card=" +discardPile+ "\nStatus=" + gameStatus  +"\n"+ deck + "\n\t"+ playerList;
    }
  
}
