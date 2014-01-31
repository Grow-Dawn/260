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
    
    private long wins = 0;
    private long losses = 0;
    private long ties = 0;
    private String letter = "";
    public int matchSeconds;
    public boolean keepScore;
    public boolean enableSound;
    
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
        MehMurray mm = new MehMurray();
        mm.getName();
        //mm.displayHelp();
        
        // Create the Options variables
        Options o = new Options();
        o.matchSeconds = 4; //The default is four seconds.
        o.score = true; //The default is true.
        o.sound = true; //The default is true.
        
        //Display the Main menu
        MainMenu m = new MainMenu();
        m.enabled = true;
        m.Show();
        
        //Display the Help menu
        HelpMenu h = new HelpMenu();
        h.enabled = false;
        h.Show(h.enabled);
        
        //Display the Play menu
        PlayMenu p = new PlayMenu();
        p.enabled = false;
        p.Show();
               
        //Add a line between console text output.
	System.out.println ();
        
        /*Timer setTimer = new Timer();
        setTimer.setTime ();        
        System.out.println(setTimer);*/
        
        
        Moves answerMoves = new Moves();
        String prompt1 = "Please specify the first tile.";
        String prompt2 = "Please specify the second tile.";
        answerMoves.getMatch(answerMoves.getTile(prompt1), answerMoves.getTile(prompt2));
        
        
        Score answerScore = new Score();
        answerScore.getScore();
        
        
        Exit answerExit = new Exit();
        answerExit.getExit();   

    }
      
    public void getName(){
        Scanner input = new Scanner(System.in);
        System.out.println ("Enter your name: ");
        this.name = input.next();
        System.out.println("\n" + "Welcome to Meh Murray (Memory), " + this.name + "." + "\n");
    }
    
    public void displayHelp(boolean enabled)
    {  
        HelpMenu hi = new HelpMenu();
        hi.Show(enabled);
    
    }
       
    
        
    }
    
