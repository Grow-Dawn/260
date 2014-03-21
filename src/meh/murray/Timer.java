/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//This class will be useless until the full GUI is up and running
package meh.murray;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author photos plus
 */
public class Timer implements Serializable{
    private int second;
    private Object[] seconds;

    /**
     *
     * @param s
     */
    public void setTime(int s){}
    
    public String clock() {
        return String.format("%02d", seconds);
        
    }

    public void setTime() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public Object[] getSeconds() {
        return seconds;
    }

    public void setSeconds(Object[] seconds) {
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return "Timer{" + "second=" + second + ", seconds=" + seconds + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.second;
        hash = 13 * hash + Arrays.deepHashCode(this.seconds);
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
        final Timer other = (Timer) obj;
        if (this.second != other.second) {
            return false;
        }
        if (!Arrays.deepEquals(this.seconds, other.seconds)) {
            return false;
        }
        return true;
    }
    
}
