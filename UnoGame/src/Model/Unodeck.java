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
public class Unodeck {
     
     private final int numOfCar = 108;
     private ArrayList<UnoCard> cards = new ArrayList<UnoCard>();

    public Unodeck() {
    }
     

    public void setCardToDeck(UnoCard card){
        this.getDeck().add(card);
    }
    public UnoCard getCardFromDeck(){
        return this.getDeck().remove(0);
    }
       @Override
    public String toString() {
        return "Cards on deck: " + getDeck().size()+"\n";
    }
    public Unodeck CreateDeck(){
        String color []={"Red","Yellow","Green","Blue","RYGB"};
        String type[]={"Normal","Skip","Draw2","Wild","WildDrawFour","Reverse"};
        Unodeck decks = new Unodeck();
        UnoCard cards;
        for(int c=0;c<color.length;c++){
            int typeIndex=0;
            for(int n=0;n<=12;n++){
                int value=n;
                if(n>9){
                    typeIndex++;
                    value=20;
                }
                if(c!=4){
                   cards =new UnoCard(color[c], type[typeIndex], value,color[c]+type[0]+value);
                  decks.setCardToDeck(cards);
                  if(n!=0)
                      decks.setCardToDeck(cards);
                  }
                }
            
            if(c==4){
                int counter=1;
                while(counter <=4){
                    for(int t=4;t<type.length;t++){
                        cards =new UnoCard(color[c],type[t],50,color[c]+type[t]+50);
                        decks.setCardToDeck(cards);
                    }
                    counter++;
                }
            }
        }
        return decks;
    }

   /**
     * @return the deck
     */
    public ArrayList<UnoCard> getDeck() {
        return cards;
    }

    /**
     * @param deck the deck to set
     */
    public void setDeck(ArrayList<UnoCard> deck) {
        this.cards = deck;
    }
    
    
    
}
