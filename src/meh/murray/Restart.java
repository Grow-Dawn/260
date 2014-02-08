/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package meh.murray;

import java.util.Scanner;

/**
 *
 * @author Dawn Grow
 */
public class Restart {
    // this will be a button on the original game board to Restart the game and will not be seen at this time
    public String name1;
    private String getStart;
    public boolean beginner(){
    User st = new User();
    getStart = (st.getInput("Are you sure you want to start over? [y/n]", false, "String").toUpperCase());  
        Scanner redo = new Scanner(System.in);
        this.name1 = redo.next();
    if ("N".equals(getStart)){
        System.out.println("Let's start over!  \n");
        //System.PlayMenu(0);
            PlayMenu p = new PlayMenu();
             p.Show();
             return false;
        
            
        }
        
        else {
           // Exit answerExit = new Exit();
            //    answerExit.getExit();
                System.exit(0);
            return false;
  


    }
       
        
        }
}
