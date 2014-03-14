/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package meh.murray;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author patricks
 */
public class Options extends MehMurray implements Serializable
{
    User u = new User();
    boolean sound; // Sound is on (true) or off (false)
    boolean score; // Score is tracked; on (true) or off (false)
    private int matchSeconds = 4; //n seconds allowed to make a match (configurable)
    private int tilePairs = 4; // 4 is the default, 8 tiles; 16 is the maximum, 32 tiles.
    
    public void Show(boolean enabled, String uname)
    {
                 
         //Instantiate classes
        ASCII_Sound beep = new ASCII_Sound(false);
        ASCII_Art welcome = new ASCII_Art();
        Options o = new Options();
        MainMenu m = new MainMenu();
        PlayMenu p = new PlayMenu();
        HelpMenu h = new HelpMenu();
        
        if(enabled == true)
        {
            System.out.println("Options Menu");
            System.out.println("__________________");
            System.out.println(welcome.getOptions());
            System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
            System.out.println("1. Keep Score = On");
            System.out.println("2. Keep Score = Off (Practice)");
            System.out.println("3. Sound = On");
            System.out.println("4. Sound = Off");
            System.out.println("5. Set Timeout");
            System.out.println("6. Set # of matches [4]");
            System.out.println("7. Display Options");
            System.out.println("8. Main Menu");
            System.out.println("");
        }
        
        //Call the getMenuItem function
        User u = new User();
        switch (u.getUserInt("Select an option.\n (Enter a #)"))
        {
            case 1: setScoreOptions(true);
                    System.out.println("Keep Score: " + score);
                    break;
            case 2: setScoreOptions(false);
                    System.out.println("Keep Score: " + score);
                    break;
            case 3: setSoundOptions(true);
                    System.out.println("Soundtrack: " + sound);
                    break;
            case 4: setSoundOptions(false);
                    System.out.println("Soundtrack: " + sound);
                    break;
            case 5: matchSeconds = u.getUserInt("How many seconds?\n [3-10]");
                    System.out.println("Timeout: " + matchSeconds);
                    break;
            case 6: tilePairs = u.getUserInt("How many match pairs?\n [4]");
                    System.out.println("Match Pairs: " + tilePairs);
                    break;                
            case 7: printOptions();
                    break;
            case 8: m.setEnabled(true); m.Show(uname);
                    break;
            case 99:
                    System.out.println("Invalid selection.");
                    o.Show(enabled, uname);
                    break;
            default: System.out.println("Invalid selection.");
                    o.Show(enabled, uname);
                    break;
                
        }

        //Display the Options menu in a loop
        Exit answerExit = new Exit();
        
        do
        {
            Show(enabled, u.user);          
        }
        
        while (answerExit.getExit() == false);
        
    }
    
    public void setScoreOptions(boolean set)
    {
        score = set;
    }
    
    public void setSoundOptions(boolean set)
    {
        sound = set;
    }

    public void printOptions()
    {
        System.out.println("Keep Score: " + score);
        System.out.println("Soundtrack: " + sound);
        System.out.println("Timeout: " + matchSeconds);      
    }

    public User getU() {
        return u;
    }

    public void setU(User u) {
        this.u = u;
    }

    public boolean isSound() {
        return sound;
    }

    public void setSound(boolean sound) {
        this.sound = sound;
    }

    public boolean isScore() {
        return score;
    }

    public void setScore(boolean score) {
        this.score = score;
    }

    public int getMatchSeconds() {
        return matchSeconds;
    }

    public void setMatchSeconds(int matchSeconds) {
        this.matchSeconds = matchSeconds;
    }

    public int getTilePairs() {
        return tilePairs;
    }

    public void setTilePairs(int tilePairs) {
        this.tilePairs = tilePairs;
    }

    @Override
    public String toString() {
        return "Options{" + "u=" + u + ", sound=" + sound + ", score=" + score + ", matchSeconds=" + matchSeconds + ", tilePairs=" + tilePairs + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.u);
        hash = 83 * hash + (this.sound ? 1 : 0);
        hash = 83 * hash + (this.score ? 1 : 0);
        hash = 83 * hash + this.matchSeconds;
        hash = 83 * hash + this.tilePairs;
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
        final Options other = (Options) obj;
        if (!Objects.equals(this.u, other.u)) {
            return false;
        }
        if (this.sound != other.sound) {
            return false;
        }
        if (this.score != other.score) {
            return false;
        }
        if (this.matchSeconds != other.matchSeconds) {
            return false;
        }
        if (this.tilePairs != other.tilePairs) {
            return false;
        }
        return true;
    }
    
}
