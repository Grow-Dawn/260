/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package meh.murray;

import java.util.Scanner;

/**
 *
 * @author PATRICKS
 */
public class User
{
    public String userIn;
    public String user;
    public boolean enabled;
    
    public String getInput(String msg2Usr, boolean crlf)
    {
        Scanner getIn = new Scanner(System.in);
        System.out.println (msg2Usr);
        this.userIn = getIn.next();
        
        if (crlf)
        {
           System.out.println(""); 
        }
        
        return this.userIn;
        
    }
    
}
