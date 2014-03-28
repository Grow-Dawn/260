/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package meh.murray;

import cit260.mehmurray.ascii.ASCII_Art;

/**
 *
 * @author Dawn
 */
public enum OptionsEnum
{
    
    optionsTitle ("Options Menu"),
    optionsUnderline ("__________________"),
    scoreOn (1, "Score Tracking On", true),
    scoreOff (2, "Score Tracking Off", false),
//    score,
    soundOn (3, "Sountrack On", true),
    soundOff (4, "Sountrack Off", true),
//    sound,
    timeoutOn (5, "Timeout On", false),
    matchSeconds (6, "Match second limit", 4),   
    matchPairs (7, "Number of matches", 4),  
    displayCfg (8, "Display Settings", false),
    mainMenu;
    
    String message;
    String config;
    int menuChoice;
    boolean booConfig;
    int intConfig;
    String menuNum;

    private OptionsEnum() {
       
    }   
    
    private OptionsEnum(int menuChoice, String message, boolean Config) {
        this.menuChoice = menuChoice;
        this.message = message;
    }  
    
    private OptionsEnum(int menuChoice, String message, int Config) {
        this.message = message;
    }      

    private OptionsEnum(String message) {
        this.message = message;
    }    
    
    private OptionsEnum(String message, String Config) {
        this.message = message;
    }    
    
    private OptionsEnum(String message, int intConfig) {
        this.message = message;
    }
    
    private OptionsEnum(String message, Boolean booConfig) {
        this.message = message;
    }
    
    public String getMessage() {
        return message;
    }
    
    public String getConfig() {
        return config;
    } 
    
    public void display() {
        System.out.println(this.message);
    }
  
    public int getMenuChoice() {
        return menuChoice;
    }     
    
    public boolean booConfig() {
        return booConfig;
    } 
    
    public int intConfig() {
        return intConfig;
    } 

    public String menuNum() {
        return menuNum;
    }     
    
}
