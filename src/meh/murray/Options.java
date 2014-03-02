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
    boolean sound; // Sound is on (true) or off (false)
    boolean score; // Score is tracked; on (true) or off (false)
    int matchSeconds = 4; //n seconds allowed to make a match (configurable)
    int tilePairs = 4; // 4 is the default, 8 tiles; 16 is the maximum, 32 tiles.
    
    
    public void Show(boolean enabled, String uname)
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
            System.out.println("Options Menu");
            System.out.println("__________________");
            System.out.println(welcome.options());
            System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
            System.out.println("1. Keep Score = On");
            System.out.println("2. Keep Score = Off (Practice)");
            System.out.println("3. Sound = On");
            System.out.println("4. Sound = Off");
            System.out.println("5. Set Timeout");
            System.out.println("6. Display Options");
            System.out.println("7. Main Menu");
            System.out.println("");
        }
        
        //Call the getMenuItem function
        User u = new User();
        switch (u.getUserInt("Select an option.\n (Enter a #)"))
        {
            case 1: setScoreOptions(true);
                    System.out.println("Keep Score: " + score);
                    break;
            case 2: setScoreOptions(false);
                    System.out.println("Keep Score: " + score);
                    break;
            case 3: setSoundOptions(true);
                    System.out.println("Soundtrack: " + sound);
                    break;
            case 4: setSoundOptions(false);
                    System.out.println("Soundtrack: " + sound);
                    break;
            case 5: matchSeconds = u.getUserInt("How many seconds?\n [3-10]");
                    System.out.println("Timeout: " + matchSeconds);
                    break;
            case 6: printOptions();
                    break;
            case 7: m.enabled = true; m.Show(uname);
            case 99:
                    System.out.println("Invalid selection.");
                    o.Show(enabled, uname);
            break;
            default: System.out.println("Invalid selection.");
                    o.Show(enabled, uname);
            break;
                
        }

        //Display the Options menu in a loop
        Exit answerExit = new Exit();
        
        do
        {
            Show(enabled, u.user);          
        }
        
        while (answerExit.getExit() == false);
        
    }
    
    public void setScoreOptions(boolean set)
    {
        score = set;
    }
    
    public void setSoundOptions(boolean set)
    {
        sound = set;
    }

    public void printOptions()
    {
        System.out.println("Keep Score: " + score);
        System.out.println("Soundtrack: " + sound);
        System.out.println("Timeout: " + matchSeconds);      
    }
    
}
