/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package meh.murray;

/**
 *
 * @author patricks
 */
public class HelpMenu
{
    boolean enabled;
    boolean main;
    boolean Sub;
    private String instructions = "\n" + "Welcome to Meh Murray (Memory)." + "\n"
                    + "\n" + "How to Play:" + "\n"
                    + "A player tries to match tiles.\n"
                    + "If the tiles chosen match, they will disappear.\n"
                    + "Find all 8 matches before time runs out.  Need help?\n"
                    + "Click on one tile and click on “hint”.  “OK”.";
    
    public void Show()
    {
        if(enabled == true)
        {
            System.out.println(instructions);
        }
    }
    
}
