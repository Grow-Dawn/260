/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package meh.murray;

/**
 *
 * @author patricks
 * Step 2: Brainstorm and come up with an idea for type of function to be developed. This function must perform some type of calculation and incorporate the following concepts:
 * 
 * Two or more primitive variable types.
 * Two or more mathematical operators.
 * At least one relational or logical operator.
 * A type conversion using type casting.
 * At least two character escape sequences.
 */

public class MainMenu
{
    //just an exercise... the menus will be created using Swing later in the course...
    
    boolean enabled;
    boolean main;
    boolean Sub;
    
    public void Show()
    {
        if(enabled == true)
        {
            System.out.println("Main Menu");
            System.out.println("¯¯¯¯¯¯¯¯¯");
            System.out.println("1. Play");
            System.out.println("2. Options");
            System.out.println("3. Help");
            System.out.println("4. Quit");
        }
    }
    
}
