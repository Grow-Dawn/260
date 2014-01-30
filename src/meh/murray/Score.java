/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package meh.murray;

/**
 *
 * @author Dawn Grow, PBS
 * 
 */
public class Score {
 //private String getScore;
    public String getScore(){
        int tries = (int)(10 * Math.random()), timer = (int)(10 * Math.random()), finalScore, underScore, topScore;
		finalScore = tries * timer;
                //System.out.println(tries.ToString() + "\n" + timer.ToString());
                String scoreMsg = "\"Great Score!!!\"";
        System.out.println("\"Your score is " + finalScore + "\"");
		if(finalScore  == 0 || finalScore < 300){
            //System.out.println("\"You are awesome!\"");
             scoreMsg = "\n" + "\"You are awesome!\"";
            }
        else if (finalScore == 300 || finalScore <600) {
            //System.out.println("\"That was great!  Good job!\"");
            scoreMsg = "\n"+ "\"That was great!  Good job!\"";
            }
        else if (finalScore == 600 || finalScore <900){
            //System.out.println("\"You did well!\"");
            scoreMsg = "\"You did well!\"";
           }
        else {
            //System.out.println("\"That was good but I know you can do better!\"");
            scoreMsg = "\"That was good but I know you can do better!\"";
        
        topScore = 200;
	underScore = topScore - finalScore;
        scoreMsg = "\"Your score is " + underScore + " points under the best score!\"";
	//System.out.println("\"Your score is " + underScore + " points under the best score!\"");
        return scoreMsg;
	}
                
        return scoreMsg;
    }
    
    
    /**
    *
    * @author Patrick Stamps
    * 
    */
    
//    public int attempts;
//    public int attemptTime;
//    public int playerScore;
//    public String playerMsg = "Your score is ";
//    public String finalScore;
//    public String underScore;
//    public int highScore;
//        
//    public String CalcScore(int attemptTime)
//    {
//        finalScore = attempts * attemptTime;
//        playerScore = 0;
//        return playerMsg;
//        
//    }
    
}		
		/*classname.membervariable 
		try appending .ToString() at the end*/
