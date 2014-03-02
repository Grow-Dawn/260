/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package meh.murray;

/**
 *
 * @author Dawn Grow, PBS
 * 
 */
public class Score {
 //private String getScore;
    boolean match[]; // = new boolean[8];
    boolean matchCopy[]; // = new boolean[8];
    int match2[][]; // = new int[8][8];
    int matchCopy2[][]; // = new int[8][8];
    int matchTile[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32};
    int misses[]; // = new int[8];
    int missesCopy[]; // = new int[8];
    int missTile[]; // = new int[8];
    int matches[]; // = new int[8];
    int countMatches = 0;
    Options o = new Options();
    
    public void Show()
    {
        System.out.println("Scores:\n");
        
        matches = new int[o.tilePairs * 2];
        
        for (int m : matches)
        {
            System.out.println(m);
        }
        
        System.out.println("");
        
    }
    
    public void getScore(int losses)
    {
        int tally;
        tally = 0;
        //Instantiate classes
       /* ASCII_Sound beep = new ASCII_Sound();
        ASCII_Art welcome = new ASCII_Art();
        Options o = new Options();
        MainMenu m = new MainMenu();
        PlayMenu p = new PlayMenu();
        HelpMenu h = new HelpMenu();*/
        
        /*int tries = (int)(10 * Math.random()), timer = (int)(10 * Math.random()), finalScore, underScore, topScore;
		finalScore = tries * timer;
                //System.out.println(tries.ToString() + "\n" + timer.ToString());
                String scoreMsg = "\"Great Score!!!\"";
        System.out.println("\"Your score is " + finalScore + "\"");
		if(finalScore  == 0 || finalScore < 300){
            //System.out.println("\"You are awesome!\"");
             scoreMsg = "\n" + "\"You are awesome!\"";
            }
        else if (finalScore == 300 || finalScore <600) {
            //System.out.println("\"That was great!  Good job!\"");
            scoreMsg = "\n"+ "\"That was great!  Good job!\"";
            }
        else if (finalScore == 600 || finalScore <900){
            //System.out.println("\"You did well!\"");
            scoreMsg = "\"You did well!\"";
           }
        else {
            //System.out.println("\"That was good but I know you can do better!\"");
            scoreMsg = "\"That was good but I know you can do better!\"";
        
        topScore = 200;
	underScore = topScore - finalScore;
        scoreMsg = "\"Your score is " + underScore + " points under the best score!\"";
	//System.out.println("\"Your score is " + underScore + " points under the best score!\"");
        return scoreMsg;
	}
        return scoreMsg;*/
        
        //PlayMenu answerLoss = new PlayMenu();
        
        //answerLoss.Show(losses);
        //m.Show(losses);
        
        tally = losses *5;
        // timer will input the time to be tallied in also later
        System.out.println("Your score is " + tally);
    }
    
    // Sort method borrowed from assigned reading
    public static void sortNumBubble(int[] num)
    {
        int j;
        boolean flag = true;   // set flag to true to begin first pass
        int temp;   //holding variable

        while(flag)
        {
            flag = false;    //set flag to false awaiting a possible swap
            for(j = 0;  j < num.length -1;  j++ )
            {
                   if(num[j] < num[j + 1])   // change to > for ascending sort
                   {
                           temp = num[j];                //swap elements
                           num[j] = num[j + 1];
                           num[j + 1] = temp;
                           flag = true;              //shows a swap occurred  
                   } 
            } 
        } 
    }
    
    // This method copies boolean arrays
    public static void copyArrBoo(boolean bool1[], boolean bool2[])
    {
        int c = 0;
       
        try
            {
                for( boolean b : bool1)
                {
                    bool2[c] = b;
                    c++;
                }
            }
            catch (Exception x)
            {
                System.out.println("Oops!\n" + x);
            }
    }
    
    // This method copies integer arrays
    public static void copyArrInt(int Int1[], int Int2[])
    {
        int c = 0;
       
        try
            {
                for( int b : Int1)
                {
                    Int2[c] = b;
                    c++;
                }
            }
            catch (Exception x)
            {
                System.out.println("Oops!\n" + x);
            }
    }
    
    // This method copies integer arrays
    public int copyArr2Int(int Int1[][], int Int2[][])
    {
        try
        {
            for(int a = 0; a < Int1.length; a++)
            {
            Int2[a][a] = Int1[a][a];
            }
            return 1;
        }
        catch (Exception x)
        {
            return 2;
        }
    }
    
    // This is the Bubble sort.
    public static void sortBubbleBoo(boolean boo[])
    {
        
        boolean t, x = true;
        int size = boo.length;
        
        try
        {
        for(int a = 1; a < size; a++)
        {
            for (int b = (size - 1); b >= a; b--)
            {
                if (boo[b - 1] != x)
                {
                    t = boo[b - 1];
                    boo[b - 1] = boo[b];
                    boo[b] = t;                    
                }
            }

        }
        
        System.out.println("First: " + boo[0]);
        System.out.println("Last: " + boo[boo.length - 1]);
        
        }
        catch(Exception z)
        {
            System.out.println("Oops!\n" + z);
        }
    }
   
    
    /**
    *
    * @author Patrick Stamps
    * 
    */
    
//    public int attempts;
//    public int attemptTime;
//    public int playerScore;
//    public String playerMsg = "Your score is ";
//    public String finalScore;
//    public String underScore;
//    public int highScore;
//        
//    public String CalcScore(int attemptTime)
//    {
//        finalScore = attempts * attemptTime;
//        playerScore = 0;
//        return playerMsg;
//        
//    }
    
}		
		/*classname.membervariable 
		try appending .ToString() at the end*/
