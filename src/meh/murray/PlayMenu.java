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
        ASCII_Tiles t = new ASCII_Tiles();
        Options o = new Options();
        t.tilePairs = o.tilePairs;
        t.intTiles = (t.tilePairs * 2);
//        t.createTileArrays(t.tilePairs);
//        t.printTiles(t.pairOne);
//        t.printTiles(t.pairTwo);
        t.createTileArray(t.intTiles);
        s.match = new boolean [t.intTiles];
        s.misses = new int [t.intTiles];
        s.matches = new int [t.intTiles];
        //s.matchTile = new int [t.intTiles];
        System.out.println("Choose a tile number (1-" + (t.intTiles) + "):");
        System.out.println("(0 exits to Main Menu)");
        String prompt1 = "Please specify the first tile.";
        String prompt2 = "Please specify the second tile.";
        String msgSuccess = "Match!"; String msgFailure = "Sorry!";
        count = 0;
        
        //var = losses;
        //int t1 = printTile((Integer.valueOf(moves.getInput(prompt1, false, "int"))).intValue());
       //while (count < t.intTiles){
        
      while (s.countMatches < t.tilePairs){
        t1 = (moves.getUserInt(prompt1) - 1);
        try
        {
            System.out.println(t.returnTile(t.arrTiles[t1]) + "\n");
            //System.out.println(t.pairOne[t1] + "\n");
            checkExit(t1, uname); checkMatched(t1, uname);
        }
        catch (Exception x)
        {
            if (t1 == -1)
            {
                checkExit(-1, uname);
            }
            
            System.out.println("Invalid guess (" + t.tilePairs * 2 + " is the max.)");
            s.countMatches = t.tilePairs;
            count = t.intTiles;
            continue;
        }
        
        try
        {
            t2 = (moves.getUserInt(prompt2) - 1);
            System.out.println(t.returnTile(t.arrTiles[t2]) + "\n");
            //System.out.println(t.pairTwo[t2] + "\n");
            checkExit(t2, uname); checkMatched(t2, uname);
        }
        catch (Exception x)
        {
            if (t2 == -1)
            {
                checkExit(-1, uname);
            }
            
            System.out.println("Invalid guess (" + t.tilePairs * 2 + " is the max.)");
            s.countMatches = t.tilePairs;
            count = t.intTiles;
            continue;
        }
                
        //Quick and easy score
        //if (t1 + t2 == 9)
        //if (t.tiles[t1] == t.tiles[t2])
        //if (t.pairOne[t1] == t.pairTwo[t2])
        if (t.returnTile(t.arrTiles[t1]) == t.returnTile(t.arrTiles[t2])) //The chiasmus code checking logic ***would*** work (line 71; == 17), but duplicates are currently allowed, which would throw off the math.
        {
            try
            {
                
            s.match[t1] = true;
            //s.match2[count][count] = {0},(t1 - 1)};
            s.matchTile[t1] = (t1);
            s.match[t2] = true;
            //s.matchTile[t2 - 1] = (t2 - 1);
            s.matches[t1] = (s.matches[t1] + 1);
            s.matches[t2] = (s.matches[t2] + 1);
            count++;
            s.countMatches++;
            System.out.println(msgSuccess + " " + a.music());
            //System.out.println(a.music());
            
            }
            catch (Exception x)
            {
                System.out.println("Error: " + x + "\n");
                this.Show(uname);
//                s.countMatches = t.tilePairs;
//                count = t.intTiles;
//                continue;
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
            System.out.println(msgFailure + " " + a.fish());
            //System.out.println(a.fish());            
            }
            catch (Exception x)
            {
                System.out.println("Error: " + x + "\n");
                this.Show(uname);
//                s.countMatches = t.tilePairs;
//                count = t.intTiles;
//                continue;
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
        if(s.countMatches == t.tilePairs)
        {
            count = t.intTiles;
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

    }
    
    public void checkExit(int Exit, String uname)
    {
        if(Exit == -1)
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
    
//    public int printTile(int usrChoice)
//    {
//        ASCII_Tiles tiles = new ASCII_Tiles();
//        int passBack = 0;
//        switch (usrChoice)
//        {
//            case 1: System.out.println(tiles.tile1);
//                    passBack = 1;
//                    break;
//            case 2: System.out.println(tiles.tile2);
//                    passBack = 2;
//                    break;
//            case 3: System.out.println(tiles.tile3);
//                    passBack = 3;
//                    break;
//            case 4: System.out.println(tiles.tile4);
//                    passBack = 4;
//                    break;
//            case 5: System.out.println(tiles.tile5);
//                    passBack = 5;
//                    break;
//            case 6: System.out.println(tiles.tile6);
//                    passBack = 6;
//                    break;
//            case 7: System.out.println(tiles.tile7);
//                    passBack = 7;
//                    break;
//            case 8: System.out.println(tiles.tile8);
//                    passBack = 8;
//                    break;
//           case 0: System.out.println(tiles.tile0); //Invalid Selection
//                    passBack = 0;
//                    break;
//        }
//        
//        return passBack;
//    }
   
}