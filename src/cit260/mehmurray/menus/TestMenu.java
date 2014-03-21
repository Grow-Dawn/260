/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cit2mehmurray.menusray;

import cit260.mehmurray.menus.Menu;

/**
 *
 * @author PATRICKS
 * 
 */
public abstract class TestMenu extends Menu
{

    public TestMenu()
    {
        //super(TestMenu.menuItems); //Could not get to work as listed in Lesson 9 assignment text.
    }
        
    //@Override //Could not get to work as listed in Lesson 9 assignment text.
    public String executeCommands(String game)
    {
        return game;
    }
    
    private final static String[][] menuItems = 
    {
        {"1", "Play"},
        {"2", "Options"},
        {"3", "Help"},
        {"4", "Scores"},
        {"5", "Quit"},
    };
    
}
