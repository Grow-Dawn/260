 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package meh.murray;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;
/*import java.lang.reflect.Array;*/

/**
 *
 * @author Dawn Grow and Patrick Stamps*/

public class MehMurray implements Serializable
{

    /* int name, instructions, letter1, letter2;*/
    public String[][] getMenuItems() {
        return menuItems;
    }

    public boolean isEnabled() {
        return enabled;
    }
     
    private String[][] menuItems = 
    {
        {"1", "Play"},
        {"2", "Options"},
        {"3", "Help"},
        {"4", "Scores"},
        {"5", "Quit"},
    };
            
    private boolean enabled = true;
    
    private String name; 
    private long wins = 0;
    private long losses = 0;
    private long ties = 0;
    private String letter = "";
    private int matchSeconds;
    private boolean keepScore;
    private boolean enableSound;
    private boolean exitMM = false;
    
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
        //super(MehMurray.menuItems);
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
        
        //Instantiate classes
        ASCII_Sound beep = new ASCII_Sound(false);
        ASCII_Art welcome = new ASCII_Art();
        Options o = new Options();
        MainMenu m = new MainMenu();
        PlayMenu p = new PlayMenu();
        HelpMenu h = new HelpMenu();
        User u = new User();
        
        //Sound is KING!!! - Unless you're not in the forest when the tree falls. ;)
        beep.RingBell();
        
        // Print "Welcome" art
        System.out.println(welcome.getTitle()); //Can be printed using super() directly from ASCII_Art super class (comment out here, then enable)
        
        //Instantiate new instance
        //MehMurray mm = new MehMurray();
        //mm.getName();
        //mm.displayHelp();
        
        u.enabled = false;
        u.user = u.getInput("Name? ", true, "String");
        
        //Populate Options variables
        o.setMatchSeconds(4); //The default is four seconds.
        o.score = true; //The default is true.
        o.sound = true; //The default is true.
        
        //Display the Main menu in a loop
        Exit answerExit = new Exit();
        
        do
        {
            m.setEnabled(true);
            m.Show(u.user);
            
        }
        
        while (answerExit.getExit() == false);
        
        // will need to move this to right spot later.
//        Restart answerStart = new Restart();
//        answerStart.beginner();

        // *******************************
        // Stop here - Menu has taken over
        // *******************************
        
//        m.enabled = true;
//        m.Show(u.user);
//        
//        //Display the Help menu
//        h.enabled = false;
//        h.Show(h.enabled);
//        
//        //Display the Play menu
//        p.enabled = false;
//        p.Show();
               
        //Add a line between console text output.
	//System.out.println ();
        
        /*Timer setTimer = new Timer();
        setTimer.setTime ();        
        System.out.println(setTimer);*/
        
        
//        User moves = new User();
//        String prompt1 = "Please specify the first tile.";
//        String prompt2 = "Please specify the second tile.";
//        Moves answerMoves = new Moves();
//        answerMoves.getMatch(moves.getInput(prompt1, true), moves.getInput(prompt2, true));
//        
//        Score answerScore = new Score();
//        answerScore.getScore();
        
//        Exit answerExit = new Exit();
//        answerExit.getExit();

    }

    //    public void getName(){
    //        Scanner input = new Scanner(System.in);
    //        System.out.println ("Enter your name: ");
    //        this.name = input.next();
    //        System.out.println("\n" + "Welcome to Meh Murray (Memory), " + this.name + "." + "\n");
    //    }
    //    public void displayHelp(boolean enabled)
    //    {
    //        HelpMenu hi = new HelpMenu();
    //        hi.Show(enabled);
    //
    //    }
    //
    
    public MehMurray(String name, int matchSeconds, boolean keepScore, boolean enableSound) {
        this.name = name;
        this.matchSeconds = matchSeconds;
        this.keepScore = keepScore;
        this.enableSound = enableSound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getMatchSeconds() {
        return matchSeconds;
    }

    public void setMatchSeconds(int matchSeconds) {
        this.matchSeconds = matchSeconds;
    }

    public boolean isKeepScore() {
        return keepScore;
    }

    public void setKeepScore(boolean keepScore) {
        this.keepScore = keepScore;
    }

    public boolean isEnableSound() {
        return enableSound;
    }

    public void setEnableSound(boolean enableSound) {
        this.enableSound = enableSound;
    }

    public boolean isExitMM() {
        return exitMM;
    }

    public void setExitMM(boolean exitMM) {
        this.exitMM = exitMM;
    }

    @Override
    public String toString() {
        return "MehMurray{" + "name=" + name + ", wins=" + wins + ", losses=" + losses + ", ties=" + ties + ", letter=" + letter + ", matchSeconds=" + matchSeconds + ", keepScore=" + keepScore + ", enableSound=" + enableSound + ", exitMM=" + exitMM + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MehMurray other = (MehMurray) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.wins != other.wins) {
            return false;
        }
        if (this.losses != other.losses) {
            return false;
        }
        if (this.ties != other.ties) {
            return false;
        }
        if (!Objects.equals(this.letter, other.letter)) {
            return false;
        }
        if (this.matchSeconds != other.matchSeconds) {
            return false;
        }
        if (this.keepScore != other.keepScore) {
            return false;
        }
        if (this.enableSound != other.enableSound) {
            return false;
        }
        if (this.exitMM != other.exitMM) {
            return false;
        }
        return true;
    }
    
    public void delayASC(String ascArt)
    {
        String[] arrEQ = ascArt.split(" ");
        for (String e : arrEQ)
        {
            try
            {
                System.out.print(e + " ");
                Thread.sleep(1 * 200);
            }
            catch (Exception x)
            {
                // Do nothing!
            }
        }
        
        System.out.println("");
    }
  
    public void delayASC(String ascArt, int ascDelay)
    {
        String[] arrEQ = ascArt.split(" ");
        for (String e : arrEQ)
        {
            try
            {
                System.out.print(e + " ");
                Thread.sleep(1 * ascDelay);
            }
            catch (Exception x)
            {
                // Do nothing!
            }
        }
        
        System.out.println("");
    }
}
    
