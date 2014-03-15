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
    private final static String title = "▇ ▇ ▅ ▄ ▁ m e h ▅ m u r r a y ▁ ▄ ▅ ▇";
    private final static String eq = "▇ ▅ █ ▅ ▇ ▂ ▃ ▁ ▁ ▅ ▃ ▅ ▅ ▄ ▅ ▇";
    private final static String hphones = "d[-_-]b";
    private final static String fish = "¸.·´¯`·.´¯`·.¸¸.·´¯`·.¸><(((º>";
    private final static String music = "¸¸♬·¯·♩¸¸♪·¯·♫¸¸";
    private final static String options = " _  _ |_. _  _  _\n" + "(_)|_)| |(_)| )_) \n" + "   |   ";
    private final static String  heart = "♥";
    private final static String  diamond = "♦";
    private final static String  clover = "♣";
    private final static String  spade = "♠";
    private final static String  sun = "☼";
    private final static String  eighth_note = "♪";
    private final static String  sixteenth_note = "♫";
    private final static String  sharp = "♯";
    private final static String  smiley_light = "☺";
    private final static String  smiley_dark = "☻";
    private final static String  triangle_up = "▲";
    private final static String  triangle_right = "►";
    private final static String  triangle_down = "▼";
    private final static String  triangle_left = "◄";
    private final static String  thing1 = "۞";
    private final static String  bullseye = "ʘ";
    
    public String getHeart() {
        return heart;
    }

    public String getDiamond() {
        return diamond;
    }

    public String getClover() {
        return clover;
    }

    public String getSpade() {
        return spade;
    }

    public String getSun() {
        return sun;
    }

    public String getEighth_note() {
        return eighth_note;
    }

    public String getSixteenth_note() {
        return sixteenth_note;
    }

    public String getSharp() {
        return sharp;
    }

    public String getSmiley_light() {
        return smiley_light;
    }

    public String getSmiley_dark() {
        return smiley_dark;
    }

    public String getTriangle_up() {
        return triangle_up;
    }

    public String getTriangle_right() {
        return triangle_right;
    }

    public String getTriangle_down() {
        return triangle_down;
    }

    public String getTriangle_left() {
        return triangle_left;
    }

    public String getThing1() {
        return thing1;
    }
    
    public String getBullseye() {
        return bullseye;
    }
        
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


    public String getEq() {
        return eq;
    }

    public String getHphones() {
        return hphones;
    }

    public String getFish() {
        return fish;
    }


    public String getMusic() {
        return music;
    }

    public String getOptions() {
        return options;
    }

    @Override
    public String toString() {
        return "ASCII_Art{" + "title=" + title + ", eq=" + eq + ", hphones=" + hphones + ", fish=" + fish + ", music=" + music + ", options=" + options + ", heart=" + heart + ", diamond=" + diamond + ", clover=" + clover + ", spade=" + spade + ", sun=" + sun + ", eighth_note=" + eighth_note + ", sixteenth_note=" + sixteenth_note + ", sharp=" + sharp + ", smiley_light=" + smiley_light + ", smiley_dark=" + smiley_dark + ", triangle_up=" + triangle_up + ", triangle_right=" + triangle_right + ", triangle_down=" + triangle_down + ", triangle_left=" + triangle_left + ", thing1=" + thing1 + ", bullseye=" + bullseye + '}';
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
        if (!Objects.equals(this.heart, other.heart)) {
            return false;
        }
        if (!Objects.equals(this.diamond, other.diamond)) {
            return false;
        }
        if (!Objects.equals(this.clover, other.clover)) {
            return false;
        }
        if (!Objects.equals(this.spade, other.spade)) {
            return false;
        }
        if (!Objects.equals(this.sun, other.sun)) {
            return false;
        }
        if (!Objects.equals(this.eighth_note, other.eighth_note)) {
            return false;
        }
        if (!Objects.equals(this.sixteenth_note, other.sixteenth_note)) {
            return false;
        }
        if (!Objects.equals(this.sharp, other.sharp)) {
            return false;
        }
        if (!Objects.equals(this.smiley_light, other.smiley_light)) {
            return false;
        }
        if (!Objects.equals(this.triangle_up, other.triangle_up)) {
            return false;
        }
        if (!Objects.equals(this.triangle_right, other.triangle_right)) {
            return false;
        }
        if (!Objects.equals(this.triangle_down, other.triangle_down)) {
            return false;
        }
        if (!Objects.equals(this.triangle_left, other.triangle_left)) {
            return false;
        }
        if (!Objects.equals(this.thing1, other.thing1)) {
            return false;
        }
        if (!Objects.equals(this.bullseye, other.bullseye)) {
            return false;
        }
        return true;
    }
   
}
