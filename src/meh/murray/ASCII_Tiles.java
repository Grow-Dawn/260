/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package meh.murray;

import java.util.Random;

/**
 *
 * @author PATRICKS, DG
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
            
 public void createTileArray(int numTiles)
 {
     arrTiles = new int[numTiles];
     arrTilesCount = new int[numTiles];
     int halfTiles = numTiles / 2;
     int c = 0;
     
     try
     {
         
         // First set of tiles
         for (int n = 0; n < (halfTiles); n++)
         {
             arrTiles[n] = randomTile2(halfTiles);
         }
         
         // Second set of tiles, using the first set as the source: X / Chiasmus style... Meet in the middle!
         int x = 0;
         for (int o = (numTiles - 1); o >= halfTiles; o--)
         {
             arrTiles[o] = arrTiles[x];
             x++;
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
    
    public String returnTile(int Tile)
    {
        String t = "!"; // Hello Class!
        
        switch (Tile)
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

