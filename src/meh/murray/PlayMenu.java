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
        //var = losses;
        //int t1 = printTile((Integer.valueOf(moves.getInput(prompt1, false, "int"))).intValue());
       while (count !=4){        
        t1 = printTile(moves.getUserInt(prompt1));
        checkExit(t1, uname);
        t2 = printTile(moves.getUserInt(prompt2));
        checkExit(t2, uname);
        //Quick and easy score
        if (t1 + t2 == 9)
        {
            s.match[t1] = true;
            s.match[t2] = true;
            count++;
            System.out.println(msgSuccess);
            System.out.println(a.music());
        }
        else
        {
            
            s.misses[t1] = (s.misses[t1] + 1);
            s.misses[t2] = (s.misses[t2] + 1);
            System.out.println(msgFailure);
            System.out.println(a.fish());
            
        }
        
            //Patrick
            System.out.println("\n" + "Current Matches: \n");
            try
            {
                for(int i = 1; i <= 9; i++)
                {
                    System.out.println("Tile " + i + ": " + s.match[i]);
                }
            }
            catch (Exception x)
            {
                // Ignore
            }
            
            //Dawn
            System.out.println("\n" + "Current Misses: \n");
            try
            {
                for(int i = 1; i <= 9; i++)
                {
                    System.out.println("Tile " + i + ": " + s.misses[i]);
                }
            }
            catch (Exception x)
            {
                // Ignore 
            }
            
            System.out.println("");
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
        if(Exit == 0)
        {
            t1 = 0;
            t2 = 0;            
            MainMenu m = new MainMenu();
            m.enabled = true;
            m.Show(uname);
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
