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
        String prompt1 = "Please specify the first tile.";
        String prompt2 = "Please specify the second tile.";
        Moves answerMoves = new Moves();
        answerMoves.getMatch(moves.getInput(prompt1, true), moves.getInput(prompt2, true));
        
        Score answerScore = new Score();
        answerScore.getScore();

    }
}
