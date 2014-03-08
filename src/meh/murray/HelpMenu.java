/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package meh.murray;

import java.io.Serializable;
import java.util.Objects;
/**
 *
 * @author patricks (and now Dawn)
 */
public class HelpMenu implements Serializable {
    private boolean enabled;
    private boolean main;
    private boolean Sub;
    private String instructions = "\n" + "How to Play:" + "\n"
                    + "A player tries to match tiles.\n"
                    + "If the tiles chosen match, they will disappear.\n"
                    + "Find all 8 matches before time runs out.\n";
    
    public void Show(boolean enabled)
    {
        if(enabled)
        {
            System.out.println(instructions);
        }
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isMain() {
        return main;
    }

    public void setMain(boolean main) {
        this.main = main;
    }

    public boolean isSub() {
        return Sub;
    }

    public void setSub(boolean Sub) {
        this.Sub = Sub;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    @Override
    public String toString() {
        return "HelpMenu{" + "enabled=" + enabled + ", main=" + main + ", Sub=" + Sub + ", instructions=" + instructions + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + (this.enabled ? 1 : 0);
        hash = 71 * hash + (this.main ? 1 : 0);
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
        final HelpMenu other = (HelpMenu) obj;
        if (this.enabled != other.enabled) {
            return false;
        }
        if (this.main != other.main) {
            return false;
        }
        if (!Objects.equals(this.instructions, other.instructions)) {
            return false;
        }
        return true;
    }

    
    
}
