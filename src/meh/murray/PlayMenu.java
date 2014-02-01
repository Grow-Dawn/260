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
    
    public void Show()
    {
        User moves = new User();
        System.out.println("Choose a tile number (1-8):");
        String prompt1 = "Please specify the first tile.";
        String prompt2 = "Please specify the second tile.";
        String msgSuccess = "Match!"; String msgFailure = "Sorry!";
        int t1 = printTile((Integer.valueOf(moves.getInput(prompt1, false))).intValue());
        int t2 = printTile((Integer.valueOf(moves.getInput(prompt2, false))).intValue());
        //Quick and easy score
        if (t1 + t2 == 9)
        {
            System.out.println(msgSuccess);
        }
        else
        {
            System.out.println(msgFailure);
        }
        
        //Moves answerMoves = new Moves();
        //answerMoves.getMatch(moves.getInput(prompt1, true), moves.getInput(prompt2, true));
        
        
        
//        Score answerScore = new Score();
//        answerScore.getScore();

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
        }
        
        return passBack;
    }
    
}
