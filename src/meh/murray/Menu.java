/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package meh.murray;

import java.io.Serializable;

/**
 *
 * @author PATRICKS
 * 
 */

public abstract class Menu implements Serializable
{
    private String[][] menuItems = null;
    
    public Menu()
    {

    }
    
    public String[][] getMenuItems()
    {
        return menuItems;
    }
    
    public void setMenuItems(String[][] menuItems)
    {
    
    }
    
    public void display()
    {
        
    }
    
    private boolean validCommand(String command)
    {
        return true;
    }
    
    protected final String getCommand()
    {
        return "true";
    }
    
    public abstract String executeCommands();
    
}
