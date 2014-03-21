/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package meh.murray;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author PATRICKS
 * 
 */

public class User implements Serializable
{
    private String userIn;
    public String user;
    public boolean enabled;
    public String errMsg = "Invalid choice; please try again.";
    public int intErr = 99;
    public int intExit = 0;
    private String retVal;
    
    public int getUserInt(String msg2Usr)
    {
        Scanner getIn = new Scanner(System.in);
        System.out.println (msg2Usr);
        this.userIn = getIn.next();
        try
        {
            int retInt = Integer.valueOf(this.userIn).intValue();
            return retInt;
        }
        catch (Exception x)
        {
            return intErr;
        }
    }
    
    public String getInput(String msg2Usr, boolean crlf, String dataType)
    {
        Scanner getIn = new Scanner(System.in);
        System.out.println (msg2Usr);
        this.userIn = getIn.next();
        
//        //Validate user input vs. specified dataType
//        switch (this.userIn.toUpperCase())
//        {
//            case "STRING":
//                    retVal = this.userIn;
//                    break;
//            case "INT":
//                    try
//                    {
//                        int retInt = Integer.valueOf(userIn).intValue();
//                        retVal = this.userIn;
//                    }
//                    catch (Exception x)
//                    {
//                        retVal = errMsg;
//                    }
//                    break;
//            case "DOUBLE":
//                    try
//                    {
//                        double retDbl = Double.valueOf(userIn).doubleValue();
//                        retVal = this.userIn;
//                    }
//                    catch (Exception x)
//                    {
//                        retVal = errMsg;
//                    }
//                    break;
//            case "FLOAT":
//                    try
//                    {
//                        float retFlt = Float.valueOf(userIn).floatValue();
//                        retVal = this.userIn;
//                    }
//                    catch (Exception x)
//                    {
//                        retVal = errMsg;
//                    }
//                    break;
//            case "BOOLEAN":
//                    try
//                    {
//                        boolean retBoo = Boolean.valueOf(userIn).booleanValue();
//                        retVal = this.userIn;
//                    }
//                    catch (Exception x)
//                    {
//                        retVal = errMsg;
//                    }
//                    break;
//        }
                
        //Print/Echo a new line, "crlf" 13,10 if specified via function argument.
        if (crlf)
        {
           retVal = this.userIn + "\n"; 
        }
        else
        {
            retVal = this.userIn;
        }
        
        //Return value
        return retVal;
        
    }

    public String getUserIn() {
        return userIn;
    }

    public void setUserIn(String userIn) {
        this.userIn = userIn;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public int getIntErr() {
        return intErr;
    }

    public void setIntErr(int intErr) {
        this.intErr = intErr;
    }

    public int getIntExit() {
        return intExit;
    }

    public void setIntExit(int intExit) {
        this.intExit = intExit;
    }

    public String getRetVal() {
        return retVal;
    }

    public void setRetVal(String retVal) {
        this.retVal = retVal;
    }

    @Override
    public String toString() {
        return "User{" + "userIn=" + userIn + ", user=" + user + ", enabled=" + enabled + ", errMsg=" + errMsg + ", intErr=" + intErr + ", intExit=" + intExit + ", retVal=" + retVal + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.userIn);
        hash = 97 * hash + Objects.hashCode(this.user);
        hash = 97 * hash + (this.enabled ? 1 : 0);
        hash = 97 * hash + Objects.hashCode(this.errMsg);
        hash = 97 * hash + this.intErr;
        hash = 97 * hash + Objects.hashCode(this.retVal);
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
        final User other = (User) obj;
        if (!Objects.equals(this.userIn, other.userIn)) {
            return false;
        }
        if (!Objects.equals(this.user, other.user)) {
            return false;
        }
        if (this.enabled != other.enabled) {
            return false;
        }
        if (!Objects.equals(this.errMsg, other.errMsg)) {
            return false;
        }
        if (this.intErr != other.intErr) {
            return false;
        }
        if (this.intExit != other.intExit) {
            return false;
        }
        if (!Objects.equals(this.retVal, other.retVal)) {
            return false;
        }
        return true;
    }
    
}