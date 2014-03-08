/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package meh.murray;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author Dawn Grow
 */
public class Exit {
    private String name;
    private String getEx;
    private boolean exit;

        public boolean getExit(){
    
            User ex = new User();
            getEx = (ex.getInput("Quit? y/n [y]", false, "String").toUpperCase());
    
            if ("N".equals(getEx))
            {
                System.out.println("Pull up a chair and stay a while...\n");
                try
                {
                    Process p = Runtime.getRuntime().exec("cls");
                }
                catch (IOException x)
                {
                    // Ignore if the screen doesn't clear - oh well!
                }
    
                return false;
            }
            else
            {
                System.out.println("Buh-bye!\n");
                System.exit(0);
            }
    
            return false;
    
        }
        
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGetEx() {
        return getEx;
    }

    public void setGetEx(String getEx) {
        this.getEx = getEx;
    }

    public boolean isExit() {
        return exit;
    }

    public void setExit(boolean exit) {
        this.exit = exit;
    }

    @Override
    public String toString() {
        return "Exit{" + "name=" + name + ", getEx=" + getEx + ", exit=" + exit + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Exit other = (Exit) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.getEx, other.getEx)) {
            return false;
        }
        if (this.exit != other.exit) {
            return false;
        }
        return true;
    }
    
}
