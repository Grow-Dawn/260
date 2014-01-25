
 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package meh.murray;

import java.io.Serializable;
import java.util.Scanner;
/*import java.lang.reflect.Array;*/

/**
 *
 * @author Dawn Grow and Patrick Stamps*/

public class MehMurray implements Serializable {
   /* int name, instructions, letter1, letter2;*/
   
    private String name;
    private String instructions = "A player tries to match tiles.\n"
                   +"If the tiles chosen match, they will disappear.\n"
                    +"Find all 8 matches before time runs out.  Need help?\n"
                    + "Click on one tile and click on “hint”.  “OK”.";
    private long wins = 0;
    private long losses = 0;
    private long ties = 0;
    private String letter = "";

  /*  var letter = new Array(16);
		
	int letter1, letter2;
	System.out.println("Choose a letter");
	letter1 = letter.nextInt();
	System.out.println("Choose a letter");
	letter2 = letter.nextInt();
	if (letter1 != letter2);
	return int;
	else;
        System.out.println("You got a match!"); */
        
        
    public MehMurray() {
    }

    /*public String getName() {
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
    }*/
    
    
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MehMurray myGame = new MehMurray();
        myGame.getName();
        myGame.displayHelp();
    }
        // TODO code application logic here

   
    public void getName(){
        Scanner input = new Scanner(System.in);
        System.out.println ("Enter your name:");
        this.name = input.next();
    }
    public void displayHelp() //PBS
    {
        System.out.println("Welcome " + this.name + "Meh Murray (memory)");
        System.out.println(this.instructions);
    displayHelp(); //PBS
    }
       
    
        
    }
    
