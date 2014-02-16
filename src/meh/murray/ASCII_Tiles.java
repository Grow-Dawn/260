/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package meh.murray;

/**
 *
 * @author PATRICKS
 */
public class ASCII_Tiles
{
    public String[] newTiles;
    public String[] Tiles;
    public boolean[] match;
    
    public String  tile0 = "exit";
    public String  tile1 = "♥";
    public boolean tile1match;
    public String  tile2 = "♦";
    public boolean tile2match;
    public String  tile3 = "♣";
    public boolean tile3match;
    public String  tile4 = "♠";
    public boolean tile4match;
    public String  tile5 = "♠";
    public boolean tile5match;
    public String  tile6 = "♣";
    public boolean tile6match;
    public String  tile7 = "♦";
    public boolean tile7match;
    public String  tile8 = "♥";
    public boolean tile8match;
    
 public void gblTile()    
 {
    Tiles[0] = tile0;
    Tiles[1] = tile1;
    Tiles[2] = tile2;
    Tiles[3] = tile3;
    Tiles[4] = tile4;
    Tiles[5] = tile5;
    Tiles[6] = tile6;
    Tiles[7] = tile7;
    Tiles[8] = tile8;
 }
 public void newTile(int firstTile, int lastTile)
 {
 
    for(int i = firstTile; i == lastTile; i++)
    {
        newTiles[i] = Tiles[i];
     
//    newTiles[0] = Tiles[0];
//    newTiles[1] = Tiles[1];
//    newTiles[2] = Tiles[2];
//    newTiles[3] = Tiles[3];
//    newTiles[4] = Tiles[4];
//    newTiles[5] = Tiles[5];
//    newTiles[6] = Tiles[6];
//    newTiles[7] = Tiles[7];
//    newTiles[8] = Tiles[8];
     
    }
 
 }
 
 public int randomTile(int intFirst, int intLast)
 {
     int newTile = (int)Math.random();
     return newTile;
 }
    
//1 + 8 = 9 
//2 + 7 = 9
//3 + 6 = 9
//4 + 5 = 9

 public void setMatch(int intTile, boolean TorF)
 {
     match[intTile] = TorF;
 }
 
}

