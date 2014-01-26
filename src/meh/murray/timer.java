/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package meh.murray;

/**
 *
 * @author photos plus
 */
public class timer {
    private int second;
    private Object[] seconds;

    /**
     *
     * @param s
     */
    public void setTime(int s);
    
    public String clock() {
        return String.format("%02d", seconds);
        
    }

    void setTime() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
