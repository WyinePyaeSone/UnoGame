/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author wyinepyae
 */
public class Player {
    private String id;
    private String name;
    private ArrayList<UnoCard> cardHold = new ArrayList<UnoCard>();

    public Player() {
    }

    public Player(String id, String name) {
        this.id = id;
        this.name = name;
    }
    

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * @return the cardHold
     */
    public ArrayList<UnoCard> getCardHold() {
        return cardHold;
    }
    

    /**
     * @param cardHold the cardHold to set
     */
    public void setCardHold(ArrayList<UnoCard> cardHold) {
        this.cardHold = cardHold;
        
    }
    

    @Override
    public String toString() {
         return "Player:" + "id=" + id + ", name=" + name + "\n\t\tCards in hand:\n\t\t\t" + cardHold +"\n\t";
        
    }
    public UnoCard getCardFromHand(int i){
        return cardHold.remove(i);
    }
    
    public void setCardToHand(UnoCard card){
        this.cardHold.add(card);
    }
     
}
