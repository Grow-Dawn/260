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
    private String instructions = "\n" + "How to Play:" + "\n"
                    + "A player tries to match tiles.\n"
                    + "If the tiles chosen match, they will disappear.\n"
                    + "Find all 8 matches before time runs out.\n";
    
    public void Show(boolean enabled)
    {
        if(enabled)
        {
            System.out.println(instructions);
        }
    }
    
}
