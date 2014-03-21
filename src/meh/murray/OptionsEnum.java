/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package meh.murray;

/**
 *
 * @author Dawn
 */
public enum OptionsEnum {
    setScoreOptions("Keep Score: " + score),
    setScoreOptions("Keep Score: " + score),
    setSoundOptions("Soundtrack: " + sound),
    setSoundOptions("Soundtrack: " + sound),
    matchSeconds("How many match pairs?\n [4]");
    String message;
    
    private OptionsEnum(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
    public void display() {
        System.out.println(this.message);
    }
}
