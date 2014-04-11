/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.mehmurray.ascii;

import cit260.mehmurray.ascii.ASCII_Art;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

/**
 *
 * @author PATRICKS, DG
 */
public class ASCII_Tiles extends ASCII_Art
{
    //Variables specific to this class
    private int[] arrTiles;
    private int tilePairs = 4; //Number of tile pairs - 4 by default (8 tiles); up to 8 pairs (16 tiles).
    private int intTiles = tilePairs * 2; //Default number of tiles, 32 is the limit
    
    // Inherited variables define tile assignments
    // Tile character assignments; randomly selecting Unicode characters directly = phase 2
    
    private String  tile0 = "!"; //getHeart(); // Call inherited get function
    private String  tile1 = "#"; //getDiamond(); // Call inherited get function
    private String  tile2 = "%"; //getClover(); // Call inherited get function
    private String  tile3 = "$"; //getSpade(); // Call inherited get function
    private String  tile4 = "@"; //getSun(); // Call inherited get function
    private String  tile5 = "*"; //getEighth_note(); // Call inherited get function
    private String  tile6 = "^"; //getSixteenth_note(); // Call inherited get function
    private String  tile7 = "&"; //getSharp(); // Call inherited get function
    private String  tile8 = "?"; //getSmiley_light(); // Call inherited get function
    private String  tile9 = "{"; //getSmiley_dark(); // Call inherited get function
    private String  tile10 = "}"; //getTriangle_up(); // Call inherited get function
    private String  tile11 = "<"; //getTriangle_right(); // Call inherited get function
    private String  tile12 = ">"; //getTriangle_down(); // Call inherited get function
    private String  tile13 = "~"; //getTriangle_left(); // Call inherited get function
    private String  tile14 = "+"; //getThing1(); // Call inherited get function
    private String  tile15 = "="; //getBullseye(); // Call inherited get function
    
    // Put the tiles into a 1D array
    private String [] arrTileChars = {tile0, tile1, tile2, tile3, tile4, tile5, tile6, tile7, tile8, tile9, tile10, tile11, tile12, tile13, tile14, tile15};
    private int [] arrTilesCount;
    
    public ASCII_Tiles()
    {
        super(true);
    }
            
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
 
 public int[] createTileArray2(int numTiles)
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
     
     return (arrTiles);
 }

 public int[] createTileArrays1(int numTiles)
 {
     arrTiles = new int[numTiles];
     arrTilesCount = new int[numTiles];

     int c = 0;
     
     try
     {
         
         // First set of tiles
         for (int n = 0; n < (numTiles); n++)
         {
             arrTiles[n] = randomTile2(numTiles);
         }
         
     }
     catch (Exception x)
     {
         System.out.println("Error: " + x + "\n");
     }
     
     return (arrTiles);
 }
 
  public int[] createTileArrays2(int numTiles)
 {
     arrTiles = new int[numTiles];
     arrTilesCount = new int[numTiles];

     int c = 0;
     
     try
     {
         
         // Second set of tiles, using the first set as the source: X / Chiasmus style... Meet in the middle!
         int x = 0;
         for (int o = (numTiles - 1); o >= numTiles; o--)
         {
             arrTiles[o] = arrTiles[x];
             x++;
         }
     }
     catch (Exception x)
     {
         System.out.println("Error 2: " + x + "\n");
     }
     
     return (arrTiles);
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
       try {
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
       catch(Exception x)
        {
            System.out.println("You need to choose a tile between 1 and 16,");
            System.out.println("Please choose another tile.");
        }
       
       return t;
       
    }
    
    
    public String returnTile2(int Tile)
    {
        return arrTileChars[Tile];
    }

    public int[] getArrTiles() {
        return arrTiles;
    }
    
    // Overload 1 - Get individual field
    public int getArrTiles(int Tile) {
        return arrTiles[Tile];
    }

    public void setArrTiles(int[] arrTiles) {
        this.arrTiles = arrTiles;
    }

    public int getTilePairs() {
        return tilePairs;
    }

    public void setTilePairs(int tilePairs) {
        this.tilePairs = tilePairs;
    }

    public int getIntTiles() {
        return intTiles;
    }

    public void setIntTiles(int intTiles) {
        this.intTiles = intTiles;
    }

    public String getTile0() {
        return tile0;
    }

    public void setTile0(String tile0) {
        this.tile0 = tile0;
    }

    public String getTile1() {
        return tile1;
    }

    public void setTile1(String tile1) {
        this.tile1 = tile1;
    }

    public String getTile2() {
        return tile2;
    }

    public void setTile2(String tile2) {
        this.tile2 = tile2;
    }

    public String getTile3() {
        return tile3;
    }

    public void setTile3(String tile3) {
        this.tile3 = tile3;
    }

    public String getTile4() {
        return tile4;
    }

    public void setTile4(String tile4) {
        this.tile4 = tile4;
    }

    public String getTile5() {
        return tile5;
    }

    public void setTile5(String tile5) {
        this.tile5 = tile5;
    }

    public String getTile6() {
        return tile6;
    }

    public void setTile6(String tile6) {
        this.tile6 = tile6;
    }

    public String getTile7() {
        return tile7;
    }

    public void setTile7(String tile7) {
        this.tile7 = tile7;
    }

    public String getTile8() {
        return tile8;
    }

    public void setTile8(String tile8) {
        this.tile8 = tile8;
    }

    public String getTile9() {
        return tile9;
    }

    public void setTile9(String tile9) {
        this.tile9 = tile9;
    }

    public String getTile10() {
        return tile10;
    }

    public void setTile10(String tile10) {
        this.tile10 = tile10;
    }

    public String getTile11() {
        return tile11;
    }

    public void setTile11(String tile11) {
        this.tile11 = tile11;
    }

    public String getTile12() {
        return tile12;
    }

    public void setTile12(String tile12) {
        this.tile12 = tile12;
    }

    public String getTile13() {
        return tile13;
    }

    public void setTile13(String tile13) {
        this.tile13 = tile13;
    }

    public String getTile14() {
        return tile14;
    }

    public void setTile14(String tile14) {
        this.tile14 = tile14;
    }

    public String getTile15() {
        return tile15;
    }

    public void setTile15(String tile15) {
        this.tile15 = tile15;
    }

    public String[] getArrTileChars() {
        return arrTileChars;
    }

    public void setArrTileChars(String[] arrTileChars) {
        this.arrTileChars = arrTileChars;
    }

    public int[] getArrTilesCount() {
        return arrTilesCount;
    }

    public void setArrTilesCount(int[] arrTilesCount) {
        this.arrTilesCount = arrTilesCount;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ASCII_Tiles other = (ASCII_Tiles) obj;
        if (!Arrays.equals(this.arrTiles, other.arrTiles)) {
            return false;
        }
        if (this.tilePairs != other.tilePairs) {
            return false;
        }
        if (this.intTiles != other.intTiles) {
            return false;
        }
        if (!Objects.equals(this.tile0, other.tile0)) {
            return false;
        }
        if (!Objects.equals(this.tile1, other.tile1)) {
            return false;
        }
        if (!Objects.equals(this.tile2, other.tile2)) {
            return false;
        }
        if (!Objects.equals(this.tile3, other.tile3)) {
            return false;
        }
        if (!Objects.equals(this.tile4, other.tile4)) {
            return false;
        }
        if (!Objects.equals(this.tile5, other.tile5)) {
            return false;
        }
        if (!Objects.equals(this.tile6, other.tile6)) {
            return false;
        }
        if (!Objects.equals(this.tile7, other.tile7)) {
            return false;
        }
        if (!Objects.equals(this.tile8, other.tile8)) {
            return false;
        }
        if (!Objects.equals(this.tile9, other.tile9)) {
            return false;
        }
        if (!Objects.equals(this.tile10, other.tile10)) {
            return false;
        }
        if (!Objects.equals(this.tile11, other.tile11)) {
            return false;
        }
        if (!Objects.equals(this.tile12, other.tile12)) {
            return false;
        }
        if (!Objects.equals(this.tile13, other.tile13)) {
            return false;
        }
        if (!Objects.equals(this.tile15, other.tile15)) {
            return false;
        }
        if (!Arrays.deepEquals(this.arrTileChars, other.arrTileChars)) {
            return false;
        }
        if (!Arrays.equals(this.arrTilesCount, other.arrTilesCount)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ASCII_Tiles{" + "arrTiles=" + arrTiles + ", tilePairs=" + tilePairs + ", intTiles=" + intTiles + ", tile0=" + tile0 + ", tile1=" + tile1 + ", tile2=" + tile2 + ", tile3=" + tile3 + ", tile4=" + tile4 + ", tile5=" + tile5 + ", tile6=" + tile6 + ", tile7=" + tile7 + ", tile8=" + tile8 + ", tile9=" + tile9 + ", tile10=" + tile10 + ", tile11=" + tile11 + ", tile12=" + tile12 + ", tile13=" + tile13 + ", tile14=" + tile14 + ", tile15=" + tile15 + ", arrTileChars=" + arrTileChars + ", arrTilesCount=" + arrTilesCount + '}';
    }
 
    
    
}

