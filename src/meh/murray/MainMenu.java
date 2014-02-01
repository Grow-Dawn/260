/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package meh.murray;

import java.util.Scanner;

/**
 *
 * @author patricks
 * 
 */

public class MainMenu
{
    boolean enabled;
    boolean main;
    boolean Sub;
    int menuPlay = 1;
    int menuOpt =  2;
    int menuHelp = 3;
    int menuQuit = 4;
    int menuItem = 1; //Default menu item is 1, which loops
    
    public void Show(String uname)
    {
        if(enabled == true)
        {
            System.out.println("Main Menu");
            System.out.println("¯¯¯¯¯¯¯¯¯");
            System.out.println("1. Play");
            System.out.println("2. Options");
            System.out.println("3. Help");
            System.out.println("4. Quit");
            System.out.println("");
        }
        
        //Call the getMenuItem function
        User u = new User();
        switch ((Integer.valueOf(u.getInput("Select a number, " + uname + ":", false))).intValue())
        {
            case 1: System.out.println(menuPlay);
            break;
            case 2: System.out.println(menuOpt);
            break;
            case 3: System.out.println(menuHelp);
            break;
            case 4: System.out.println(menuQuit);
            break;
            default: System.out.println(menuPlay);
            break;
        }
        
        
    }
    
    public void Select()
    {
        
    }
    
}
