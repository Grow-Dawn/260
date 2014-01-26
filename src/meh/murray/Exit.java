/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package meh.murray;

import java.util.Scanner;

/**
 *
 * @author Dawn Grow
 */
public class Exit {
    private String getExit;
    public void getExit(){
        
        Scanner answer = new Scanner(System.in);
        System.out.println("Are you sure you want to exit game?");
        this.name = input.next();
       
        if (getExit == "no")
            System.out.println("Continue");
        else 
            System.out.println("Close game");
}
}
