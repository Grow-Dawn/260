/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package meh.murray;

import cit260.mehmurray.ascii.ASCII_Tiles;
import cit260.mehmurray.ascii.ASCII_Art;
import cit260.mehmurray.menus.MainMenu;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author patricks
 */
public class PlayMenu extends MehMurray implements Serializable
{

    private boolean enabled;
    private boolean main;
    private boolean sub;
    private boolean clear;
    private int t1;
    private int t2;
    private int count;
    private int losses;
    
    ASCII_Tiles t = new ASCII_Tiles();
    Score s = new Score();
       
    @SuppressWarnings("empty-statement")
    public void Show(String uname)
    {
        User moves = new User();
        ASCII_Art a = new ASCII_Art();
        ASCII_Tiles t = new ASCII_Tiles();
        //Display EQ
        delayASC(a.getEq(), 250);
        Options o = new Options();
        t.setTilePairs(o.getTilePairs());
        t.setIntTiles(t.getTilePairs() * 2);
        t.createTileArray(t.getIntTiles());
        s.match = new boolean [t.getIntTiles()];
        s.misses = new int [t.getIntTiles()];
        s.matches = new int [t.getIntTiles()];
        //s.matchTile = new int [t.intTiles];
        System.out.println("Choose a tile number (1-" + (t.getIntTiles()) + "):");
        System.out.println("(0 exits to Main Menu)");
        String prompt1 = "Please specify the first tile.";
        String prompt2 = "Please specify the second tile.";
        String msgSuccess = "Match!"; String msgFailure = "Sorry!";
        count = 0;
    
    while (s.countMatches < t.getTilePairs())
    {     
        // Get user input for first tile guess
        try
        {
            t1 = (moves.getUserInt(prompt1) - 1);
            System.out.println(t.returnTile2(t.getArrTiles(t1)) + "\n");
            //System.out.println(t.pairOne[t1] + "\n");
            checkExit(t1, uname); checkMatched(t1, uname);
        }
        catch (Exception x)
        {
            if (t1 == -1)
            {
                checkExit(-1, uname);
            }
            
            System.out.println("Invalid guess (" + t.getTilePairs() * 2 + " is the max.)");
            s.countMatches = t.getTilePairs();
            count = t.getIntTiles();
            continue;
        }
        
        // Get user input for second tile guess
        try
        {
            t2 = (moves.getUserInt(prompt2) - 1);
            System.out.println(t.returnTile2(t.getArrTiles(t2)) + "\n");
            //System.out.println(t.pairTwo[t2] + "\n");
            checkExit(t2, uname); checkMatched(t2, uname);
        }
        catch (Exception x)
        {
            if (t2 == -1)
            {
                checkExit(-1, uname);
            }
            
            System.out.println("Invalid guess (" + t.getTilePairs() * 2 + " is the max.)");
            s.countMatches = t.getTilePairs();
            count = t.getIntTiles();
            continue;
        }
        
        /* 
         * Compare user input; if dupes are disabled, alternate checking can be used with current random tile allocation
         * X|aBBa|chiasmus (e.g. t1 + t2 = 9)
        */
        System.out.println("");
        if (t.getArrTiles(t1) == t.getArrTiles(t2))
        {
            try
            {
            s.match[t1] = true;
            s.matchTile[t1] = (t1);
            s.match[t2] = true;
            s.matches[t1] = (s.matches[t1] + 1);
            s.matches[t2] = (s.matches[t2] + 1);
            count++;
            s.countMatches++;
            System.out.println(msgSuccess + " " + a.getMusic());
            }
            catch (Exception x)
            {
                System.out.println("Error: " + x + "\n");
                this.Show(uname);
            }
                    
        }
        else
        {
            try
            {
            s.match[t1] = false;
            s.match[t2] = false;
            s.misses[t1] = (s.misses[t1] + 1);
            s.misses[t2] = (s.misses[t2] + 1);
            System.out.println(msgFailure + " " + a.getFish());         
            }
            catch (Exception x)
            {
                System.out.println("Error: " + x + "\n");
                this.Show(uname);
            }
        }

/* Temp comment - should be moved to Scores menu
       
            //Patrick
            s.copyArrBoo(s.match, s.matchCopy);
            s.sortBubbleBoo(s.matchCopy);
                 
            System.out.println("\n" + "Current Matches (sorted status): \n");
            try
            {
                int c = 0;
                
                for(boolean b : s.matchCopy)
                {
                    //System.out.println("Tile Rank/Matched: " + (s.matchTile[c] + 1) + "/" +  b);
                    System.out.println(b);
                    c++;
                    
                    //Track number of tiles matched
                    if(b == true)
                    {
                        s.countMatches++;
                    }
                    
                }
            }
            catch (Exception x)
            {
                System.out.println("Exception: " + x);
            }
            
            //Dawn
            
            s.copyArrInt(s.misses, s.missesCopy);
            s.sortNumBubble(s.missesCopy);
            
            int missesMax = s.missesCopy.length;
            
            System.out.println("\n" + "Current Misses (sorted by most missed): \n");
            try
            {
                for(int i = 1; i < missesMax; i++)
                {
                    //System.out.println("Tile " + i + ": " + s.missesCopy[i]);
                    System.out.println(s.missesCopy[i]);
                }
            }
            catch (Exception x)
            {
                // Ignore 
            }
*/            
            System.out.println("");
            
        //If matched tiles = tilePairs, exit loop via Continue
        if(s.countMatches == t.getTilePairs())
        {
            count = t.getIntTiles();
            continue;
        }
            
        continue;
        
       }
        //Moves answerMoves = new Moves();
        //answerMoves.getMatch(moves.getInput(prompt1, true), moves.getInput(prompt2, true));
        
        /*do
        {
            Show(uname);          
        }
        
        while (t1 != 0 || t2 != 0);*/
        
//        Score answerScore = new Score();
//        answerScore.getScore();
//        long endTime   = System.currentTimeMillis();
//        for(endTime, startTime){
//            long totalTime = endTime - startTime;
//            System.out.println("Your play time is " + totalTime);
//    }
    }
    public void checkExit(int Exit, String uname)
    {
        if(Exit == -1)
        {
            t1 = 0;
            t2 = 0;            
            MainMenu m = new MainMenu();
            m.setEnabled(true);
            m.Show(uname);
        }  
    }
    
    public void checkMatched(int Tile, String uname)
    {
        
        // Check for previously matched tiles
        if (s.match[Tile] == true)
        {
            System.out.println("Tile already chosen.");
            t1 = 0;
            t2 = 0;  
            s.match[Tile] = false;
            this.Show(uname);
        }
        
//        if (t2 == t1)
//        {
//            System.out.println("Tile already chosen.");
//            t1 = 0;
//            t2 = 0;  
//            this.Show(uname);
//        }
    }

    public PlayMenu() {
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isMain() {
        return main;
    }

    public void setMain(boolean main) {
        this.main = main;
    }

    public boolean isSub() {
        return sub;
    }

    public void setSub(boolean sub) {
        this.sub = sub;
    }

    public boolean isClear() {
        return clear;
    }

    public void setClear(boolean clear) {
        this.clear = clear;
    }

    public int getT1() {
        return t1;
    }

    public void setT1(int t1) {
        this.t1 = t1;
    }

    public int getT2() {
        return t2;
    }

    public void setT2(int t2) {
        this.t2 = t2;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public ASCII_Tiles getT() {
        return t;
    }

    public void setT(ASCII_Tiles t) {
        this.t = t;
    }

    public Score getS() {
        return s;
    }

    public void setS(Score s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "PlayMenu{" + "enabled=" + enabled + ", main=" + main + ", sub=" + sub + ", clear=" + clear + ", t1=" + t1 + ", t2=" + t2 + ", count=" + count + ", losses=" + losses + ", t=" + t + ", s=" + s + '}';
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
        final PlayMenu other = (PlayMenu) obj;
        if (this.enabled != other.enabled) {
            return false;
        }
        if (this.main != other.main) {
            return false;
        }
        if (this.sub != other.sub) {
            return false;
        }
        if (this.clear != other.clear) {
            return false;
        }
        if (this.t1 != other.t1) {
            return false;
        }
        if (this.t2 != other.t2) {
            return false;
        }
        if (this.count != other.count) {
            return false;
        }
        if (this.losses != other.losses) {
            return false;
        }
        if (!Objects.equals(this.t, other.t)) {
            return false;
        }
        if (!Objects.equals(this.s, other.s)) {
            return false;
        }
        return true;
    }
    
}
