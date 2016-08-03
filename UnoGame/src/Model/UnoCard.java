/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author wyinepyae
 */
public class UnoCard {
    private String carCcolor;
    private String cardType;
    private int cardValue;
    private String cardImgae;

    public UnoCard() {
    }
    

    /**
     * @return the carCcolor
     */
    public String getCarCcolor() {
        return carCcolor;
    }

    /**
     * @param carCcolor the carCcolor to set
     */
    public void setCarCcolor(String carCcolor) {
        this.carCcolor = carCcolor;
    }

    /**
     * @return the cardType
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * @param cardType the cardType to set
     */
    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    /**
     * @return the cardScore
     */
    public int getCardValue() {
        return cardValue;
    }

    /**
     * @param cardScore the cardScore to set
     */
    public void setCardScore(int cardValue) {
        this.cardValue = cardValue;
    }

    /**
     * @return the cardImgae
     */
    public String getCardImgae() {
        return cardImgae;
    }
     /**
     * @param cardImgae the cardImgae to set
     */
    public void setCardImgae(String cardImgae) {
        this.cardImgae = cardImgae;
    }
    

    public UnoCard(String carCcolor, String cardType, int cardValue, String cardImgae) {
        this.carCcolor = carCcolor;
        this.cardType = cardType;
        this.cardValue = cardValue;
        this.cardImgae = cardImgae;
    }

    @Override
    public String toString() {
         return "Card:" + "color=" + carCcolor + ", type=" + cardType + ", value=" + cardValue+ ", image=" + cardImgae + "\n\t\t\t";
    }
   
}
