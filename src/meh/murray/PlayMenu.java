/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package meh.murray;

/**
 *
 * @author patricks
 */
public class PlayMenu
{

    boolean enabled;
    boolean main;
    boolean sub;
    boolean clear;
    int t1; int t2;
    int count; int losses;
    ASCII_Tiles t = new ASCII_Tiles();
    Score s = new Score();
    
//    public void Show()
//    {
//        if(enabled == true)
//        {
//            if(clear == true)
//            {
//                //Runtime.getRuntime().exec("cls");
//                //System.out.print("\f");
//            }
//            
//            System.out.println("Play Menu");
//            System.out.println("¯¯¯¯¯¯¯¯¯");
//            System.out.println("1. Start New Game");
//            System.out.println("2. Main Menu");
//        }
//    }
       
    @SuppressWarnings("empty-statement")
    public void Show(String uname)
    {
        User moves = new User();
        ASCII_Art a = new ASCII_Art();
        System.out.println("Choose a tile number (1-8):");
        System.out.println("(0 exits to Main Menu)");
        String prompt1 = "Please specify the first tile.";
        String prompt2 = "Please specify the second tile.";
        String msgSuccess = "Match!"; String msgFailure = "Sorry!";
        count = 0;
        long startTime = System.currentTimeMillis();
        
        //var = losses;
        //int t1 = printTile((Integer.valueOf(moves.getInput(prompt1, false, "int"))).intValue());
       while (count !=4){        
        t1 = printTile(moves.getUserInt(prompt1));
        checkExit(t1, uname); checkMatched(t1 - 1, uname);
        t2 = printTile(moves.getUserInt(prompt2));
        checkExit(t2, uname); checkMatched(t2 - 1, uname);
        //Quick and easy score
        if (t1+ t2 == 9)
        {
            s.match[t1 - 1] = true;
            s.matchTile[t1 - 1] = (t1 - 1);
            s.match[t2 - 1] = true;
            s.matchTile[t2 - 1] = (t2 - 1);
            s.matches[t1 - 1] = (s.matches[t1 - 1] + 1);
            s.matches[t2 - 1] = (s.matches[t2 - 1] + 1);
            count++;
            System.out.println(msgSuccess);
            System.out.println(a.music());
        }
        else
        {
//            s.match[t1 - 1] = false;
//            s.match[t2 - 1] = false;
            s.misses[t1 - 1] = (s.misses[t1 - 1] + 1);
            s.misses[t2 - 1] = (s.misses[t2 - 1] + 1);
            System.out.println(msgFailure);
            System.out.println(a.fish());            
        }
        
            //Patrick
            s.copyArrBoo(s.match, s.matchCopy);
            s.sortBubbleBoo(s.matchCopy);
                 
            System.out.println("\n" + "Current Matches (sorted status): \n");
            try
            {
                int c = 0; int countMatches = 0;
                
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
            
            System.out.println("\n" + "Current Misses: \n");
            try
            {
                for(int i = 1; i <= missesMax; i++)
                {
                    System.out.println("Tile " + i + ": " + s.missesCopy[i]);
                }
            }
            catch (Exception x)
            {
                // Ignore 
            }
            
            System.out.println("");
            
        //If matched tiles = 8, exit loop via Continue
        if(s.countMatches == 8)
        {
            count = 4;
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
        long endTime   = System.currentTimeMillis();
        for(endTime, startTime){
            long totalTime = endTime - startTime;
            System.out.println("Your play time is " + totalTime);
    }
    }
    public void checkExit(int Exit, String uname)
    {
        if(Exit == 0)
        {
            t1 = 0;
            t2 = 0;            
            MainMenu m = new MainMenu();
            m.enabled = true;
            m.Show(uname);
            
        
            
        }
        
    }
    
    public void checkMatched(int Tile, String uname)
    {
        
        // Check for previously matched tiles
        if (s.match[Tile] == true)
        {
            System.out.println("Tile already chosen.");
            this.Show(uname);
        }
        
    }
    
    public int printTile(int usrChoice)
    {
        ASCII_Tiles tiles = new ASCII_Tiles();
        int passBack = 0;
        switch (usrChoice)
        {
            case 1: System.out.println(tiles.tile1);
                    passBack = 1;
                    break;
            case 2: System.out.println(tiles.tile2);
                    passBack = 2;
                    break;
            case 3: System.out.println(tiles.tile3);
                    passBack = 3;
                    break;
            case 4: System.out.println(tiles.tile4);
                    passBack = 4;
                    break;
            case 5: System.out.println(tiles.tile5);
                    passBack = 5;
                    break;
            case 6: System.out.println(tiles.tile6);
                    passBack = 6;
                    break;
            case 7: System.out.println(tiles.tile7);
                    passBack = 7;
                    break;
            case 8: System.out.println(tiles.tile8);
                    passBack = 8;
                    break;
           case 0: System.out.println(tiles.tile0); //Invalid Selection
                    passBack = 0;
                    break;
        }
        
        return passBack;
    }
    
    
}
