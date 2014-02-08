/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package meh.murray;

import java.util.Scanner;

/**
 *
 * @author PATRICKS
 * 
 */

public class User
{
    public String userIn;
    public String user;
    public boolean enabled;
    public String errMsg = "Invalid choice; please try again.";
    public int intErr = 99;
    public int intExit = 0;
    public String retVal;
    
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
    
}