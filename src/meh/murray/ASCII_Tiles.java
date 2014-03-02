/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package meh.murray;

import java.util.Random;

/**
 *
 * @author PATRICKS
 */
public class ASCII_Tiles
{
    int[] arrTiles;
    int tilePairs = 4; //Number of tile pairs - 4 by default (8 tiles); up to 8 pairs (16 tiles).
    int intTiles = 8; //Default number of tiles, 32 is the limit
    
    // Tile character assignments; randomly selecting Unicode characters directly = phase 2
    String  tile0 = "♥";
    String  tile1 = "♦";
    String  tile2 = "♣";
    String  tile3 = "♠";
    String  tile4 = "☼";
    String  tile5 = "♪";
    String  tile6 = "♫";
    String  tile7 = "♯";
    String  tile8 = "☺";
    String  tile9 = "☻";
    String  tile10 = "▲";
    String  tile11 = "►";
    String  tile12 = "▼";
    String  tile13 = "◄";
    String  tile14 = "۞";
    String  tile15 = "ʘ";
    
    // Put the tiles into a 1D array
    String [] arrTileChars = {tile0, tile1, tile2, tile3, tile4, tile5, tile6, tile7, tile8, tile9, tile10, tile11, tile12, tile13, tile14, tile15};
    int [] arrTilesCount; 
            
    //Arrays for Pair1 and Pair2; the second guess must be the user's guess minus tilePairs.
    String [] pairOne = new String [tilePairs];
    String pairTwo [] = new String [tilePairs];
    int pairIndex [] = new int [tilePairs];

 public void createTileArray(int numTiles)
 {
     arrTiles = new int[numTiles];
     arrTilesCount = new int[numTiles];
     int halfTiles = numTiles / 2;
     int c = 0;
     
     try
     {
//        for (int n : arrTiles)
//        {
//            arrTiles[c] = randomTile2(numTiles);
//            //System.out.println(returnTile(c));
//            System.out.println(returnTile2(arrTiles[c]));
//            c++;
//        }
         
         // First set of tiles
         for (int n = 0; n < (halfTiles); n++)
         {
             arrTiles[n] = randomTile2(halfTiles);
             //System.out.println(returnTile2(arrTiles[n]));
         }
         
         // Second set of tiles, using the first set as the source: X / Chiasmus style... Meet in the middle!
         int x = 0;
         for (int o = (numTiles - 1); o >= halfTiles; o--)
         {
             arrTiles[o] = arrTiles[x];
             x++;
             //System.out.println(returnTile2(arrTiles[o]));
         }
     }
     catch (Exception x)
     {
         System.out.println("Error: " + x + "\n");
     }
     
 }
    
 public int randomTile2(int maxNum)
 {
    Random r = new Random();
    int rg = 0; // Initialize random generated number
    int rc = 0; // Initialize random count
    int rm = 2; // Declare and set random count max (1 pair = 2)
    boolean pass = false;
    int returnRandom = 0;
    
    do
    {
        rg = r.nextInt(maxNum); // Generate new random number
        rc = arrTilesCount[rg]; // Get the value of the index array for the new random number; this tells us if it's been used before, and how many times.
        if (rc < rm)
        {
            arrTilesCount[rg] = arrTilesCount[rg] + 1;
            returnRandom = rg;
            pass = true;
        }
        else
        {
            pass = false;
        }
        
    }
    while (pass = false);
    
    return returnRandom;
 }

 public void createTileArrays(int numTiles)
 {  
        //int rr = Integer.valueOf(String.valueOf(r), 16);
        //return Character.toString((char)rand.nextInt(r));
        //return Character.toString((char)rr);        
        
        // Populate pairOne[]
        for (int a = 0; a < numTiles - 1; a++)
        {
            try
            {
                pairOne[a] = randomTile(a);
                System.out.println(pairOne[a]);
            }
            catch (Exception x)
            {
                //a--;
            }
               
        }
        
        // Populate pairTwo[]
        for (int a = 0; a < numTiles; a++)
        {
            try
            {
                pairTwo[a] = randomTile(a);
                System.out.println(pairTwo[a]);
            }
            catch (Exception x)
            {
                //a--;
            }
               
        }
        
        System.out.println("Ready to play!\n");
 }

 public String randomTile(int a)
 {
    Random rand = new Random(); int r; String rr;
    boolean booFound = false;
    boolean booPass = false;
    int passes = 0;
    // Check generated value for duplicates/previously generated numbers
    do
    {  
        r = rand.nextInt(tilePairs - 1);
    
        for (int p : pairIndex)
        {
            if (r == p)
            {
                booFound = true;
            }
            else
            {
                booFound = false;              
            }
        }
        
        if (!booFound)
        {
            booPass = true;
        }
        else
        {
            if (passes > pairIndex.length - 1)
            {
                System.out.println("Not found...");
                booPass = true;
            }
        }

        passes++;
        
    }
    while (booPass == false);
            
        switch (r)
        {
            case 0: rr = tile0; pairIndex[a] = 0; break;
            case 1: rr = tile1; pairIndex[a] = 1; break;
            case 2: rr = tile2; pairIndex[a] = 2; break;
            case 3: rr = tile3; pairIndex[a] = 3; break;
            case 4: rr = tile4; pairIndex[a] = 4; break;                
            case 5: rr = tile5; pairIndex[a] = 5; break;
            case 6: rr = tile6; pairIndex[a] = 6; break;
            case 7: rr = tile7; pairIndex[a] = 7; break;
            case 8: rr = tile8; pairIndex[a] = 8; break;
            case 9: rr = tile9; pairIndex[a] = 9; break;
            case 10: rr = tile10; pairIndex[a] = 10; break;
            case 11: rr = tile11; pairIndex[a] = 11; break;
            case 12: rr = tile12; pairIndex[a] = 12; break;                
            case 13: rr = tile13; pairIndex[a] = 13; break;
            case 14: rr = tile14; pairIndex[a] = 14; break;
            case 15: rr = tile15; pairIndex[a] = 15; break;
            default: rr = "exit";
        }
        return rr;
 }
 
    public void printTiles(String arrTiles[])
    {
        for (String a : arrTiles)
        {   
            System.out.println(a);
        }   
     }
    
    public String returnTile(int Tile)
    {
        String t = "!";
        
        switch ((Tile))
        {
            case 0: t = tile0; break;
            case 1: t = tile1; break;
            case 2: t = tile2; break;
            case 3: t = tile3; break;
            case 4: t = tile4; break;                
            case 5: t = tile5; break;
            case 6: t = tile6; break;
            case 7: t = tile7; break;
            case 8: t = tile8; break;
            case 9: t = tile9; break;
            case 10: t = tile10; break;
            case 11: t = tile11; break;
            case 12: t = tile12; break;                
            case 13: t = tile13; break;
            case 14: t = tile14; break;
            case 15: t = tile15; break;
            default: t = "exit";
        }
        return t;
    }
    
    public String returnTile2(int Tile)
    {
        return arrTileChars[Tile];
    }
 
}

