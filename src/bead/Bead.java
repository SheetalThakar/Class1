/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bead;

/**
 *
 * @author mehta
 */
public class Bead {

    //Each Bead is having color and a letter on it
    private String color;
    private char letter;

    //no-argument constructor 
    public Bead()
   {
       color="Yellow";
       letter='a';
   }
    //overloaded constructor
    public Bead(String color,char givenletter)
    {
        this.color=color;
        letter=givenletter;
    }
    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the letter
     */
    public char getLetter() {
        return letter;
    }

    /**
     * @param letter the letter to set
     */
    public void setLetter(char letter) {
        this.letter = letter;
    }
    
}
