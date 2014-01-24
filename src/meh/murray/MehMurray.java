/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package meh.murray;

import java.io.Serializable;

/**
 *
 * @author Dawn Grow and Patrick Stamps*/

 public static void main(String[] args) {
 
public class Memory1 implements Serializable {
    int name, instructions, letter1, letter2;
    private String name;
    private String instructions = "A player tries to match tiles.   If the tiles chosen match, they will disappear.  Find all 8 matches before time runs out.  Need help?  Click on one tile and click on “hint”.  “OK”.";
    private long wins = 0;
    private long losses = 0;
    private long ties = 0;
    private String letter = "";

    public Memory1() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public long getWins() {
        return wins;
    }

    public void setWins(long wins) {
        this.wins = wins;
    }

    public long getLosses() {
        return losses;
    }

    public void setLosses(long losses) {
        this.losses = losses;
    }

    public long getTies() {
        return ties;
    }

    public void setTies(long ties) {
        this.ties = ties;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }
    
    
    
    
    
        
    }
    
}
