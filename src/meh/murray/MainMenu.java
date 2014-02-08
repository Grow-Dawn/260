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
         //Instantiate classes
        ASCII_Sound beep = new ASCII_Sound();
        ASCII_Art welcome = new ASCII_Art();
        Options o = new Options();
        MainMenu m = new MainMenu();
        PlayMenu p = new PlayMenu();
        HelpMenu h = new HelpMenu();
        
        if(enabled == true)
        {
            System.out.println("Main Menu");
            System.out.println("_________");
            System.out.println(" " + welcome.hphones());
            System.out.println("¯¯¯¯¯¯¯¯¯");
            System.out.println("1. Play");
            System.out.println("2. Options");
            System.out.println("3. Help");
            System.out.println("4. Quit");
            System.out.println("");
        }
        
        //Call the getMenuItem function
        User u = new User();
        switch (u.getUserInt("What do you want to do, " + uname + "? " + "\n (Enter a #)"))
        {
            case 1: p.Show(uname);
            break;
            case 2: o.Show(enabled, uname);
            break;
            case 3: h.Show(enabled);
            break;
            case 4: 
                    System.out.println("Buh-bye!\n");
                    System.exit(0);
            case 99:
                    System.out.println("Invalid selection.");
                    Show(uname);
            break;
            default: p.Show(uname);
            break;
        }
        
        
    }
    
    public void Select()
    {
        
    }
    
}
