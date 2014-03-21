/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.mehmurray.menus;

import cit260.mehmurray.menus.HelpMenu;
import java.util.Scanner;
import java.util.Random;
import java.io.Serializable;
import meh.murray.ASCII_Art;
import meh.murray.ASCII_Sound;
import meh.murray.MehMurray;
import meh.murray.Options;
import meh.murray.PlayMenu;
import meh.murray.Score;
import meh.murray.User;

/**
 *
 * @author patricks
 * 
 */

public class MainMenu extends MehMurray implements Serializable
{
    private boolean enabled; // Not part of Superclass
    private boolean main;
    private boolean Sub;
//    private int menuPlay = 1;
//    private int menuOpt =  2;
//    private int menuHelp = 3;
//    private int menuQuit = 4;
//    private int menuItem = 1; //Default menu item is 1, which loops
    
    public void Show(String uname)
    {
         //Instantiate classes
        ASCII_Sound beep = new ASCII_Sound(false);
        ASCII_Art welcome = new ASCII_Art();
        Options o = new Options();
        MehMurray mm = new MehMurray();
        MainMenu m = new MainMenu();
        PlayMenu p = new PlayMenu();
        HelpMenu h = new HelpMenu();
        Score s = new Score();
//        ASCII_Tiles t = new ASCII_Tiles();
//        t.tilePairs = 16;
//        t.createTileArray(t.tilePairs);
        
        // Print menu
        
        if(enabled == true)
        {
                System.out.println("");
            
            System.out.println("Main Menu");
            System.out.println("_________");
            System.out.println(" " + welcome.getHphones());
            System.out.println("¯¯¯¯¯¯¯¯¯");

            for (String[] z : mm.getMenuItems())
            {
                System.out.println(z[0] + ". " + z[1]);
            }
            
                System.out.println("");
        }
        
        //Call the getMenuItem function
        User u = new User();
        switch (u.getUserInt("What do you want to do, " + uname + "?" + "\n (Enter a #)"))
        {
            case 1: p.Show(uname);
            break;
            case 2: o.Show(enabled, uname);
            break;
            case 3: h.Show(enabled);
            break;
            case 4: s.Show();
                    Show(uname);
            case 5: 
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

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isMain() {
        return main;
    }

    public void setMain(boolean main) {
        this.main = main;
    }

    public boolean isSub() {
        return Sub;
    }

    public void setSub(boolean Sub) {
        this.Sub = Sub;
    }

    @Override
    public String toString() {
        return "MainMenu{" + "enabled=" + enabled + ", main=" + main + ", Sub=" + Sub + ", menuPlay=" + ", menuOpt=" + ", menuHelp=" + ", menuQuit=" + ", menuItem=" + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final MainMenu other = (MainMenu) obj;
        if (this.enabled != other.enabled) {
            return false;
        }
        if (this.main != other.main) {
            return false;
        }
        if (this.Sub != other.Sub) {
            return false;
        }

        return true;
    }

    public MainMenu() {

        
    }
    
    
    
}
