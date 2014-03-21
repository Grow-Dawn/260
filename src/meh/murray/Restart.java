/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package meh.murray;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Dawn Grow
 */
public class Restart implements Serializable{
    // this will be a button on the original game board to Restart the game and will not be seen at this time
    private String name1;
    private String getStart;
    private boolean beginner(){
    User st = new User();
    getStart = (st.getInput("Are you sure you want to start over? [y/n]", false, "String").toUpperCase());  
        Scanner redo = new Scanner(System.in);
        this.name1 = redo.next();
    if ("N".equals(getStart)){
        System.out.println("Let's start over!  \n");
        //System.PlayMenu(0);
            PlayMenu p = new PlayMenu();
             p.Show("player");
             return false;
        
            
        }
        
        else {
           // Exit answerExit = new Exit();
            //    answerExit.getExit();
                System.exit(0);
            return false;
  
    }
           
        }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getGetStart() {
        return getStart;
    }

    public void setGetStart(String getStart) {
        this.getStart = getStart;
    }

    @Override
    public String toString() {
        return "Restart{" + "name1=" + name1 + ", getStart=" + getStart + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.name1);
        hash = 37 * hash + Objects.hashCode(this.getStart);
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
        final Restart other = (Restart) obj;
        if (!Objects.equals(this.name1, other.name1)) {
            return false;
        }
        if (!Objects.equals(this.getStart, other.getStart)) {
            return false;
        }
        return true;
    }
    
}
