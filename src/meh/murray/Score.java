/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package meh.murray;

/**
 *
 * @author Dawn Grow
 */
public class Score {
 //private String getScore;
    public void getScore(){
        int tries = 0, timer = 0, finalScore;
		finalScore = tries * timer;
        System.out.println("Your score is " + finalScore);
		if(finalScore  == 0 || finalScore < 30){
            System.out.println("You are awesome!");
            }
        else if (finalScore == 30|| finalScore <60) {
            System.out.println("That was great!  Good job!");
            }
        else if (finalScore == 60 || finalScore <90){
            System.out.println("You did well!");
           }
        else (finalScore == finalScore <90){
            System.out.println("That was good but I know you can do better!");
           }

	}
    }
		
		/*classname.membervariable 
		try appending .ToString() at the end*/
