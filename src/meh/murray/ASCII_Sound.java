/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package meh.murray;
import java.awt.*;
import java.io.Serializable;

/**
 *
 * @author PATRICKS
 */
public class ASCII_Sound extends ASCII_Art
{

    private boolean ring;
    
    public void RingBell()
    {
      Toolkit.getDefaultToolkit().beep();
    }

    public boolean isRing() {
        return ring;
    }

    public void setRing(boolean ring) {
        this.ring = ring;
    }

    @Override
    public String toString() {
        return "ASCII_Sound{" + "ring=" + ring + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final ASCII_Sound other = (ASCII_Sound) obj;
        if (this.ring != other.ring) {
            return false;
        }
        return true;
    }

    public ASCII_Sound(boolean ring) {
        this.ring = ring;
    }
    
}
