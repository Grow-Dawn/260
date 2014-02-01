/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package meh.murray;

/**
 *
 * @author patricks
 */
public class Options
{
    User u = new User();
    boolean sound; // = u.getInput("asdf", true); //Sound is on (true) or off (false)
    boolean score; //Score is tracked; on (true) or off (false)
    int matchSeconds; //n seconds allowed to make a match (configurable)   
    
    public void Show(boolean enabled)
    {
        if(enabled)
        {
            System.out.println("Options only limit what you can do.\nComing soon...\n");
        }
    }

}
