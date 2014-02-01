/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package meh.murray;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Dawn Grow
 */
public class Exit {
    public String name;
    private String getEx;
    public boolean getExit(){
        
        User ex = new User();
        getEx = (ex.getInput("Quit? [y/n]", false).toUpperCase());  
       
        if ("N".equals(getEx))
        {
            System.out.println("Pull up a chair and stay a while...\n");
            try
            {
                Process p = Runtime.getRuntime().exec("cmd /c cls");
            }
            catch (IOException x)
            {
                // Ignore if the screen doesn't clear - oh well!
            }
            
            return false;
        }
        else 
        {
            System.out.println("Buh-bye!\n");
            System.exit(0);
        }
        
        return false;
        
    }
}
