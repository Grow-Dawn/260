/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package meh.murray;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author PATRICKS
 */
public class ASCII_Art implements Serializable
{
    // Variable declarations for javabeans class conversion
    private String title = "▇ ▇ ▅ ▄ ▁ m e h ▅ m u r r a y ▁ ▄ ▅ ▇";
    private String eq = "▇ ▅ █ ▅ ▇ ▂ ▃ ▁ ▁ ▅ ▃ ▅ ▅ ▄ ▅ ▇";
    private String hphones = "d[-_-]b";
    private String fish = "¸.·´¯`·.´¯`·.¸¸.·´¯`·.¸><(((º>";
    private String music = "¸¸♬·¯·♩¸¸♪·¯·♫¸¸";
    private String options = " _  _ |_. _  _  _\n" + "(_)|_)| |(_)| )_) \n" + "   |   ";
        
//    public String title()
//    {
//        return "▇ ▇ ▅ ▄ ▁ m e h ▅ m u r r a y ▁ ▄ ▅ ▇";
//    }
//    
//    public String eq()
//    {
//        return "▇ ▅ █ ▅ ▇ ▂ ▃ ▁ ▁ ▅ ▃ ▅ ▅ ▄ ▅ ▇";
//    }
//    
//    public String hphones()
//    {
//        return "d[-_-]b";
//    }
//    
//    public String fish()
//    {
//        return "¸.·´¯`·.´¯`·.¸¸.·´¯`·.¸><(((º>";
//    }
//    
//    public String music()
//    {
//        return "¸¸♬·¯·♩¸¸♪·¯·♫¸¸";
//    }
//    
//    public String options()
//    {
//         return " _  _ |_. _  _  _\n" +
//                 "(_)|_)| |(_)| )_) \n" +
//                 "   |   ";
//
//    }

    public ASCII_Art() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEq() {
        return eq;
    }

    public void setEq(String eq) {
        this.eq = eq;
    }

    public String getHphones() {
        return hphones;
    }

    public void setHpones(String hpones) {
        this.hphones = hpones;
    }

    public String getFish() {
        return fish;
    }

    public void setFish(String fish) {
        this.fish = fish;
    }

    public String getMusic() {
        return music;
    }

    public void setMusic(String music) {
        this.music = music;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return "ASCII_Art{" + "title=" + title + ", eq=" + eq + ", hphones=" + hphones + ", fish=" + fish + ", music=" + music + ", options=" + options + '}';
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
        final ASCII_Art other = (ASCII_Art) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.eq, other.eq)) {
            return false;
        }
        if (!Objects.equals(this.hphones, other.hphones)) {
            return false;
        }
        if (!Objects.equals(this.fish, other.fish)) {
            return false;
        }
        if (!Objects.equals(this.music, other.music)) {
            return false;
        }
        if (!Objects.equals(this.options, other.options)) {
            return false;
        }
        return true;
    }
    
}
